package arrayFlavors;


public class ArrayExp2 {

	public static void main(String[] args) {
		int num[]=new int[4];
		num[0]=12;
		num[1]=9;
		num[2]=27;
		num[3]=10;	
		
		System.out.println("Printing array data using loop");
     for (int x = 0; x<num.length; x++) {
	      System.out.println(num[x]);
       	}
	}
}