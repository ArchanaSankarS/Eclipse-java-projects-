package welcome.bank;
import java.util.ArrayDeque;

public class ArrDe {
  public static void main(String[] args) {
	  ArrayDeque <Integer> name= new ArrayDeque <Integer>();
	  name.addFirst(10);
	  name.addFirst(20);
	  name.addFirst(60);
	  name.addFirst(50);
	  
	  
	  name.addFirst(40);
	  System.out.println(name);  //If you use addFirst(), the last added element comes first. >>>>output is [40, 50, 60, 20, 10]
	 
	  name.addLast(90);
	  System.out.println(name); // addLats() , add the element is last . >>>>>>>>> output is [40, 50, 60, 20, 10, 90]
	  
	  name.removeFirst();
	  System.out.println(name);  // remove the 1st ele >>>>> output is [50, 60, 20, 10, 90]
 
	  name.peekFirst();
	  System.out.println(name.peekFirst());  //Views front element without removing >>>output is 50
	  
	  name.peekLast();
	  System.out.println(name.peekLast()); // Views front element without removing >>>output is 90
	  
	  name.push(300);
	  System.out.println(name); //push() adds element to the front, so last added comes first. >>>> output is [300, 50, 60, 20, 10, 90]
	  
	 name.pop();
	 System.out.println(name);  //pop() Removes and returns the top element >>>> output is [50, 60, 20, 10, 90]


}
}
