
package tutiioncentrebooking;


public class FilterFactory {
    
    
    public Filter createFilterType(String filterType) {
        if (filterType.equalsIgnoreCase("subject")) {
            return new SubjectFilter();
        } if (filterType.equalsIgnoreCase("tutor")) {
            return new TutorFilter();
        }
        return null;
    }
}
