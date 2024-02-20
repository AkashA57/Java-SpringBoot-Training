package iteration;


public class PrimeNumber1 {

	public static void main(String[] args) {
		// Prime is Number which is only
				//Divisible by itself
				int num = 2;
				int flag = 0;
				
				for (int x = 2; x <= num/2; x++) {
					//x=2 to 36
					if (num % x==0) {
						//if your program control comes inside this block
						//then number is not prime
						flag=1;
						break; //Please stop the loop immediately 
						// break is used to terminate the loop
					}
				}
				if (flag==0) {
					System.out.println("Given number is PRIME NUMBER");
				} else {
					System.out.println("Given number is not PRIME NUMBER");
				}

	}

}