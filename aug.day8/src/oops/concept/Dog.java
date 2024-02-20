package oops.concept;

public class Dog {
	
	int noOfTeeth = 50;
	int noOfLegs = 4;
	String color = "black and brown";
	
	void run() {
		System.out.println("It can run upto 60mph");
		
	}

	void swim() {
		System.out.println("It cannot swim");
		
	}
	
	void print() {
		System.out.println("teeth = " + noOfTeeth);
		System.out.println("No Of Legs = " + noOfLegs);
		System.out.println("Fur = " + color);
		
	}
}
