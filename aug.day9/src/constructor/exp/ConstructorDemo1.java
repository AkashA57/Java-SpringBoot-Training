package constructor.exp;

public class ConstructorDemo1 {

	String name="Tommy";
	int eyes=2;
	int tail=1;
	String color="blue";
	
	//created first constructor which is default type
	public ConstructorDemo1() {
		System.out.println("No arg Constructor called"); 
	}
	
	//created second constructor which is parameterized having 2 parameters
	public ConstructorDemo1(String n, int e) {
		name=n;
		eyes=e;
	}
	
	//created third constructor which is parameterized having 3 parameters
	public ConstructorDemo1(int p, String q,String c) {
		eyes=p;
		name=q;
		color=c;
	}
	
	
	public void run() {
		System.out.println("Dog is running");
	}
	
	public void print() {
		System.out.println(tail);
	}

	public static void main(String[] args) {
		//default constructor
		ConstructorDemo1 d1 = new ConstructorDemo1();
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.eyes);
		System.out.println(d1.tail);
		d1.run();
		d1.print();
		System.out.println("------------------");
		
		//parameterized constructor, having two parameters
		ConstructorDemo1 d2 = new ConstructorDemo1("Boby", 4);
		System.out.println(d2.name);
		System.out.println(d2.eyes);
		d2.run();
		d2.print();

		System.out.println("------------------");
		//parameterized constructor, having three parameters
		ConstructorDemo1 d3 = new ConstructorDemo1(3, "Jack", "red");
		System.out.println(d3.eyes);
		System.out.println(d3.name);
		System.out.println(d3.color);
		d3.run();
		d3.print();
	}
}
