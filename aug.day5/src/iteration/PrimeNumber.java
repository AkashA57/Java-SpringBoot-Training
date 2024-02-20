package iteration;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime is Number which is only
		//Divisible by itself
		int num=13;
		int flag=0;
		for (int x = 2; x < num/2; x++) {
			//x=2 to 36
			if (num%x==0) {
				//if your program control comes inside this bock
				//then number is not prime
				flag=1;
			}
		}
		if (flag==0) {
			System.out.println("Given number is PRIME NUMBER");
		} else {
			System.out.println("Given number is not PRIME NUMBER");
		}

	}

}