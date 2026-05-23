package welcome.bank;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;



public class Queue1{
	 public static void main(String[] args) {
			Queue<String> Food = new LinkedList<String>();
			  Food.offer("chicken");
			  Food.offer("biriyani");
			  Food.offer("shawarma");
			  Food.offer("panipoori");
			   System.out.println(Food);  //  [chicken, biriyani, shawarma, panipoori]
              
			   	Food.remove();  
			   	System.out.println("Remove the element : "  + Food);  // Remove the element : [biriyani, shawarma, panipoori] >> remove the 1st element

			   
			   Food.add("Mutton");
			   System.out.println("Add the element" + Food);   //Add the element[biriyani, shawarma, panipoori, Mutton]  >> add the elment at the end
			  
			   Food.poll();
			   System.out.println("The element is " + Food); //The element is [shawarma, panipoori, Mutton]>>>poll means remove tha 1st element and retuns

			   Food.peek();
			   System.out.println("The peek element :  " + Food.peek()); // The peek element :  shawarma >> peek is return only the 1st element of the gn array
			  	
			
	}
	 
	 
	 
 }