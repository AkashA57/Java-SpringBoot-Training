package block;

public class MobileVarMain {

	public static void main(String[] args) {
		// for MobileVar class template
		
		MobileVar mv1 = new MobileVar("Nokia", "pink");
		MobileVar mv2 = new MobileVar("Samsung", "blue");
		
		mv1.info();
		System.out.println("___________________");
		
		//MobileVar mv2 = new MobileVar("Samsung", "blue");
		
		mv1.info();
		System.out.println("___________________");

		mv2.info();
		}
}
