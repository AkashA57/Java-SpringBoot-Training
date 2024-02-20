package oops.concept;

public class DogMain {

	public static void main(String[] args) {
		
		//Creating an object
		Dog d = new Dog();
		
		//calling the method
		d.run();
		System.out.println();
		d.swim();
		System.out.println();
		d.print();
		System.out.println();
		
		//setting attribute
		d.color="golden";
		System.out.println("Another breed");
		d.print();
		
		System.out.println();
		
		//Creating another object
		Dog e = new Dog();
		System.out.println();
		System.out.println("new address");
		
		e.print();

	}

}
