package inheritance.prac;

public class MainClass {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.run();
		d.walk();
		//d.bark();
	// d.bark() -not executed because it is a member of BarkDog class 
		
		System.out.println("----------------------------");
		System.out.println("See the effect of upcasting");
		System.out.println("----------------------------");
		// up casting
		   // Dog b;
		  //  b=new BarkDog();
		    
// we can assigned it as follow also-		    
		  Dog b=new BarkDog();   
             b.walk();
             b.run();
            //b.bark();   
             // b.bark() -- will show compile time error 
             //because bark() is not a part of Dog Class
             
            System.out.println("----------------------------");
     		System.out.println("See the effect of downcasting");
     		System.out.println("----------------------------");
     		Dog e;
		    e=new BarkDog();
		    BarkDog bd=(BarkDog)e;
		 // we can assigned it as follow also-		    
			   //BarkDog bd=new BarkDog();   	    
		    bd.bark(); //succeed to access bark method
			bd.walk();// now we can access the method of super class from sub class
			bd.run();// now we can access the method of super class from sub class 
			System.out.println("----------------------------");
			System.out.println("--------upcasting----------");
			BarkDog p=new BarkDog();
			p.bark();
			p.walk();
			p.run();
	} 
}
