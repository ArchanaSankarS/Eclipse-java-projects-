package welcome.bank;

import java.util.TreeSet;
public class QN5 {
    public static void main(String[] args) {
    	
		TreeSet<String> books = new TreeSet<>();
		//Add an elements using TreeSet
		books.add("Tamil");
		books.add("English");
		books.add("Maths");
		books.add("Science");
		books.add("Social");
		System.out.println(books);  //  output>>>>>>  [English, Maths, Science, Social, Tamil]
		 
		//Check if an Element Exists
		
		//books.contains("Tamil");
		System.out.println(books.contains("Tamil"));  //output >>>>>>> true >>>>>  because the element is include in the array
		System.out.println(books.contains("Botony")); //output >>>>>>> false >>>>> because the element is not in the array
		 
		// Remove an element
		//books.clear();
	   // System.out.println(books);  // output >>>>>> []  >>>> becasue clear the all element so the array  is empty
	     
	    //TreeSet Size
	    books.size();
	    System.out.println(books.size());  //output >>>>> 5 >>>> lenght is 5
	     
	  
	}
}
