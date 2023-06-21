
package tutiioncentrebooking;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static tutiioncentrebooking.TutiionCentreBooking.mainMenu;
import static tutiioncentrebooking.TutiionCentreBooking.tutorSlots;


public class TutorFilter implements Filter{
    
    @Override
    public void applyFilter() {
        List<Slots> slots = Slots.getSlots();
                
        Map<String, String> map = new LinkedHashMap<>();
        HashSet<String> uniqueTutors = new HashSet<>();
        
        
        System.out.println("\n");
        System.out.println("==================================================");
        System.out.printf("%-10s %-40s %n", "S.No.","Tutor");
        System.out.println("==================================================");

        System.out.println();
        int increment = 1;
        int increment1 = 1;
        String tutorCounter = "";
        
        for(int i=0; i<slots.size(); i++){
            String tutorName = slots.get(i).getTutor().getName();
            uniqueTutors.add(tutorName);
            increment = increment + 1;
        }
        
        for (String tutor : uniqueTutors) {
            tutorCounter = String.valueOf(increment1);
            System.out.printf("%-10s %-40s %n%n", increment1,
                    tutor);
            map.put(tutorCounter, tutor);
            increment1 = increment1 + 1;
        }


        System.out.println("==================================================\n");
        
             
        System.out.print("Choose any Tutor from above menu to apply filter : ");
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
                String selectedTutor = map.get(choicenum);
                tutorSlots(selectedTutor);
            } else {
               System.out.println("\nError : Your Choice is not valid");                
            }

        } catch (Exception e) {
            System.out.println("\nError : You have to enter only integer values");
            Constants.studentInput.nextLine();
            mainMenu();
        }
    }
}
