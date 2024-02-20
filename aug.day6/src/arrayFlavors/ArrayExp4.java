package arrayFlavors;

public class ArrayExp4 {

	public static void main(String[] args) {
		// flavor of creating another type of Array
				// new int[] {..........} can be passed to method as a parameter
				int arr[]=new int[] {12,16,10,9};
				System.out.println("Printing Values of Array using For Loop--");
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
					
					arr[i]=arr[i]*3; //here we are multiplying by 3 with its value exist in 
					//line number 8 and storing the same
							}
				
				System.out.println("******Using classical for loop******");
				System.out.println("After multiplication, new values of Array are:" );
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
			   }
				System.out.println("****Using for each loop*******");
				System.out.println("Another syntax to print elements of the Array----");
				for (int abc  : arr) {
					System.out.println(abc);
				}
       	  }
  }
