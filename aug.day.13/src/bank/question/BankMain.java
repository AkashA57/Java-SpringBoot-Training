package bank.question;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bank= new Bank();
		bank.getRateOfInterest();
		
//		System.out.println("SBI Bank");
//		bank = new SBI();
//		System.out.println("Simple Interest: " + bank.getRateOfInterest());
//		System.out.println();
//				
//		System.out.println("ICICI Bank");
//		bank = new ICICI();
//		System.out.println("Simple Interest: " + bank.getRateOfInterest());
//		System.out.println();
		
		System.out.println("AXIS Bank");
		bank = new AXIS();
		System.out.println("Simple Interest: ");
		bank.getRateOfInterest();
		System.out.println();
		

	}

}
