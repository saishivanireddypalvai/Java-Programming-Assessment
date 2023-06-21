
package tutiioncentrebooking;

import java.util.ArrayList;


public class TutorFeedback {
    
    private int weekNumber;
    private String tutor;
    private String subject;
    private String student;
    private String feedback;
    private String rating;

    public static ArrayList <TutorFeedback> feedbackList = new ArrayList<>();

    public TutorFeedback(int weekNumber, String tutor, String subject, String student, String feedback, String rating) {
        this.weekNumber = weekNumber;
        this.tutor = tutor;
        this.subject = subject;
        this.student = student;
        this.feedback = feedback;
        this.rating = rating;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public String getTutor() {
        return tutor;
    }

    public String getSubject() {
        return subject;
    }

    public String getStudent() {
        return student;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getRating() {
        return rating;
    }
    
    public static ArrayList getFeedbacks() {
        return feedbackList;
    }
}
