package arrayFlavors;

public class ArrayExp1 {

	public static void main(String[] args) {
		// This is just syntax of array definition1
		// int num1[]=new int[8];
		// This is just syntax of array definition2
		// int[] num2=new int[8];
		// This is just syntax of array definition3
		// int []num3=new int[8];
		// This is just syntax of array definition4
		// int [] num4=new int[8];

		// int arr1[]= {9,6,10,34,11,13};//here no need to give length of aaray
		// int arr2[]= new int[]{9,6,10,34,11,13};
		// int arr3[]=new int[4];

		// num holds multiple values at a time.
		// In simple variable we can pass single value at a moment
		int num[] = new int[8];
		num[0] = 12;
		num[1] = 9;
		num[2] = 27;
		num[3] = 10;
		num[4] = 90;
		num[5] = 100;
		num[6] = 110;
		num[7] = 120;
		System.out.println("Print Array Values ------");
		
		System.out.println(num[0]);//it will print first value
		System.out.println(num[1]);//it will print second value
		System.out.println(num[2]);// and so on
		System.out.println(num[3]);
		System.out.println(num[4]);
		System.out.println(num[5]);
		System.out.println(num[6]);
		System.out.println(num[7]);

	}

}