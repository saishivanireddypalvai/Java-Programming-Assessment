
package tutiioncentrebooking;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static tutiioncentrebooking.TutiionCentreBooking.mainMenu;
import static tutiioncentrebooking.TutiionCentreBooking.subjectSlots;


public class SubjectFilter implements Filter {
    
    
    @Override
    public void applyFilter() {
         List<Slots> slots = Slots.getSlots();
                
        Map<String, String> map = new LinkedHashMap<>();
        HashSet<String> uniqueSubjects = new HashSet<>();
        
        
        System.out.println("\n");
        System.out.println("==================================================");
        System.out.printf("%-10s %-40s %n", "S.No.","Subject");
        System.out.println("==================================================");
        System.out.println();
        int increment = 1;
        int increment1 = 1;
        String subjectCounter = "";
        
        for(int i=0; i<slots.size(); i++){
            String subjectName = slots.get(i).getSubject().getSubName();
            uniqueSubjects.add(subjectName);
            increment = increment + 1;
        }
        
        for (String subject : uniqueSubjects) {
            subjectCounter = String.valueOf(increment1);
            System.out.printf("%-10s %-40s %n%n", increment1,
                    subject);
            map.put(subjectCounter, subject);
            increment1 = increment1 + 1;
        }


        System.out.println("--------------------------------------------------\n");
             
        System.out.print("Choose any Subject from above menu to apply filter : ");
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
                String selectedSubject = map.get(choicenum);
                subjectSlots(selectedSubject);
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
