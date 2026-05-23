package welcome.bank;
import java.util.ArrayList;

public class list {


  

  public static void main(String[] args) {
	  ArrayList<String> fruits = new ArrayList<String>();
	 
	  fruits.add("Apple");
	  fruits.add( "Banana");
	  fruits.add( "Cucumber");
	  fruits.add( "Orange");
	  fruits.add( "Graphes");
	  
	  fruits.add(2, "Mango"); //just add 2nd place mango
	  fruits.size();
	  System.out.println(fruits); //op>>>>[Graphes, Orange, Cucumber, Banana, Apple]
      System.out.println(fruits.get(1)); //get the 4th index of the element
      System.out.println(fruits.size()); //elements size (or)lenght ..the output is 6
      System.out.println(fruits.contains("Banana"));//the statments is checked wheather true or false >>
      System.out.println(fruits.contains("kiwi"));//the statments is false 
      System.out.println(fruits.indexOf("Apple")); //positon of the element
  
	  
}
}
