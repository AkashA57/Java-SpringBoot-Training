package block;

public class LoaderBlock {
	
	int x = 786;
	
	void print() {
		System.out.println("Value of x = " + x);
	}
	
	LoaderBlock() {
		System.out.println("I am no-arg constructor");
	}
	
	//define instance block
	{
		System.out.println("I am a non static block");
		x++;
	}
	
	static {
		System.out.println("I am a static block");
	}
	
	static {
		System.out.println("I am a static block no 2");
	}
	
}
