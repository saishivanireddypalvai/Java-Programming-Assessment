
package tutiioncentrebooking;

import java.util.ArrayList;


public class Subjects {
    
    private String subName;
    private String fees;

    public static ArrayList <Subjects> subjectList = new ArrayList<>();

        
    public Subjects(String subName, String fees) {
        this.subName = subName;
        this.fees = fees;
    }

    public String getSubName() {
        return subName;
    }

    public String getFees() {
        return fees;
    }
    
    public static ArrayList getSubjects() {
        return subjectList;
    }
    
    
    
}
