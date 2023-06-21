
package tutiioncentrebooking;

import java.util.ArrayList;


public class Tutors {
 
    
    private String name;
    private String email;
    private String phone;
    private String gender;
    private int age;

    
    public static ArrayList <Tutors> tutorList = new ArrayList<>();

    
    public Tutors(String name, String email, String phone, String gender, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    
    
    public static ArrayList getTutors() {
        return tutorList;
    }

    
}
