package welcome.bank;

import java.util.Scanner;

public class Amont{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double balance = 10000;
		
		System.out.println("Enter your amount");
		double amount = sc.nextDouble();
		// check when the amount is greater than zero
		if (amount<0) {
			System.out.println("Input Validation failed:");
		}
		
			else if (amount>balance){
				System.out.println("Insufficient balance");
			
		
		}
			else {
				System.out.println("Withdraw Succesffuly");
				balance = balance-amount;
				System.out.println("Remaining balance:" +  balance);
				
			}
		
			
		
		
	}
}
