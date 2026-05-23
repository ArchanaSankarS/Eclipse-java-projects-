
	package welcome.bank;


	public class CAB {
		


		public static void main(String[] args) {
			
			String CName = "Archana";
			int AccNo  = 1001;
//			 int Deposit ;
//			 int Withdrawen ;
			
			//Create an array with 5 slots for transactions
			
			String[] transaction = new String[4];
			
			            transaction[0] = "Deposit Rs 100";
						transaction[1] = "Deposit Rs 100";
						transaction[2] = "Withdrawen Rs 20000";
						transaction[3] = "Deposit Rs 400";
						
		
			

			
//			System.out.println("======Recipt========");
//			System.out.println("Name " + CName );
//			System.out.println("Acoount Number " + AccNo);
			
			
			
			StringBuilder sb = new StringBuilder();
			sb.append("Name : ").append(CName).append("\n");
			sb.append("AccNo : ").append(AccNo).append("\n");



	 		
			for (int i = 0; i < transaction.length; i++) {
				
				sb.append(transaction[i] );
				
			}

			
			System.out.println(sb.toString());
				}

			}
			
			
			
			
	






