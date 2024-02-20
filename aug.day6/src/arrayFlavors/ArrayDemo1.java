package arrayFlavors;

import java.util.Iterator;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// This is just syntax of array definition1
		//int num1[]=new int[4];
		// This is just syntax of array definition2
		//int[] num2=new int[4];
		// This is just syntax of array definition3
		//int []num3=new int[4];
		// This is just syntax of array definition4
		//int [] num4=new int[4];
		// num holds multiple values at a time. 
		
		 //int arr1[]= {9,6,10,34,11,13};//here no need to give length of aaray
		 //int arr2[]= new int[]{9,6,10,34,11,13};
		 //int arr3[]=new int[4];
		 
		//In simple variable we can pass single value at a moment
		int num[]=new int[4];
		num[0]=12;
		num[1]=9;
		num[2]=27;
		num[3]=10;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println("_________________________________________");
		System.out.println("Printing array data using loop");
		for (int x = 0; x<num.length; x++) {
			System.out.println(num [x]);
		} 
		// If we want to sum of array element, we can do.....
		System.out.println("I Want to perform sum operation on given array");
		int sum=0;
		for (int x = 0; x<num.length; x++) {
			sum=sum+num[x];
		} 
		System.out.println("Total Sum="+sum);
		System.out.println("_________________________________________");
		// we can update the values of arrays
		num[2]=0;
		num[3]=80;
		System.out.println("After deleting/updating last TWO VALUES(DELETING MEANS JUST PUTTING DAFAULT VALUES), Printing array data using loop");
		for (int x = 0; x<num.length; x++) {
			System.out.println(num [x]); 
						
		} 
	  }
}