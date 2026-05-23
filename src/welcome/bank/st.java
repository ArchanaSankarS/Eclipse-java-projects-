package welcome.bank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class st {
	public static void main(String[] args) {
		
		Queue<Integer> Ab = new LinkedList<>(); 
		
		
		Ab.add(10);
		Ab.add(20);
		Ab.add(21);
		Ab.add(23);
		Ab.add(27);
		Ab.add(29);
		  
		Ab.poll(); //FIFO
		
		
		
		System.out.println(Ab);
//		System.out.println(Ab.peek());
		
		
		
		
	}

}
