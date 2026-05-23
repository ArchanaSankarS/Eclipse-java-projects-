package welcome.bank;
import java.util.HashMap;

  public class QN4 {
     public static void main(String[] args) {
    	 
	  HashMap<Integer, String> grade = new HashMap<>();
	  
	  grade.put(98,"Atchaya");
	  grade.put(95,"Archana");
	  grade.put(90,"priya");
	  grade.put(91,"Sabar");
	  
	  // Display grades
      System.out.println("Student Grades:" + grade);
  
      // Get grade of a student
      System.out.println("Student with 95 marks: " + grade.get(95));}
}
