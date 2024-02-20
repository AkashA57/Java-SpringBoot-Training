package finalkeyword;

public class SuperClass {
	
	final void hello() 
	{
		System.out.println("I am final method");
	}
	//if you are making hello() as final, then you 
	//can not override it
	
	
	
	public void second() 
	{
		System.out.println("I am part of super class"
				+ " and having public nature");
	}

}
