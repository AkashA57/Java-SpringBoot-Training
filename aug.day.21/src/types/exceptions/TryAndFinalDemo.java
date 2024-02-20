package types.exceptions;

public class TryAndFinalDemo {

	public static void main(String[] args) {
		 int a=100;
		 int b=0;
		 int z=0;
		
		 
		 try {
			z=a/b;
			System.out.println("*******************");
		} 
		 
		 
		 finally {//finally block will come after the try block  
			System.out.println("Finally Block");
			System.out.println("Result(a/b)="+z);
		}
		
		 
		 System.out.println("End of main");
	}

}
