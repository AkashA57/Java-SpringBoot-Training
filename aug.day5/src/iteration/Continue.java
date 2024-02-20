package iteration;


public class Continue {
// Program for Print Odd number which comes between 1 to 100
	public static void main(String[] args) {

		for (int x = 1; x <= 100; x++) {
			if (x % 2 == 0) {
				continue;
				// if do not want to complete the
				// loop for particular Iteration

			}
			System.out.println(x);
		}
		for (int x = 0; x <= 100; x++) {
			if (x % 2 == 1) {
				System.out.println("Odd Number=" + x);
			}
		}
	}

}
