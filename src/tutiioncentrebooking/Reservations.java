
package tutiioncentrebooking;

import java.util.ArrayList;


public class Reservations {
    
    private String reservationNo;
    private int weekNum;
    private int slotId;
    private String tutorName;
    private String fees;
    private String reservedFor;
    private String reservationStatus;
    private String reservedBy;

    public static ArrayList <Reservations> reservationList = new ArrayList<>();

        
    public Reservations(String reservationNo, int weekNum, int slotId, String tutorName, String fees, String reservedFor, String reservationStatus, String reservedBy) {
        this.reservationNo = reservationNo;
        this.weekNum = weekNum;
        this.slotId = slotId;
        this.tutorName = tutorName;
        this.fees = fees;
        this.reservedFor = reservedFor;
        this.reservationStatus = reservationStatus;
        this.reservedBy = reservedBy;
    }

    public String getReservationNo() {
        return reservationNo;
    }

    public int getWeekNum() {
        return weekNum;
    }

    public int getSlotId() {
        return slotId;
    }

    
    
    public String getTutorName() {
        return tutorName;
    }

    public String getFees() {
        return fees;
    }

    public String getReservedFor() {
        return reservedFor;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public String getReservedBy() {
        return reservedBy;
    }

    public static ArrayList getReservations() {
        return reservationList;
    }

    public void setReservedFor(String reservedFor) {
        this.reservedFor = reservedFor;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }
    
    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
    
    
    
}
