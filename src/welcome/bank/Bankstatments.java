package welcome.bank;
import java.util.Scanner;

public class Bankstatments {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 1000;
        int choice;
        int amount;

        do {
            
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Balance Check");
            System.out.println("4 Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                amount = sc.nextInt();

                balance = balance + amount;

                System.out.println("Deposit successful");
            }

            else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                amount = sc.nextInt();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Insufficient balance");
                }
            }

            else if (choice == 3) {
                System.out.println("Current balance = " + balance);
            }

            else if (choice == 4) {
                System.out.println("Thank you! Visit again");
            }

            else {
                System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}