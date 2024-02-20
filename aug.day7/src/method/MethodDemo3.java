package method;

public class MethodDemo3 {

	
	
	
	//is main a method??? ---- yes
	//why??
	//since it returns void- means it does not return any value
	//String[] args ---this is input parameter for the main
	//this is used to take command line argument
	public static void main(String[] args) {
	// who call a method??    -----main method
		int wow=magic(3);
		System.out.println(wow);  //1
		System.out.println("-------");
		int wow1=magic(2);
		System.out.println(wow1); //101
		System.out.println("---printa--");
		printa(wow); //
		
		System.out.println("---foo--");
		foo();
		System.out.println(foo());
	
	}
 static int sum(int num1,int num2) {
	  int result=num1+num2;
	  return result; //replaced 0 with result
	  
 }
	//this is definition of magic mathod
 static int magic(int input) {
	 int result=9033%input; //0             ---1
	 result=result * 100;  //0 * 100 = 0    ---100
		return result+1;  //0 +1 = 1            ---101
 }
 
 static float foo() {
	 //not taking any parameter
	 return 1823.0f;
 }

  static void printa(int pp) {
	  
	System.out.println("***********************"+pp); 
	System.out.println("**********+pp+ **********"); 
	System.out.println("***********************");   
	  
  }
 
} 