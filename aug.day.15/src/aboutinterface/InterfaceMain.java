package aboutinterface;

public class InterfaceMain {

	public static void main(String[] args) {
		

		Cat cat = new Cat();
		
		cat.jump();
		cat.pounce();
		cat.sleep();
		
		System.out.println("-----------------");
		
		System.out.println(cat.name);
		System.out.println(cat.claws);
		System.out.println(cat.whiskers);
		

	}

}
