package iteration;

import java.util.Iterator;

public class ContinueExp {

	public static void main(String[] args) {
		// printing 0 to 9 natural number
		for (int i = 0; i < 10; i++) {
			if (i == 1) {
				break;
			}

			System.out.println("Print the value of i==" + i);
		}

	}
}