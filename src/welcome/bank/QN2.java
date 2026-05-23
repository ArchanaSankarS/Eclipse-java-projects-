package welcome.bank;
import java.util.ArrayList;
import java.util.LinkedList;


	

public class QN2 {

    public static void main(String[] args) {
    	
	        // Creating ArrayList
	        ArrayList<String> arrayList = new ArrayList<>();

	        // Creating LinkedList
	        LinkedList<String> linkedList = new LinkedList<>();

	        // Adding elements
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");

	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Cherry");

	        // Display elements
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // Insert element at middle
	        arrayList.add(1, "Mango");
	        linkedList.add(1, "Mango");

	        System.out.println("\nAfter insertion:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // Remove element
	        arrayList.remove("Banana");
	        linkedList.remove("Banana");

	        System.out.println("\nAfter deletion:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // Access element
	        System.out.println("\nAccessing second element:");
	        System.out.println("ArrayList: " + arrayList.get(2));
	        System.out.println("LinkedList: " + linkedList.get(2));
	    }
	}

