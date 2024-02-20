
public class Elephant {
	
	int leg;
	String name;
	float speed;
	
	public Elephant() {
		
	}
	
	public Elephant(int x) {
		leg = x;
	}
	
	public Elephant(String x) {
		name = x;
	} 
	
	public Elephant(float x) {
		speed = x;
	}
	
	public Elephant(int x, String y) {
		leg = x;
		name = y;
	}
	
	public Elephant(String x, int y) {
		name = x;
		leg = y;
	}
	
	public Elephant(int x, float y) {
		leg = x;
		speed =y;
	}
	
	public Elephant(float x, int y) {
		speed = x;
		leg = y;
	}
	
	public Elephant(float x, String y) {
		speed = x;
		name = y;
	}
	
	public Elephant(String x, float y) {
		name = x;
		speed = y;
	}
	
	public Elephant(int x, float y, String z) {
		leg = x;
		speed = y;
		name = z;
	}
	
	public Elephant(int x, String y, float z) {
		leg = x;
		name = y;
		speed = z;
	}
	
	public Elephant(float x, int y, String z) {
		speed = x;
		leg = y;
		name = z;
	}
	
	public Elephant(float x, String y, int z) {
		speed = x;
		name = y;
		leg = z;
	}
	
	public Elephant(String x, int y, float z) {
		name = x;
		leg = y;
		speed = z;
	}
	
	public Elephant(String x, float y, int z) {
		name = x;
		speed = y;
		leg = z;
	}
	
	
	
	@Override
	public String toString() {
		return "Elephant [leg=" + leg + ", name=" + name + ", speed=" + speed + "]";
	}

	public static void main(String[] args) {
		Elephant d1 = new Elephant();
		
		Elephant d2 = new Elephant(4);
		System.out.println(d2);
		System.out.println();
		
		Elephant d3 = new Elephant("Akash");
		System.out.println(d3);
		System.out.println();
		
		Elephant d4 = new Elephant(3.43f);
		System.out.println(d4);
		System.out.println();
		
		Elephant d5 = new Elephant(5, "asas");
		System.out.println(d5);
		System.out.println();
		
		Elephant d6 = new Elephant("fdf", 6);
		System.out.println(d6);
		System.out.println();
		
		Elephant d7 = new Elephant(45, 56.43f);
		System.out.println(d7);
		System.out.println();
		
		Elephant d8 = new Elephant(34.22f, 1);
		System.out.println(d8);
		System.out.println();
		
		Elephant d9 = new Elephant("tiger",1.2f);
		System.out.println();
		System.out.println();
		
		Elephant d10 = new Elephant(3.2f, "queen");
		System.out.println();
		System.out.println();
		
		Elephant d11 = new Elephant(7, 12f, "printing");
		System.out.println();
		System.out.println();
		
		Elephant d12 = new Elephant(4, "ewe", 3.21f);
		System.out.println(d12);
		System.out.println();
		
		Elephant d13 = new Elephant();
		System.out.println(d13);
		System.out.println();
		
		Elephant d14 = new Elephant();
		System.out.println(d14);
		System.out.println();
		
		Elephant d15 = new Elephant();
		System.out.println(d15);
		System.out.println();
		
		Elephant d16 = new Elephant();
		System.out.println();
		System.out.println();
	}
	
}
