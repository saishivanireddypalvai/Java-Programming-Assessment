

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import tutiioncentrebooking.Constants;
import tutiioncentrebooking.Reservations;
import tutiioncentrebooking.Slots;
import static tutiioncentrebooking.TutiionCentreBooking.canReservationBeUpdated;
import static tutiioncentrebooking.TutiionCentreBooking.randomReservatioNumber;
import tutiioncentrebooking.TutorFeedback;


public class TuitionCentreBookingJUnitTests {
    
    public static String reservationNo = "";
    public static String reservationNo2 = "";
    
    
    @Test
    public void filterOnSubjects() {
        String subName = "Numerical Reasoning";
        List<Slots> slots = Slots.getSlots();
        int isFiltered = 0;
        for(int i=0; i<slots.size(); i++){
            if(slots.get(i).getSubject().getSubName().equalsIgnoreCase(subName)){
                isFiltered = 1;
            }
        }   
        assertTrue(isFiltered == 1);
    }
    
    
    
    @Test
    public void filterOnTutors() {
        String tutorName = "Reece";
        List<Slots> slots = Slots.getSlots();
        int isFiltered = 0;
        for(int i=0; i<slots.size(); i++){
            if(slots.get(i).getTutor().getName().equalsIgnoreCase(tutorName)){
                isFiltered = 1;
            }
        }   
        assertTrue(isFiltered == 1);
    }
    
    
    @Test
    public void makeReservation() {
        List<Slots> slots = Slots.getSlots();
        List<Reservations> reservationList = Reservations.getReservations();
        
        int slot_id = 10;
        
        for(int i=0; i<slots.size(); i++){

            if(slots.get(i).getSlotId() == slot_id){

                 reservationNo = randomReservatioNumber(); 
                 String reservationBy = "Davis";
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
            }
         }
        assertTrue(!reservationList.isEmpty());
    }
    
   
    @Test
    public void updateReservation() {
        List<Slots> slots = Slots.getSlots();
        List<Reservations> reservationList = Reservations.getReservations();
        
        int newSlotID = 18;
        
        for(int j=0; j<reservationList.size(); j++){
            if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo)){
                for(int i=0; i<slots.size(); i++){
                if(slots.get(i).getSlotId() == reservationList.get(j).getSlotId()){
                        String reservedFor = slots.get(i).getSubject().getSubName();
                        if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo)){
                            reservationList.get(j).setReservationStatus(Constants.CHANGE);
                            reservationList.get(j).setReservedFor(reservedFor);
                            reservationList.get(j).setSlotId(newSlotID);
                        }
                    }
               }
            }
        }
        String updatedStatus = "";
        for(int j=0; j<reservationList.size(); j++){
            if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo)){
                updatedStatus = reservationList.get(j).getReservationStatus();
            }
        }
        assertTrue(updatedStatus.equalsIgnoreCase(Constants.CHANGE));
    }
    
    
   
    @Test
    public void cancelReservation() {
        List<Reservations> reservationList = Reservations.getReservations();
        for(int j=0; j<reservationList.size(); j++){
            if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo)){
                reservationList.get(j).setReservationStatus(Constants.CANCEL);
            }
        }
        
        String updatedStatus = "";
        for(int j=0; j<reservationList.size(); j++){
            if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo)){
                updatedStatus = reservationList.get(j).getReservationStatus();
            }
        }
        assertTrue(updatedStatus.equalsIgnoreCase(Constants.CANCEL));
    }
    
   
    @Test
    public void isStatusAlreadyCancelledOrUpdated() {
        
        boolean isStatusAlreadyCancelledOrAttended = canReservationBeUpdated(reservationNo);
        assertTrue(isStatusAlreadyCancelledOrAttended == true);
    }
    
  
     
    @Test
    public void giveFeedback() {
       reserveClass();
       List<Reservations> reservationList = Reservations.getReservations();
       List<Slots> slots = Slots.getSlots();
       List<TutorFeedback> feedbacks = TutorFeedback.getFeedbacks();
       String tutor = "";
       String subject = "";
       String student = "";
       int weekNumber = 0;
       
       for(int j=0; j<reservationList.size(); j++){
            for(int i=0; i<slots.size(); i++){
                if(slots.get(i).getSlotId() == reservationList.get(j).getSlotId()){
                    if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo2)){
                        tutor = slots.get(i).getTutor().getName();
                        subject = slots.get(i).getSubject().getSubName();
                        student = reservationList.get(j).getReservedBy();
                        weekNumber = reservationList.get(j).getWeekNum();
                    }
                }
            }
        }
        String feedback = "Satisfied";
        String ratings = "4";
        TutorFeedback obj = new TutorFeedback(weekNumber,tutor,subject,student,feedback,ratings);
        TutorFeedback.feedbackList.add(obj);
        
        for(int j=0; j<reservationList.size(); j++){
            if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo2)){
                reservationList.get(j).setReservationStatus(Constants.ATTEND);
            }
        }
        assertTrue(!feedbacks.isEmpty());
        
        //Is Status Chnaged to "Attended" after adding feedback
        String updatedStatus = "";
        for(int j=0; j<reservationList.size(); j++){
            if(reservationList.get(j).getReservationNo().equalsIgnoreCase(reservationNo2)){
                updatedStatus = reservationList.get(j).getReservationStatus();
            }
        }
        assertTrue(updatedStatus.equalsIgnoreCase(Constants.ATTEND));
        
    }

    
    public void reserveClass(){
         reservationNo2 = randomReservatioNumber(); 
         Reservations obj = new Reservations(reservationNo2,2,57,"Reece","130","Verbal Reasoning",Constants.BOOK,"Charlie");
         Reservations.reservationList.add(obj);
    }
        
}
