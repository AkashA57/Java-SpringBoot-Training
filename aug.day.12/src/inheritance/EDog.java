package inheritance;

public class EDog extends Dog{
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.run();
		d.walk();
		//d.sleep(); //Dog cannot access behavior and attributes of its subclass.
		
		EDog d1 = new EDog();
		d1.run();
		d1.walk();
		d1.sleep(); // Subclass can access behavior and attributes of it super class. 
		
	}
	
	public void sleep() {
		System.out.println("Dog can sleep");
	}
	
}
