package welcome.bank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

	public class Listitera {
	    public static void main(String[] args) {

	        ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(100);
	        numbers.add(500);
	        numbers.add(600);
	        numbers.add(200);
	        numbers.add(300);
          
	        // change to iterator 
	        
	        Iterator<Integer> it = numbers.iterator();
	        
	        while (it.hasNext()) {
	        	
	        	if (it.next().equals(600))  {
	        		
	                it.remove();
	        	}   
	        }
	        
	        System.out.println("Forward iterator");
	        System.out.println(numbers); 
	        
	        //  change to Listiterator 
	        
	        ListIterator<Integer> it1 = numbers.listIterator(numbers.size());
	        
            System.out.println("Backward iterator");
            
           it1.hasPrevious();
            	
            	
            	 it1.previous();
            	
            	String bca = String.valueOf(xyz);
               
            	System.out.println(Arrays.toString(numbers.toArray(it1.previous())));
               
            }   
           
        }
       
    }

	           

	            
	        
	            
	            
	      



