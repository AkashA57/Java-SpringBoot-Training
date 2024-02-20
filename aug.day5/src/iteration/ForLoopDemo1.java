package iteration;

public class ForLoopDemo1 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		for(x=2; x<=10; x++) {
			
			for(y=1; y<=10; y++) {
				
				System.out.println(x + " times " + y + " is " + x*y);
				
			}
			
			System.out.println("Outer loop");
			System.out.println();
			
		}

	}

}
