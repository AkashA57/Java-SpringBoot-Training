package method.overriding;

public class BarkDog extends Dog{
	
	public void bark() {
	System.out.println("Dog can bark");
     } 
	
	
//	public void sleep() {
//		//System.out.println("Dog can sleep"); - Dog class
//		System.out.println("Dog can sleep 4 to 6 hours");
//	     } 
	
	
	public void walk() {
		//System.out.println("Dog can walk");--- Dog class
		System.out.println("My Dog walks in the early morning ");
	}
}

