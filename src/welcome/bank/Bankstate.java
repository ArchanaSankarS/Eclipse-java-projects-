package welcome.bank;

import java.util.Scanner;

public class Bankstate {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		String transaction[] = new String[3];
		int tnxcount = 0;
	
		//int amount;
		double balance = 1000;
		
		do {
			System.out.println("1.DEPOSIT AMOUNT");
			System.out.println("2.AMOUNT WITHDRAW");
			System.out.println("3.CHECK BALANCE");
			System.out.println("4. EXIT");
			   System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		
		//deposit the money to the bank
		
		if (choice ==1) {
			System.out.println("Enter amount to Deposit");
			 double amount = sc.nextInt();

             balance += amount; //Balance = balance + amount

             System.out.println("Available Balence is " + balance);
             
             if(tnxcount < 3) {
            	 
            	 transaction[tnxcount++] = "Deposit ₹ " + amount; // tnxcout = 0 ,1
            	             
            	 
             }
		}
		
		
		//withdraw the amount1
		
		
		else if (choice ==2) {
			System.out.println("Enter amount to Withdraw");
			  double amount = sc.nextInt();
			if (amount<=balance) 
			{  balance -= amount; //balance = balance - amount
			
				System.out.println("succseefuly withdraw your amount");
			}
			else {
				System.out.println("insufficient balance");
			}
			if(tnxcount < 3) {
           	 
           	 transaction[tnxcount++] = "Withdrawn ₹ " + amount;
           	 
            }
			
		}
		
		//balance checking process
		else if (choice ==3) {
			System.out.println("current balance"+balance);
			
		}
		
		//Exit process
		
		else if (choice==4) {
			System.out.println("Thankyou visit again");
		}
		else {
			System.out.println("Invalid process");
		}
		}
		while (choice!=4);
		
		for (int i = 0; i < transaction.length; i++) {
			System.out.println(transaction[i]);
			
		}
		
			sc.close();
		
	}

}
