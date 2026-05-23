package welcome.bank;

class Age{

	
	 int a;
	 
	 void checkAge(int a) th {
		
		if(a > 18) {
			
			throw new IllegalArgumentException("your age is below 12");
		}
		
		System.out.println("your age is above 12");
		
	} 


}






public class Tr {
	
   public static void main(String[] args) {
	   
	  Age a = new Age();
	  
	  
	  try {
		  
		  a.checkAge(15);
	  }
		
	 catch (IllegalArgumentException e) {
		// TODO: handle exception
		 
		 System.out.println(e.getMessage());
	}
   
   
  
   } 
	
}


