package method.overriding;

public class Dog {
	String name = "Tommy";
	int tail = 2;
	int leg = 4;

	public void run() {
		System.out.println("Dog can run");
	}

	public void walk() {
		System.out.println("Dog can walk");
	}

	public void sleep() {
		System.out.println("Dog can sleep");
	}
}
