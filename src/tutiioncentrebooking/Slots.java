
package tutiioncentrebooking;

import java.util.ArrayList;


public class Slots {
    
    private int slotId;
    private int weekNum;
    private Subjects subject;
    private Tutors tutor;
    private String duration;
    private String startAt;
    private String endAt;
    private String weekDay;
    private String weekDate;
    private String isAvailable;

    public Slots(int slotId, int weekNum, Subjects subject, Tutors tutor, String duration, String startAt, String endAt, String weekDay, String weekDate,String isAvailable) {
        this.slotId = slotId;
        this.weekNum = weekNum;
        this.subject = subject;
        this.tutor = tutor;
        this.duration = duration;
        this.startAt = startAt;
        this.endAt = endAt;
        this.weekDay = weekDay;
        this.weekDate = weekDate;
        this.isAvailable = isAvailable;
    }

    public int getSlotId() {
        return slotId;
    }
    
    public int getWeekNum() {
        return weekNum;
    }

    public Subjects getSubject() {
        return subject;
    }

    public Tutors getTutor() {
        return tutor;
    }

    public String getDuration() {
        return duration;
    }

    public String getStartAt() {
        return startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public String getWeekDate() {
        return weekDate;
    }

    public String getIsAvailable() {
        return isAvailable;
    }
    
    public static ArrayList getSlots() {
        ArrayList <Slots> slots = new ArrayList<>();
        
        //Week - 1 - Monday
        Slots obj1 = new Slots(1,1,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Monday","03-July-2023","Available");
        
        Slots obj2 = new Slots(2,1,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Monday","03-July-2023","Available");
        
        
        Slots obj3 = new Slots(3,1,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Monday","03-July-2023","Available");
        
        
        Slots obj4 = new Slots(4,1,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Monday","03-July-2023","Available");
        
        
        Slots obj5 = new Slots(5,1,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Monday","03-July-2023","Available");

        Slots obj6 = new Slots(6,1,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Monday","03-July-2023","Available");
        
        
        Slots obj7 = new Slots(7,1,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Monday","03-July-2023","Available");
                  
        Slots obj8 = new Slots(8,1,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Monday","03-July-2023","Available");
        
        
        //Week - 1 - Tuesday
        
        Slots obj9 = new Slots(9,1,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Tuesday","04-July-2023","Available");
        
        Slots obj10 = new Slots(10,1,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Tuesday","04-July-2023","Available");
        
        
        Slots obj11 = new Slots(11,1,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Tuesday","04-July-2023","Available");
        
        
        Slots obj12 = new Slots(12,1,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Tuesday","04-July-2023","Available");
        
        
        Slots obj13 = new Slots(13,1,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Tuesday","04-July-2023","Available");

        Slots obj14 = new Slots(14,1,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Tuesday","04-July-2023","Available");
        
        
        Slots obj15 = new Slots(15,1,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Tuesday","04-July-2023","Available");
                  
        Slots obj16 = new Slots(16,1,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Tuesday","04-July-2023","Available");
        
        
        //Week - 1 - Wednesday
        
        Slots obj17 = new Slots(17,1,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Wednesday","05-July-2023","Available");
        
        Slots obj18 = new Slots(18,1,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Wednesday","05-July-2023","Available");
        
        
        Slots obj19 = new Slots(19,1,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Wednesday","05-July-2023","Available");
        
        
        Slots obj20 = new Slots(20,1,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Wednesday","05-July-2023","Available");
        
        
        Slots obj21 = new Slots(21,1,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Wednesday","05-July-2023","Available");

        Slots obj22 = new Slots(22,1,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Wednesday","05-July-2023","Available");
        
        
        Slots obj23 = new Slots(23,1,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Wednesday","05-July-2023","Available");
                  
        Slots obj24 = new Slots(24,1,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Wednesday","05-July-2023","Available");
        
        
        //Week - 1 - Thursday
        
        Slots obj25 = new Slots(25,1,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Thursday","06-July-2023","Available");
        
        Slots obj26 = new Slots(26,1,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Thursday","06-July-2023","Available");
        
        
        Slots obj27 = new Slots(27,1,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Thursday","06-July-2023","Available");
        
        
        Slots obj28 = new Slots(28,1,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Thursday","06-July-2023","Available");
        
        
        Slots obj29 = new Slots(29,1,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Thursday","06-July-2023","Available");

        Slots obj30 = new Slots(30,1,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Thursday","06-July-2023","Available");
        
        
        Slots obj31 = new Slots(31,1,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Thursday","06-July-2023","Available");
                  
        Slots obj32 = new Slots(32,1,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Thursday","06-July-2023","Available");
        
        
        //Week - 1 - Friday
        
        Slots obj33 = new Slots(33,1,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Friday","07-July-2023","Available");
        
        Slots obj34 = new Slots(34,1,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Friday","07-July-2023","Available");
        
        
        Slots obj35 = new Slots(35,1,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Friday","07-July-2023","Available");
        
        
        Slots obj36 = new Slots(36,1,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Friday","07-July-2023","Available");
        
        
        Slots obj37 = new Slots(37,1,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Friday","07-July-2023","Available");

        Slots obj38 = new Slots(38,1,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Friday","07-July-2023","Available");
        
        
        Slots obj39 = new Slots(39,1,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Friday","07-July-2023","Available");
                  
        Slots obj40 = new Slots(40,1,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Friday","07-July-2023","Available");
        
        
        //Week - 1 - Saturday
        
        Slots obj41 = new Slots(41,1,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Saturday","08-July-2023","Available");
        
        Slots obj42 = new Slots(42,1,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Saturday","08-July-2023","Available");
        
        
        Slots obj43 = new Slots(43,1,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Saturday","08-July-2023","Available");
        
        
        Slots obj44 = new Slots(44,1,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Saturday","08-July-2023","Available");
        
        
        Slots obj45 = new Slots(45,1,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Saturday","08-July-2023","Available");

        Slots obj46 = new Slots(46,1,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Saturday","08-July-2023","Available");
        
        
        Slots obj47 = new Slots(47,1,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Saturday","08-July-2023","Available");
                  
        Slots obj48 = new Slots(48,1,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Saturday","08-July-2023","Available");
        
        
        //Week - 1 - Sunday
        
        Slots obj49 = new Slots(49,1,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Sunday","09-July-2023","Available");
        
        Slots obj50 = new Slots(50,1,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Sunday","09-July-2023","Available");
        
        
        Slots obj51 = new Slots(51,1,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Sunday","09-July-2023","Available");
        
        
        Slots obj52 = new Slots(52,1,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Sunday","09-July-2023","Available");
        
        
        Slots obj53 = new Slots(53,1,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Sunday","09-July-2023","Available");

        Slots obj54 = new Slots(54,1,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Sunday","09-July-2023","Available");
        
        
        Slots obj55 = new Slots(55,1,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Sunday","09-July-2023","Available");
                  
        Slots obj56 = new Slots(56,1,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Sunday","09-July-2023","Available");
        
        
        //Week - 2 - Monday
        
        Slots obj57 = new Slots(57,2,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Monday","10-July-2023","Available");
        
        Slots obj58 = new Slots(58,2,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Monday","10-July-2023","Available");
        
        
        Slots obj59 = new Slots(59,2,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Monday","10-July-2023","Available");
        
        
        Slots obj60 = new Slots(60,2,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Monday","10-July-2023","Available");
        
        
        Slots obj61 = new Slots(61,2,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Monday","10-July-2023","Available");

        Slots obj62 = new Slots(62,2,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Monday","10-July-2023","Available");
        
        
        Slots obj63 = new Slots(63,2,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Monday","10-July-2023","Available");
                  
        Slots obj64 = new Slots(64,2,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Monday","10-July-2023","Available");
        
        
        //Week - 2 - Tuesday
        
        Slots obj65 = new Slots(65,2,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Tuesday","11-July-2023","Available");
        
        Slots obj66 = new Slots(66,2,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Tuesday","11-July-2023","Available");
        
        
        Slots obj67 = new Slots(67,2,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Tuesday","11-July-2023","Available");
        
        
        Slots obj68 = new Slots(68,2,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Tuesday","11-July-2023","Available");
        
        
        Slots obj69 = new Slots(69,2,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Tuesday","11-July-2023","Available");

        Slots obj70 = new Slots(70,2,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Tuesday","11-July-2023","Available");
        
        
        Slots obj71 = new Slots(71,2,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Tuesday","11-July-2023","Available");
                  
        Slots obj72 = new Slots(72,2,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Tuesday","11-July-2023","Available");
        
        
        //Week - 2 - Wednesday
        
        Slots obj73 = new Slots(73,2,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Wednesday","12-July-2023","Available");
        
        Slots obj74 = new Slots(74,2,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Wednesday","12-July-2023","Available");
        
        
        Slots obj75 = new Slots(75,2,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Wednesday","12-July-2023","Available");
        
        
        Slots obj76 = new Slots(76,2,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Wednesday","12-July-2023","Available");
        
        
        Slots obj77 = new Slots(77,2,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Wednesday","12-July-2023","Available");

        Slots obj78 = new Slots(78,2,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Wednesday","12-July-2023","Available");
        
        
        Slots obj79 = new Slots(79,2,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Wednesday","12-July-2023","Available");
                  
        Slots obj80 = new Slots(80,2,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Wednesday","12-July-2023","Available");
        
        //Week - 2 - Thursday
        
        Slots obj81 = new Slots(81,2,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Thursday","13-July-2023","Available");
        
        Slots obj82 = new Slots(82,2,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Thursday","13-July-2023","Available");
        
        
        Slots obj83 = new Slots(83,2,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Thursday","13-July-2023","Available");
        
        
        Slots obj84 = new Slots(84,2,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Thursday","13-July-2023","Available");
        
        
        Slots obj85 = new Slots(85,2,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Thursday","13-July-2023","Available");

        Slots obj86 = new Slots(86,2,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Thursday","13-July-2023","Available");
        
        
        Slots obj87 = new Slots(87,2,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Thursday","13-July-2023","Available");
                  
        Slots obj88 = new Slots(88,2,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Thursday","13-July-2023","Available");
        
        //Week - 2 - Friday
        
        Slots obj89 = new Slots(89,2,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Friday","14-July-2023","Available");
        
        Slots obj90 = new Slots(90,2,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Friday","14-July-2023","Available");
        
        
        Slots obj91 = new Slots(91,2,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Friday","14-July-2023","Available");
        
        
        Slots obj92 = new Slots(92,2,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Friday","14-July-2023","Available");
        
        
        Slots obj93 = new Slots(93,2,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Friday","14-July-2023","Available");

        Slots obj94 = new Slots(94,2,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Friday","14-July-2023","Available");
        
        
        Slots obj95 = new Slots(95,2,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Friday","14-July-2023","Available");
                  
        Slots obj96 = new Slots(96,2,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Friday","14-July-2023","Available");
        
        
        //Week - 2 - Saturday
        
        Slots obj97 = new Slots(97,2,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Saturday","15-July-2023","Available");
        
        Slots obj98 = new Slots(98,2,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Saturday","15-July-2023","Available");
        
        
        Slots obj99 = new Slots(99,2,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Saturday","15-July-2023","Available");
        
        
        Slots obj100 = new Slots(100,2,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Saturday","15-July-2023","Available");
        
        
        Slots obj101 = new Slots(101,2,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Saturday","15-July-2023","Available");

        Slots obj102 = new Slots(102,2,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Saturday","15-July-2023","Available");
        
        
        Slots obj103 = new Slots(103,2,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Saturday","15-July-2023","Available");
                  
        Slots obj104 = new Slots(104,2,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Saturday","15-July-2023","Available");
        
        
        //Week - 2 - Sunday
        
        Slots obj105 = new Slots(105,2,new Subjects("Verbal Reasoning","130"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","07:30", "08:30","Sunday","16-July-2023","Available");
        
        Slots obj106 = new Slots(106,2,new Subjects("Verbal Reasoning","130"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","13:30", "14:30","Sunday","16-July-2023","Available");
        
        
        Slots obj107 = new Slots(107,2,new Subjects("Numerical Reasoning","140"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","10:30", "11:30","Sunday","16-July-2023","Available");
        
        
        Slots obj108 = new Slots(108,2,new Subjects("Numerical Reasoning","140"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","09:00", "10:00","Sunday","16-July-2023","Available");
        
        
        Slots obj109 = new Slots(109,2,new Subjects("English comprehension","180"),new Tutors("Johnson","johnson@gmail.com","023 8071 1811","Male",29), 
               "1 hr.","10:45", "11:45","Sunday","16-July-2023","Available");

        Slots obj110 = new Slots(110,2,new Subjects("English comprehension","180"),new Tutors("Richardson","richardson@gmail.com","01796 472302","Male",32), 
               "1 hr.","09:00", "10:00","Sunday","16-July-2023","Available");
        
        
        Slots obj111 = new Slots(111,2,new Subjects("English writing","200"),new Tutors("Noah","noah@gmail.com","0114 291 2300","Male",34), 
               "1 hr.","09:00", "10:00","Sunday","16-July-2023","Available");
                  
        Slots obj112 = new Slots(112,2,new Subjects("English writing","200"),new Tutors("Reece","reece@gmail.com","07798 897317","Male",30), 
               "1 hr.","09:30", "10:30","Sunday","16-July-2023","Available");
        
        
        
        slots.add(obj1);         
        slots.add(obj2);         
        slots.add(obj3);         
        slots.add(obj4);         
        slots.add(obj5);         
        slots.add(obj6);         
        slots.add(obj7);         
        slots.add(obj8);         
        
        slots.add(obj9);         
        slots.add(obj10);         
        slots.add(obj11);         
        slots.add(obj12);         
        slots.add(obj13);         
        slots.add(obj14);         
        slots.add(obj15);         
        slots.add(obj16);         
        
        slots.add(obj17);         
        slots.add(obj18);         
        slots.add(obj19);         
        slots.add(obj20);         
        slots.add(obj21);         
        slots.add(obj22);         
        slots.add(obj23);         
        slots.add(obj24);  
        
        slots.add(obj25);         
        slots.add(obj26);         
        slots.add(obj27);         
        slots.add(obj28);         
        slots.add(obj29);         
        slots.add(obj30);         
        slots.add(obj31);         
        slots.add(obj32);  
        
        slots.add(obj33);         
        slots.add(obj34);         
        slots.add(obj35);         
        slots.add(obj36);         
        slots.add(obj37);         
        slots.add(obj38);         
        slots.add(obj39);         
        slots.add(obj40);  
        
        slots.add(obj41);         
        slots.add(obj42);         
        slots.add(obj43);         
        slots.add(obj44);         
        slots.add(obj45);         
        slots.add(obj46);         
        slots.add(obj47);         
        slots.add(obj48);  
        
        
        slots.add(obj49);         
        slots.add(obj50);         
        slots.add(obj51);         
        slots.add(obj52);         
        slots.add(obj53);         
        slots.add(obj54);         
        slots.add(obj55);         
        slots.add(obj56);  
        
        
        slots.add(obj57);         
        slots.add(obj58);         
        slots.add(obj59);         
        slots.add(obj60);         
        slots.add(obj61);         
        slots.add(obj62);         
        slots.add(obj63);         
        slots.add(obj64);  
        
        
        slots.add(obj65);         
        slots.add(obj66);         
        slots.add(obj67);         
        slots.add(obj68);         
        slots.add(obj69);         
        slots.add(obj70);         
        slots.add(obj71);         
        slots.add(obj72);  
        
        
        slots.add(obj73);         
        slots.add(obj74);         
        slots.add(obj75);         
        slots.add(obj76);         
        slots.add(obj77);         
        slots.add(obj78);         
        slots.add(obj79);         
        slots.add(obj80);  
        
        slots.add(obj81);         
        slots.add(obj82);         
        slots.add(obj83);         
        slots.add(obj84);         
        slots.add(obj85);         
        slots.add(obj86);         
        slots.add(obj87);         
        slots.add(obj88);  
        
        slots.add(obj89);         
        slots.add(obj90);         
        slots.add(obj91);         
        slots.add(obj92);         
        slots.add(obj93);         
        slots.add(obj94);         
        slots.add(obj95);         
        slots.add(obj96);  
        
        slots.add(obj97);         
        slots.add(obj98);         
        slots.add(obj99);         
        slots.add(obj100);         
        slots.add(obj101);         
        slots.add(obj102);         
        slots.add(obj103);         
        slots.add(obj104);  
        
        
        slots.add(obj105);         
        slots.add(obj106);         
        slots.add(obj107);         
        slots.add(obj108);         
        slots.add(obj109);         
        slots.add(obj110);         
        slots.add(obj111);         
        slots.add(obj112);  
        
        
        return slots;
    }
    
    
    
}
