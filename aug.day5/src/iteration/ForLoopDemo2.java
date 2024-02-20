package iteration;

public class ForLoopDemo2 {
//table of 2 to 10
	public static void main(String[] args) {
     int x;
		for (x = 2; x <= 10; x++) {
			for (int a = 1; a <= 10; a++) {
				
				System.out.println(x+"*"+a+"="+ x*a);
				
				
			}
			System.out.println("******");
			System.out.print("\n");
		
		}
		

	}

}