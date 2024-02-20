package finalkeyword;

public class SubClass extends SuperClass{

	void hello() 
	{
		System.out.println("I want to override you");
	}
	//if you are making hello() as a final, then you
	// can not override it.
	
	public void second() 
	{
		System.out.println("I want to override you1");
	}
	//second() method is not final and can be overridden
	
	public static void main(String[] args) 
	{
		
		SuperClass sc = new SuperClass();
		
		sc.second();
		
		SubClass sc1 = new SubClass();
		
		sc1.second();

	}

}
