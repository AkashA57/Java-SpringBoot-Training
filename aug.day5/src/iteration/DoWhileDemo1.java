package iteration;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		// First 10 natural Numbers
		int i = 1;
		do {

			if (i == 5) {
				i++;
				continue;
			}

			System.out.println(i);
			
			i = i + 1;
			
		} while (i < 11);
	}
}