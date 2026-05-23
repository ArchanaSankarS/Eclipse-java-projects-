package welcome.bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


 public class Iterator1{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
			
//		for(int i : numbers ) {
//			
//			System.out.println(i);
//			
//		}
		
    ListIterator li = numbers.listIterator(numbers.size());
    
//    while(li.hasNext()) {
//    	
//    	if (li.next().equals(10)) {
//    		
//    		li.remove();
//    	}
    
    li.add(100);
    	
    	 while(li.hasPrevious()) {
    		 
    		 if(li.previous().equals(20)) {
    			 
    			 li.set(55);
    		 }
    	    	
//    	    	System.out.println(li.previous());
    	    	}
    	    	

    	
    	
    	 		System.out.println(numbers);
    }

//		
		
	}

	
		
	
	
	


 


