
package tutiioncentrebooking;

import java.util.ArrayList;


public class Students {
    
    
    private String name;
    private String contact;
    private String dob;
    private String gender;
    private String status;

    public Students(String name, String contact, String dob, String gender, String status) {
        this.name = name;
        this.contact = contact;
        this.dob = dob;
        this.gender = gender;
        this.status = status;
    }
    
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getContact() {
        return contact;
    }

    public String getStatus() {
        return status;
    }
    
    
    public static ArrayList getStudents() {
        ArrayList <Students> studentsList = new ArrayList<>();
        
        Students obj1 = new Students("Carlie","020 8421 5550","12April,1996","Male","Active");
        Students obj2 = new Students("Harris","01305 787758","08May,1998","Male","Active");
        Students obj3 = new Students("Robertson","01625 662119","05June,1993","Male","Active");
        Students obj4 = new Students("Davis","01283 216091","18July,2000","Male","Active");
        Students obj5 = new Students("Becky","0844 561 0000","23August,2001","Male","Active");
        Students obj6 = new Students("Evans","0121 633 2920","07October,2003","Male","Active");
        Students obj7 = new Students("Alice","01787 376395","17November,1998","Female","Active");
        Students obj8 = new Students("Baker","01463 234750","25February,1999","Male","Active");
        Students obj9 = new Students("Charles","01465 711000","09March,2003","Male","Active");
        Students obj10 = new Students("Scott","01772 750076","19April,2000","Male","Active");
        
        studentsList.add(obj1);
        studentsList.add(obj2);
        studentsList.add(obj3);
        studentsList.add(obj4);
        studentsList.add(obj5);
        studentsList.add(obj6);
        studentsList.add(obj7);
        studentsList.add(obj8);
        studentsList.add(obj9);
        studentsList.add(obj10);
        
        return studentsList;
    }
    
}
