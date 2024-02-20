package types.exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		int num1 = 300;
		int num2 = 3;
		try {
			int result = num1 / num2;
			System.out.println("Result of num1/num2=" + result);
			System.out.println("Thanks, comuputation is done");
			
			
			if (result == 10) {
				System.exit(0);// Finally will not be executed in this case if you are using
								// System.exit(0),otherwise execute
				return;
				
			}
		}

		catch (ArithmeticException e) {
			System.out.println("caught");

		} 
		
		catch (Exception e) {
			System.out.println("General");

		}
		finally {
			System.out.println("This is finally block");
		}
		

		System.out.println("More dummy message");
		System.out.println("End of main-------");
	}

}
