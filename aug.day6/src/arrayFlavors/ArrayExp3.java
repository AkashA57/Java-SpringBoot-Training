package arrayFlavors;

public class ArrayExp3 {

	public static void main(String[] args) {
		int num[] = new int[4];
		num[0] = 12;
		num[1] = 9;
		num[2] = 27;// 0
		num[3] = 10;//80

		//Printing data of array
		System.out.println("Printing data-----");
				for (int x = 0; x < num.length; x++) {
		System.out.println(num[x]);	
		}
		
		// sum of array element, we can do.....
		System.out.println("sum operation on given array-----");
		int sum = 0;
		for (int x = 0; x < num.length; x++) {
			sum = sum + num[x];
		}
		System.out.println("Total Sum=" + sum);
		System.out.println("_________________________________________");
		
		
		// we can update the values of arrays
		num[2] = 0;
		num[3] = 80;
		System.out.println("After updating last TWO VALUES of given array, Printing updated array data using loop\"");
		for (int x = 0; x < num.length; x++) {
			System.out.println(num[x]);
		}
		
		
	}
}