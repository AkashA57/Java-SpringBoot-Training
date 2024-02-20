package method.overriding1;

public class MainClass {

	public static void main(String[] args) {
		Dog d=new Dog();
		 d.walk();
		 d.sleep();
		 
			
	 //d.bark() -not executed because it is a not member of Dog class 
		 //Overriding is about same method, same signature 
		 //but different classes connected through inheritance.
		 //Method overriding is used for polymorphism
		System.out.println("----------------------------");
		System.out.println("Given below See the effect of Method Overriding");
		System.out.println("-----------upcasting-------------");
	       
		  d=new BarkDog();
		   d.walk();
		   d.run();
		   //d.bark();
		   
		   System.out.println("-----------Downcasting ----------");
		   BarkDog bd=(BarkDog)d; //down casting
		   bd.bark();
		   bd.run();
		   
 	} 
}