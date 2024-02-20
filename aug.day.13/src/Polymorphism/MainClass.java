package Polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// Hello see the concept of Polymorphism
		// Methods having same name, but behave in different ways is called Polymorphism
		Dog d;
		d=new Dog(); // Dog d=new Dog();
		d.run();
		System.out.println("----------------------------");
		d=new BlackDog();
		d.run();
		System.out.println("----------------------------");
		d=new WhiteDog();
		d.run();
		System.out.println("----------------------------");
		d=new BrownDog();
		d.run();
		
		}
}
