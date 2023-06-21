
package tutiioncentrebooking;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class TutiionCentreBooking {


    /*
    * Main mathod of the class
    */
    public static void main(String[] args) {
        int choiceInput = mainMenu();
        
        while (choiceInput != 7) {
            switch (choiceInput)
            {
                case 1 -> checkSlotsAndMakeReservation();
                case 2 -> updateReservation();
                case 3 -> cancelBooking();
                case 4 -> viewReservation();
                case 5 -> giveFeedback();
                case 6 -> viewReports();
                case 7 -> System.exit(0);
                default -> System.out.println("\nError : Your selected choice is not correct\n");
            }
            choiceInput = mainMenu();
        }
    }
    
    
    /*
    * Main Menu of the class
    */
    public static int mainMenu(){
        System.out.println("\nSelect a Choice to perform a specific functionality : ");
        System.out.println("1. View Lesson Slots");
        System.out.println("2. Update Reservation Details ");
        System.out.println("3. Cancel a Reservation ");
        System.out.println("4. View Students Reservation ");
        System.out.println("5. Give a Feedback for Lesson");
        System.out.println("6. Reports");
        System.out.println("7. Exit System");

        String studentChoice  = "";

        while (true) {
            System.out.print("\nEnter Your Choice :  ");
            studentChoice = Constants.studentInput.nextLine();
            if (studentChoice.isEmpty()) {
                System.out.println("\nError : You have to select an option ");
            } else if (!isValidChoice(studentChoice)) {
                System.out.println("\nError : Your Choice must be a valid integer ");
            } else {
                break;
            }
        }
        return Integer.parseInt(studentChoice);
    }

        
    /*
    * Method to check whether the choice is valid or not
    */    
    public static boolean isValidChoice(String choice) {
        for (char c : choice.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    
    /*
    * Method to check slots, apply filter and make reservation
    */
    public static void checkSlotsAndMakeReservation(){
                
        int menu_option = filterMenu();
        
        while (menu_option != 3) {
            switch (menu_option)
            {
                case 1 -> filterSubjects();
                case 2 -> filterTutors();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Error : Enter Valid Choice");
            }
            menu_option = filterMenu();
        }
    }
    
    
    /*
    * Method to display Filter Slots Menu
    */
    private static int filterMenu(){
        System.out.println("\nSelect a Choice to filter slots : ");
        System.out.println("1. Filter On Subjects");
        System.out.println("2. Filter On Tutors ");        
        System.out.println("3. Return Back");
        
        String studentChoice  = "";
        
        /* Validation for Menu Options */
        while (true) {
            System.out.print("\nEnter Your Choice : ");
            studentChoice = Constants.studentInput.nextLine();
            if (studentChoice.isEmpty()) {
                System.out.println("\nError : You have to select an option ");
            } else if (!isValidChoice(studentChoice)) {
                System.out.println("\nError : Your Choice must be a valid integer");
            } else {
                break;
            }
        }
        return Integer.parseInt(studentChoice);
    }
    
    /*
    * Method to apply subject filter on slots
    */
    public static void filterSubjects(){
        FilterFactory filterFactoryObj = new FilterFactory();
        Filter filterData = filterFactoryObj.createFilterType("subject");
        filterData.applyFilter();
    }
    
    
    /*
    * Method to apply tutor filter on slots
    */
    public static void filterTutors(){
        FilterFactory filterFactoryObj = new FilterFactory();
        Filter filterData = filterFactoryObj.createFilterType("tutor");
        filterData.applyFilter();
    }
    
    
    /*
    * Method to display slots according to selected subject and make reservation
    */
    public static void subjectSlots(String selectedSubject){
        List<Slots> slots = Slots.getSlots();
        Map<String, Integer> map = new LinkedHashMap<>();
        System.out.println("\n");
        System.out.println("==============================================================================================================================================================================================================================================================================");
        System.out.printf("%-10s %-13s %-30s %-15s %-20s %-20s %-20s %-20s %-20s %-20s  %-30s %n", "S.No.","WeekNumber","Subject","Fees", "Taught By", 
                 "Start At", "End At","Duration", "WeekDay","Date","Availability");
        System.out.println("==============================================================================================================================================================================================================================================================================");
        System.out.println();
        int increment = 1;
        String subjectCounter = "";
        for(int i=0; i<slots.size(); i++){   
            if(slots.get(i).getSubject().getSubName().equalsIgnoreCase(selectedSubject)){
                subjectCounter = String.valueOf(increment);
                System.out.printf("%-10s %-13s %-30s $%-15s %-20s %-20s %-20s %-20s %-20s %-20s  %-30s  %n%n", increment, "Week-"+slots.get(i).getWeekNum(),
                        slots.get(i).getSubject().getSubName(), 
                        slots.get(i).getSubject().getFees(),
                        slots.get(i).getTutor().getName(),
                        slots.get(i).getStartAt(), slots.get(i).getEndAt(),slots.get(i).getDuration(),
                        slots.get(i).getWeekDay(),slots.get(i).getWeekDate(),slots.get(i).getIsAvailable());
                map.put(subjectCounter, slots.get(i).getSlotId());
                increment = increment + 1;
            }
        }
       
        //Make Reservation
        System.out.println("==============================================================================================================================================================================================================================================================================");
        System.out.print("\nDo you want to reserve any slot from above menu (Y/N) : ");
        
        String choice = Constants.studentInput.nextLine();
        
        if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("Yes")){
            
            System.out.print("\nChoose any Option from above menu to make a reservation : ");

            try{
                String choicenum = Constants.studentInput.nextLine();

                Set<String> keyset = map.keySet();
                int isvalid = 0;
                for (String key : keyset) {
                    if (key.equalsIgnoreCase(choicenum)) {
                       isvalid++;
                    }
                }

                if (isvalid != 0) {
                    int mapIndex = map.get(choicenum);
                    
                    for(int i=0; i<slots.size(); i++){

                       if(slots.get(i).getSlotId() == mapIndex){

                            String reservationNo = randomReservatioNumber(); 
                            String reservationBy = getReservationBy();
                            if(reservationBy.equalsIgnoreCase("")){
                                return;
                            }
                            int weekNo = slots.get(i).getWeekNum();
                            int slotId = slots.get(i).getSlotId();
                            String tutorName = slots.get(i).getTutor().getName();
                            String fees = slots.get(i).getSubject().getFees();
                            String reservedFor = slots.get(i).getSubject().getSubName();
                            String reservationStatus = Constants.BOOK;

                            Reservations obj = new Reservations(reservationNo,weekNo,slotId,tutorName,fees,reservedFor,reservationStatus,reservationBy);
                            Reservations.reservationList.add(obj);

                            System.out.println("\n=================================================================================");
                            System.out.println("\nReservation Completed against Reservation Number : "+reservationNo);

                            System.out.println("\nReservation Details shown below : ");

                            System.out.println("\nReservation Number : "+reservationNo);
                            System.out.println("\nStudent Name : "+reservationBy);
                            System.out.println("\nSubject Name : "+reservedFor);
                            System.out.println("\nTuition Time : "+slots.get(i).getWeekDate()+" on "+slots.get(i).getWeekDay()+" at "+slots.get(i).getStartAt());
                            System.out.println("\nTutor Name : "+slots.get(i).getTutor().getName());
                            System.out.println("=================================================================================\n");
                       }
                    }
                } else {
                   System.out.println("\nError : Your Choice is not valid");                
                }
            }catch (NumberFormatException e) {
                System.out.println("\nError : You have to enter only integer values");
                Constants.studentInput.nextLine();
                mainMenu();
            }
        } 
    }
    
    /*
    * Method to display slots according to selected tutor and make reservation
    */
    public static void tutorSlots(String selectedTutor){
        List<Slots> slots = Slots.getSlots();
        Map<String, Integer> map = new LinkedHashMap<>();
        
        System.out.println("\n");
        System.out.println("==============================================================================================================================================================================================================================================================================");
        System.out.printf("%-10s %-13s %-30s %-15s %-20s %-20s %-20s %-20s %-20s %-20s  %-30s %n", "S.No.","WeekNumber","Subject","Fees", "Taught By", 
                 "Start At", "End At","Duration", "WeekDay","Date","Availability");
        System.out.println("==============================================================================================================================================================================================================================================================================");
        System.out.println();
        int increment = 1;
        String tutorCounter = "";
        for(int i=0; i<slots.size(); i++){   
            if(slots.get(i).getTutor().getName().equalsIgnoreCase(selectedTutor)){
                tutorCounter = String.valueOf(increment);
                System.out.printf("%-10s %-13s %-30s $%-15s %-20s %-20s %-20s %-20s %-20s %-20s  %-30s  %n%n", increment, "Week-"+slots.get(i).getWeekNum(),
                        slots.get(i).getSubject().getSubName(), 
                        slots.get(i).getSubject().getFees(),
                        slots.get(i).getTutor().getName(),
                        slots.get(i).getStartAt(), slots.get(i).getEndAt(),slots.get(i).getDuration(),
                        slots.get(i).getWeekDay(),slots.get(i).getWeekDate(),slots.get(i).getIsAvailable());
                
                map.put(tutorCounter, slots.get(i).getSlotId());
                increment = increment + 1;
            }
        }
        
        //Make Reservation
        System.out.println("==============================================================================================================================================================================================================================================================================");
        System.out.print("\nDo you want to reserve any from above menu (Y/N) : ");
        
        String choice = Constants.studentInput.nextLine();
        
        if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("Yes")){
            
            System.out.print("\nChoose any Option from above menu to make a reservation : ");
             
            try{
                
                
                String choicenum = Constants.studentInput.nextLine();

                Set<String> keyset = map.keySet();
                int isvalid = 0;
                for (String key : keyset) {
                    if (key.equalsIgnoreCase(choicenum)) {
                       isvalid++;
                    }
                }


                if (isvalid != 0) {
                    int choiceN = Integer.parseInt(choicenum);
                    int mapIndex = map.get(String.valueOf(choiceN));
                                                            
                    for(int i=0; i<slots.size(); i++){
                        
                        if(slots.get(i).getSlotId() == mapIndex){
                            
                            String reservationNo = randomReservatioNumber(); 
                            String reservationBy = getReservationBy();
                            if(reservationBy.equalsIgnoreCase("")){
                                return;
                            }
                            int weekNo = slots.get(i).getWeekNum();
                            int slotId = slots.get(i).getSlotId();
                            String tutorName = slots.get(i).getTutor().getName();
                            String fees = slots.get(i).getSubject().getFees();
                            String reservedFor = slots.get(i).getSubject().getSubName();
                            String reservationStatus = Constants.BOOK;

                            Reservations obj = new Reservations(reservationNo,weekNo,slotId,tutorName,fees,reservedFor,reservationStatus,reservationBy);
                            Reservations.reservationList.add(obj);

                            System.out.println("\n=================================================================================");
                            System.out.println("\nReservation Completed against Reservation Number : "+reservationNo);

                            System.out.println("\nReservation Details shown below : ");

                            System.out.println("\nReservation Number : "+reservationNo);
                            System.out.println("\nStudent Name : "+reservationBy);
                            System.out.println("\nSubject Name : "+reservedFor);
                            System.out.println("\nTuition Time : "+slots.get(i).getWeekDate()+" on "+slots.get(i).getWeekDay()+" at "+slots.get(i).getStartAt());
                            System.out.println("\nTutor Name : "+slots.get(i).getTutor().getName());
                            System.out.println("=================================================================================\n");
                            break;
                        }
                    }

                    
                } else {
                   System.out.println("\nError : Your Choice is not valid");                
                }
            }catch (NumberFormatException e) {
                System.out.println("\nError : You have to enter only integer values");
                Constants.studentInput.nextLine();
                mainMenu();
            }
        }
    }
    
    /*
    * Method to generate random reservation number
    */
    public static String randomReservatioNumber(){
        
        Random random = new Random();
        int randomNumber = random.nextInt(9000000) + 1000000;
                
        String reservationNumber = "RESV"+randomNumber;
        return reservationNumber;
    }
        
    /*
    * Method to display all students and select student name from menu to make reservation
    */
    public static String getReservationBy(){                
        List<Students> studentList = Students.getStudents();
                
        Map<String, String> map = new LinkedHashMap<>();
       
        
        System.out.println("\n");
        System.out.println("===================================================================================================================================================");
        System.out.printf("%-10s %-40s %-30s %-30s %-30s %n", "S.No.","Name", "Contact","Gender","DOB");
        System.out.println("===================================================================================================================================================");
        System.out.println();
        int increment1 = 1;
        String studentCounter = "";
        

        for(int i=0; i<studentList.size(); i++){
            studentCounter = String.valueOf(increment1);
            System.out.printf("%-10s %-40s %-30s %-30s %-30s %n%n", increment1,
                    studentList.get(i).getName(),studentList.get(i).getContact(),studentList.get(i).getGender(),studentList.get(i).getDob());
            map.put(studentCounter, studentList.get(i).getName());
            increment1 = increment1 + 1;
        }


        System.out.println("===================================================================================================================================================\n");
             
        String selectedStudent = "";
        System.out.print("Choose any Student from above menu : ");
        try {
            String choicenum = Constants.studentInput.nextLine();
            int isvalid = 0;
            Set<String> keyset = map.keySet();
            for (String key : keyset) {
                if (key.equalsIgnoreCase(choicenum)) {
                    isvalid++;
                }
            }
            
            if (isvalid != 0) {
                selectedStudent = map.get(choicenum);
            } else {
               System.out.println("\nError : Your Choice is not valid");                
            }

        } catch (Exception e) {
            System.out.println("\nError : You have to enter only integer values");
            Constants.studentInput.nextLine();
            mainMenu();
        }
        
        return selectedStudent;
        
    }
        
    
     /*
    * Method to display Filter Reservations Menu
    */
    private static int filterReservationMenu(){
        System.out.println("\nSelect a Choice to filter reservations : ");
        System.out.println("1. All Reservations");
        System.out.println("2. Filter On Student Name ");        
        System.out.println("3. Return Back");
        
        String studentChoice  = "";
        
        /* Validation for Menu Options */
        while (true) {
            System.out.print("\nEnter Your Choice : ");
            studentChoice = Constants.studentInput.nextLine();
            if (studentChoice.isEmpty()) {
                System.out.println("\nError : You have to select an option ");
            } else if (!isValidChoice(studentChoice)) {
                System.out.println("\nError : Your Choice must be a valid integer");
            } else {
                break;
            }
        }
        return Integer.parseInt(studentChoice);
    }
    
    
    /*
    * Method to apply filter on reservations made by the students
    */
     public static void viewReservation(){
       int menu_option = filterReservationMenu();
        
        while (menu_option != 3) {
            switch (menu_option)
            {
                case 1 -> viewAllReservation();
                case 2 -> filterReservationByStudentName();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Error : Enter Valid Choice");
            }
            menu_option = filterReservationMenu();
        }
     }
       
    
     /*
    * Method to display all reservations made by the students
    */
     public static void viewAllReservation(){
        List<Reservations> reservationList = Reservations.getReservations();
        List<Slots> slots = Slots.getSlots();
           
        if(reservationList.isEmpty()){
            System.out.println("\nError : No Reservation Exists");
            return;
        }
        
        System.out.println("\n");
        System.out.println("=================================================================================================================================================================================================================================================");
        System.out.printf("%-20s %-13s %-35s %-20s %-20s %-15s %-20s %-20s  %-15s %n", "ReservationNo.","WeekNo.", "Subject Name","Reserved By",
                "Tutor Name","WeekDay","WeekDate","Tuition Time","Status");
        System.out.println("=================================================================================================================================================================================================================================================");
        System.out.println();
        

        for(int j=0; j<reservationList.size(); j++){
            for(int i=0; i<slots.size(); i++){

                if(slots.get(i).getSlotId() == reservationList.get(j).getSlotId()){
                    String weekday = slots.get(i).getWeekDay();
                    String weekdate = slots.get(i).getWeekDate();
                    String startTime = slots.get(i).getStartAt();
                    String endTime = slots.get(i).getEndAt();
                    String tutor = slots.get(i).getTutor().getName();
                    int weekNumber = slots.get(i).getWeekNum();
                    String reservedFor = slots.get(i).getSubject().getSubName();
                    
                    
                    System.out.printf("%-20s %-13s %-35s %-20s %-20s %-15s %-20s %-20s  %-15s %n", reservationList.get(j).getReservationNo(),
                    weekNumber, reservedFor,reservationList.get(j).getReservedBy(),
                    tutor,
                    weekday,weekdate,startTime+" - "+endTime,
                    reservationList.get(j).getReservationStatus());
                }
            }
        }
        System.out.println("=================================================================================================================================================================================================================================================");
     }
     
      
     /*
    * Method to display all reservations made by the selected student
    */  
     public static void filterReservationByStudentName(){
        List<Reservations> reservationList = Reservations.getReservations();
        List<Slots> slots = Slots.getSlots();
        
        if(reservationList.isEmpty()){
            System.out.println("\nError : No Reservation Exists");
            return;
        }
        
        String selectedStudent = getReservationBy();
        
        if(selectedStudent.equalsIgnoreCase("")){
            return;
        }
           
        System.out.println("\n");
        System.out.println("=================================================================================================================================================================================================================================================");
        System.out.printf("%-20s %-13s %-35s %-20s %-20s %-15s %-20s %-20s  %-15s %n", "ReservationNo.","WeekNo.", "Subject Name","Reserved By",
                "Tutor Name","WeekDay","WeekDate","Tuition Time","Status");
        System.out.println("=================================================================================================================================================================================================================================================");
        System.out.println();
        
        for(int j=0; j<reservationList.size(); j++){
             for(int i=0; i<slots.size(); i++){
                if(slots.get(i).getSlotId() == reservationList.get(j).getSlotId()){
                    
                    if(reservationList.get(j).getReservedBy().equalsIgnoreCase(selectedStudent)){
                        
                        String weekday = slots.get(i).getWeekDay();
                        String weekdate = slots.get(i).getWeekDate();
                        String startTime = slots.get(i).getStartAt();
                        String endTime = slots.get(i).getEndAt();
                        String tutor = slots.get(i).getTutor().getName();
                        int weekNumber = slots.get(i).getWeekNum();
                        String reservedFor = slots.get(i).getSubject().getSubName();
                   

                        System.out.printf("%-20s %-13s %-35s %-20s %-20s %-15s %-20s %-20s  %-15s %n", reservationList.get(j).getReservationNo(),
                        weekNumber, reservedFor,reservationList.get(j).getReservedBy(),
                        tutor,
                        weekday,weekdate,startTime+" - "+endTime,
                        reservationList.get(j).getReservationStatus());
                    }
                }
            }
        }
        System.out.println("=================================================================================================================================================================================================================================================");
     }
        
     
     /*
     * Method to update reservation
     */
    public static void updateReservation(){
        List<Reservations> reservationList = Reservations.getReservations();
        System.out.print("\nEnter Reservation Number : ");
        String reservationNo = Constants.studentInput.nextLine();
        
        boolean isValidNo = isValidReservationNo(reservationNo);
        if(!isValidNo){
            System.out.println("\nError : Enter Valid Reservation Number");
            return;
        }
        
        
        boolean canbeUpdated = canReservationBeUpdated(reservationNo);
        if(canbeUpdated){
            System.out.println("\nError : Either Reservation is attended or cancellled, So it cannot be Updated");
            return;
        }
        
        String subject = "";
        
        for(int i=0; i<reservationList.size(); i++){
            if(reservationNo.equalsIgnoreCase(reservationList.get(i).getReservationNo())){
                subject = reservationList.get(i).getReservedFor();
            }
        }
        
        //get Slots to Update reservation
        List<Slots> slots = Slots.getSlots();
        Map<String, Integer> map = new LinkedHashMap<>();
        System.out.println("\n");
        System.out.println("==============================================================================================================================================================================================================================================================================");
        System.out.printf("%-10s %-13s %-30s %-15s %-20s %-20s %-20s %-20s %-20s %-20s  %-30s %n", "S.No.","WeekNumber","Subject","Fees", "Taught By", 
                 "Start At", "End At","Duration", "WeekDay","Date","Availability");
        System.out.println("==============================================================================================================================================================================================================================================================================");
        System.out.println();
        int increment = 1;
        String subjectCounter = "";
        for(int i=0; i<slots.size(); i++){   
            if(slots.get(i).getSubject().getSubName().equalsIgnoreCase(subject)){
                subjectCounter = String.valueOf(increment);
                System.out.printf("%-10s %-13s %-30s $%-15s %-20s %-20s %-20s %-20s %-20s %-20s  %-30s  %n%n", increment, "Week-"+slots.get(i).getWeekNum(),
                        slots.get(i).getSubject().getSubName(), 
                        slots.get(i).getSubject().getFees(),
                        slots.get(i).getTutor().getName(),
                        slots.get(i).getStartAt(), slots.get(i).getEndAt(),slots.get(i).getDuration(),
                        slots.get(i).getWeekDay(),slots.get(i).getWeekDate(),slots.get(i).getIsAvailable());
                map.put(subjectCounter, slots.get(i).getSlotId());
                increment = increment + 1;
            }
        }
       
        //Update Reservation
            System.out.print("\nChoose any Option from above menu to update a reservation : ");

            try{
                String choicenum = Constants.studentInput.nextLine();

                Set<String> keyset = map.keySet();
                int isvalid = 0;
                for (String key : keyset) {
                    if (key.equalsIgnoreCase(choicenum)) {
                       isvalid++;
                    }
                }


                if (isvalid != 0) {
                    int mapIndex = map.get(choicenum);
                    
                    for(int i=0; i<slots.size(); i++){

                       if(slots.get(i).getSlotId() == mapIndex){

                            String reservationBy = "";
                            String reservedFor = slots.get(i).getSubject().getSubName();
                            int slotID = slots.get(i).getSlotId();
                            
                            for(int j=0; j<reservationList.size(); j++){
                                if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo)){
                                    reservationList.get(j).setReservationStatus(Constants.CHANGE);
                                    reservationList.get(j).setReservedFor(reservedFor);
                                    reservationList.get(j).setSlotId(slotID);
                                    reservationBy = reservationList.get(j).getReservedBy();
                                }
                            }
                            
                            System.out.println("\n=================================================================================");
                            System.out.println("\nReservation Updated against Reservation Number : "+reservationNo);

                            System.out.println("\nReservation Details shown below : ");

                            System.out.println("\nReservation Number : "+reservationNo);
                            System.out.println("\nStudent Name : "+reservationBy);
                            System.out.println("\nSubject Name : "+reservedFor);
                            System.out.println("\nTuition Time : "+slots.get(i).getWeekDate()+" on "+slots.get(i).getWeekDay()+" at "+slots.get(i).getStartAt());
                            System.out.println("\nTutor Name : "+slots.get(i).getTutor().getName());
                            System.out.println("=================================================================================\n");
                       }
                    }
                }
            }catch (NumberFormatException e) {
                System.out.println("\nError : You have to enter only integer values");
                Constants.studentInput.nextLine();
                mainMenu();
            }
    }
            
    /*
    * Method to check whether the reservation number exists or not
    */
    public static boolean isValidReservationNo(String reservationNum){
        List<Reservations> reservationsList = Reservations.getReservations();
        boolean isValidNo = false;
        
        for(int i=0; i<reservationsList.size(); i++){
            
            if(reservationsList.get(i).getReservationNo().equalsIgnoreCase(reservationNum)){
                isValidNo = true;
            }
        } 
        return isValidNo;
    }
    
    
    
    /*
    * Method to check whether the reservation status is attended or cancelled
    */
    public static boolean canReservationBeUpdated(String reservationNum){
        List<Reservations> reservationsList = Reservations.getReservations();
        boolean isValid = false;
        
        for(int i=0; i<reservationsList.size(); i++){
            
            if(reservationsList.get(i).getReservationNo().equalsIgnoreCase(reservationNum) && 
                    (reservationsList.get(i).getReservationStatus().equalsIgnoreCase(Constants.ATTEND) ||
                    reservationsList.get(i).getReservationStatus().equalsIgnoreCase(Constants.CANCEL))){
                isValid = true;
            }
        } 
        return isValid;
    }
    
     /*
     * Method to cancel reservation
     */
    public static void cancelBooking(){
        List<Reservations> reservationList = Reservations.getReservations();
        System.out.print("\nEnter Reservation Number : ");
        String reservationNo = Constants.studentInput.nextLine();
        
        boolean isValidNo = isValidReservationNo(reservationNo);
        if(!isValidNo){
            System.out.println("\nError : Enter Valid Reservation Number");
            return;
        }
        
        
        boolean canbeUpdated = canReservationBeUpdated(reservationNo);
        if(canbeUpdated){
            System.out.println("\nError : Either Reservation is attended or cancellled, So it cannot be Cancelled");
            return;
        }
        
        
         for(int j=0; j<reservationList.size(); j++){
            if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo)){
                reservationList.get(j).setReservationStatus(Constants.CANCEL);
            }
        }
         
        System.out.println("\n=================================================================================");
        System.out.println("Reservation Cancelled against Reservation Number : "+reservationNo);
        System.out.println("=================================================================================\n");
    }
    
    
    /*
    * Method to give feedback 
    */
    public static void giveFeedback(){
        String reservationNo = getReservationNoForFeedback();
        
        if(reservationNo.equalsIgnoreCase("0")){
            return;
        }
        
        
        List<Reservations> reservationList = Reservations.getReservations();
        List<Slots> slots = Slots.getSlots();
                
        String tutor = "";
        String subject = "";
        String student = "";
        int weekNumber = 0;
        
        
        for(int j=0; j<reservationList.size(); j++){
            for(int i=0; i<slots.size(); i++){
                if(slots.get(i).getSlotId() == reservationList.get(j).getSlotId()){
                    if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo)){
                        tutor = slots.get(i).getTutor().getName();
                        subject = slots.get(i).getSubject().getSubName();
                        student = reservationList.get(j).getReservedBy();
                        weekNumber = reservationList.get(j).getWeekNum();
                    }
                }
            }
        }
            
        System.out.print("\nEnter Feedback : ") ;
        String feedback = Constants.studentInput.nextLine();
        
        if(feedback.equalsIgnoreCase("")){
            do{
                System.out.print("\nError : You must enter a valid Feedback : "); 
                feedback = Constants.studentInput.nextLine();
            }while(feedback.equalsIgnoreCase(""));
        }
     
         
        System.out.print("\nEnter Rating between 1 to 5 : ") ;
        String ratings = Constants.studentInput.nextLine();
        
        if(ratings.isEmpty() || !isValidChoice(ratings) || Integer.parseInt(ratings) < 1 || Integer.parseInt(ratings) > 5){
            do{
                System.out.print("\nError : You must enter a valid Rating value between 1 to 5 : ");
                ratings = Constants.studentInput.nextLine();
            }while(ratings.isEmpty() || !isValidChoice(ratings) || Integer.parseInt(ratings) < 1 || Integer.parseInt(ratings) > 5);
        }
     
        TutorFeedback obj = new TutorFeedback(weekNumber,tutor,subject,student,feedback,ratings);
        TutorFeedback.feedbackList.add(obj);
        System.out.println("\n\n=====================================");
        System.out.println("Thanks for submitting a Feedback");
        System.out.println("=====================================");
        
        //Update status 
        for(int j=0; j<reservationList.size(); j++){
            if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo)){
                reservationList.get(j).setReservationStatus(Constants.ATTEND);
            }
        }
    }
    
    /*
    * Method to get reservation number to add feedback
    */
    public static String getReservationNoForFeedback(){
        List<Reservations> reservationList = Reservations.getReservations();
        List<Slots> slots = Slots.getSlots();

        if(reservationList.isEmpty()){
            return "0";
        }
         
        Map<String, String> map = new LinkedHashMap<>();
       
        
        System.out.println("\n");
        System.out.println("=================================================================================================================================================================================================================================================");
        System.out.printf("%-10s %-20s %-13s %-35s %-20s %-20s %-15s %-20s %-20s  %-15s %n", "S.No.","ReservationNo.","WeekNo.", "Subject Name","Reserved By",
                "Tutor Name","WeekDay","WeekDate","Tuition Time","Status");
        System.out.println("=================================================================================================================================================================================================================================================");
        System.out.println();
        
        String reservationCounter = "";
        int increment1 = 1;
        
        for(int j=0; j<reservationList.size(); j++){
            if(reservationList.get(j).getReservationStatus().equalsIgnoreCase(Constants.BOOK) || 
                    reservationList.get(j).getReservationStatus().equalsIgnoreCase(Constants.CHANGE) ){
                
                for(int i=0; i<slots.size(); i++){

                    if(slots.get(i).getSlotId() == reservationList.get(j).getSlotId()){
                        reservationCounter = String.valueOf(increment1);
                        String weekday = slots.get(i).getWeekDay();
                        String weekdate = slots.get(i).getWeekDate();
                        String startTime = slots.get(i).getStartAt();
                        String endTime = slots.get(i).getEndAt();
                        String tutor = slots.get(i).getTutor().getName();
                        String subject = slots.get(i).getSubject().getSubName();
                        int weekNumber = slots.get(i).getWeekNum();


                        System.out.printf("%-10s %-20s %-13s %-35s %-20s %-20s %-15s %-20s %-20s  %-15s %n", increment1, reservationList.get(j).getReservationNo(),
                        weekNumber, subject,reservationList.get(j).getReservedBy(),
                        tutor,
                        weekday,weekdate,startTime+" - "+endTime,
                        reservationList.get(j).getReservationStatus());
                        map.put(reservationCounter, reservationList.get(j).getReservationNo());
                        increment1 =  increment1 + 1;
                    }
                }
            }
        }
        
       
        
        String selectedReservationNo = "";
        System.out.print("\nChoose any reservation from above menu to add a feedback : ");
        try {
            String choicenum = Constants.studentInput.nextLine();
            int isvalid = 0;
            Set<String> keyset = map.keySet();
            for (String key : keyset) {
                if (key.equalsIgnoreCase(choicenum)) {
                    isvalid++;
                }
            }
            
            if (isvalid != 0) {
                selectedReservationNo = map.get(choicenum);
            } else {
               System.out.println("\nError : Your Choice is not valid");  
               return "0";
            }

        } catch (Exception e) {
            System.out.println("\nError : You have to enter only integer values");
            Constants.studentInput.nextLine();
            mainMenu();
        }
        return selectedReservationNo;
    }
    
    /*
    * Method to get reports
    */
    public static void viewReports(){
                
        int menu_option = reportMenu();
        
        while (menu_option != 3) {
            switch (menu_option)
            {
                case 1 -> studentReservationsCountReport();
                case 2 -> tutorFeedbackReport();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Error : Enter Valid Choice");
            }
            menu_option = reportMenu();
        }
    }
    
    
    /*
    * Method to display menu to get reports
    */
    private static int reportMenu(){
        System.out.println("\nSelect a Choice to display report : ");
        System.out.println("1. Student Reservations Count Report ");
        System.out.println("2. Tutor Feedback Report ");        
        System.out.println("3. Return Back");
        
        String studentChoice  = "";
        
        /* Validation for Menu Options */
        while (true) {
            System.out.print("\nEnter Your Choice : ");
            studentChoice = Constants.studentInput.nextLine();
            if (studentChoice.isEmpty()) {
                System.out.println("\nError : You have to select an option ");
            } else if (!isValidChoice(studentChoice)) {
                System.out.println("\nError : Your Choice must be a valid integer");
            } else {
                break;
            }
        }
        return Integer.parseInt(studentChoice);
    }
     
    
    /*
    * Method to get student reservations report
    */
    public static void studentReservationsCountReport(){
        System.out.print("\nEnter Week Number of get Report of that specific week : ");
        String studentChoice = Constants.studentInput.nextLine();
        
        List<Reservations> reservationList = Reservations.getReservations();
        List<Students> studentList = Students.getStudents();
        
        System.out.println("\n");
        System.out.println("===================================================================================================================");
        System.out.printf("%-30s %-30s %-30s %-30s %n", "Student Name", "Cancelled Reservations",
                "Attended Reservations", "Booked Reservations");
        System.out.println("===================================================================================================================");
        System.out.println();

        HashMap<String, int[]> reservationCounter = new HashMap<>();
        
        for (Reservations reservation : reservationList) {
            for (Students student : studentList) {
       
                if (reservation.getReservedBy().equalsIgnoreCase(student.getName())) {
                    if (reservation.getWeekNum() == Integer.parseInt(studentChoice)) {
                        String stuame = student.getName();
                        int[] counter = reservationCounter.getOrDefault(stuame, new int[3]);

                        if (reservation.getReservationStatus().equalsIgnoreCase(Constants.CANCEL)) {
                            counter[0]++;
                        }
                        
                        if (reservation.getReservationStatus().equalsIgnoreCase(Constants.ATTEND)) {
                            counter[1]++;
                        }
                        if (reservation.getReservationStatus().equalsIgnoreCase(Constants.BOOK)) {
                            counter[2]++;
                        }
                        
                        reservationCounter.put(stuame, counter);
                    }
                }
            }
        }
        for (Map.Entry<String, int[]> entry : reservationCounter.entrySet()) {
            String studentName = entry.getKey();
            int[] counter = entry.getValue();

            System.out.printf("%-30s %-30s %-30s %-30s %n", studentName, counter[0], counter[1], counter[2]);
        }
        System.out.println("===================================================================================================================\n");
    }
     
    
    /*
    * Method to get tutor feedback report
    */
    public static void tutorFeedbackReport(){
        System.out.print("\nEnter Week Number of get Report of that specific week : ");
        String studentChoice = Constants.studentInput.nextLine();
        
        
        List<TutorFeedback> feedback = TutorFeedback.getFeedbacks();
        List<Slots> slots = Slots.getSlots();
        
        System.out.println("\n");
        System.out.println("=====================================================================================================================================================================================");
        System.out.printf("%-40s %-30s %-20s %-40s %-30s %n", "Subject","Tutor", "Rating", "Feedback","Given By");
        System.out.println("=====================================================================================================================================================================================");
        System.out.println();
       
         for (TutorFeedback feedbackObj : feedback) {
            for (Slots slotObj : slots) {
                Tutors tutor = slotObj.getTutor();
                if (feedbackObj.getWeekNumber() == Integer.parseInt(studentChoice) &&
                        tutor.getName().equalsIgnoreCase(feedbackObj.getTutor())) {
                    System.out.printf("%-40s %-30s %-20s %-40s %-30s %n",  feedbackObj.getSubject(),tutor.getName(),
                            feedbackObj.getRating(), feedbackObj.getFeedback(),feedbackObj.getStudent());
                    break; 
                }
            }
        }
        System.out.println("=====================================================================================================================================================================================");
    }
     
}
