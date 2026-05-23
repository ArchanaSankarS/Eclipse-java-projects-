package welcome.bank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collectionutility {
	
	

	    public static void main(String[] args) {

	        ArrayList<Integer> numbers = new ArrayList<>();
	        ArrayList<Integer> source = new ArrayList<>(Collections.nCopies(5,0));
	        

	        numbers.add(30);
	        numbers.add(60);
	        numbers.add(50);
	        numbers.add(20);
	        numbers.add(20);
  
//	        source.add(0);
//	        source.add(1);
//	        source.add(2);
//	        source.add(3);
//	        source.add(4);
	        Collections.copy( source,numbers);
	        System.out.println("arch" +source);
	        
	        System.out.println("Original List: " + numbers);

	        // sort the numbers
	        Collections.sort(numbers);
	        System.out.println("Sorted List: " + numbers);

	        // reverse the numbers 
	        Collections.reverse(numbers);
	        System.out.println("Reverse List: " + numbers);

	        // maximum of the gn ele
	        System.out.println("Maximum: " + Collections.max(numbers));

	        // minimum of the gn ele
	        System.out.println("Minimum: " + Collections.min(numbers));
	        
	       //reverse the element
	        Collections.reverse(numbers);

	        System.out.println("Reverse : " + numbers);
	        
	        //shuffle the numbers
	        Collections.shuffle(numbers);
	        System.out.println("Shuffle :" + numbers);
	        
	        //frequency the elements
	        int count = Collections.frequency(numbers, 20);

	        System.out.println("Frequency : " + count);
	        
	        // Replace all elements with obj
//	        Collections.fill(numbers, 200);
//	        System.out.println("Fill " + numbers);
	        
	        //copyies src list into dest list
	       // Collections.copy( source,numbers);
	        //System.out.println("copy " + numbers);
	       // System.out.println(source);
	        
	    }
	}

