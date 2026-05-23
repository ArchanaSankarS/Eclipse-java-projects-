package welcome.bank;
import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Map {
  

   public static void main(String[] args) {
		
		TreeMap<Integer, String> fruits = new TreeMap<>();
		fruits.put(1, "Banana");
		fruits.put(2, "Apple");
		fruits.put(3, "Gowa");
		fruits.put(4, "Cucumber");
		fruits.put(5, "papaya");
	
	
	    fruits.put(1, "Mango"); //adds data with replace  then the outputs is >>>> {1=Mango, 2=Apple, 3=Gowa, 4=Cucumber, 5=papaya}
	    
     System.out.println(fruits); //{1=Banana, 2=Apple, 3=Gowa, 4=Cucumber, 5=papaya}
     
     System.out.println(fruits.get(30)); // the 2nd element is Apple so the output is >>>>>>>>>> Apple>>>>>>>>
     
     System.out.println(fruits.remove(3)); //the 3rd element has been removed  >>>>>>Gowa>>>>>>>>>>>
     
     System.out.println(fruits.containsKey(6)); // like boolean in the given element is include op is true otherwise result is false >>> false >>>
     
     System.out.println(fruits.size());  //length of the element  >>>>> 4 >>>>>
     
     System.out.println(fruits.keySet());   // return all keys >>>>> output is  >>>>>>>[1, 2, 4, 5]
     
     System.out.println(fruits.entrySet());   // return the values >>>>output is >>>>> [1=Mango, 2=Apple, 4=Cucumber, 5=papaya]
    
   }
}
