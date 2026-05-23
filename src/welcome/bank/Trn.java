package welcome.bank;


	public class Trn {
		
		
		private static final Object CAccNo = 1925;
		private static final Object CDeposit = 2000;
		private static final Object CWithdrawen = 500;
		private static final Object CDeposit1 = 1000;
		private static final Object CWithdrawen1 = 300;

		public static void main(String[] args) {
			
			String CName = "Archana";
			int AccNo ;
			 int Deposit ;
			 int Withdrawen ;
			
			//Create an array with 5 slots for transactions
			
			//String[] transaction = new String[4];
								
//						transaction[1] = "Deposit Rs 100";
//						transaction[2] = "Withdrawen Rs 20000";
//						transaction[3] = "Deposit Rs 400";
//						transaction[4] = "Withdrawen Rs 200";
//		
			

			
//			System.out.println("======Recipt========");
//			System.out.println("Name " + CName );
//			System.out.println("Acoount Number " + AccNo);
//			
			
			
			StringBuilder sb = new StringBuilder();
			sb.append("Name ").append(CName).append("\n");
			sb.append("AccNo ").append(CAccNo).append("\n");
			sb.append("Deposit ").append(CDeposit).append("\n");
			sb.append("Withdrawen ").append(CWithdrawen).append("\n");
			sb.append("Deposit ").append(CDeposit1).append("\n");
			sb.append("Withdrawen ").append(CWithdrawen1).append("\n");



	     // Task complete this the output should be

//	           ======Recipt========
//	Name Archana
//	Acoount Number 10001
//	Deposit Rs 100
//	Withdrawen Rs 20000
//	Deposit Rs 400
//	Withdrawen Rs 200
//		
//			for (int i = 0; i < transaction.length; i++) {
//				
//				System.out.println(transaction[i] );
//				
//			}

			
			System.out.println(sb.toString());
				}

			}
			
			
			
			
	



