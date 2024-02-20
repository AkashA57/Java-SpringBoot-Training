package motor.method2;

public class HondaPilot extends Honda{

	String name = "HondaPilot";
	String vendor = "Lal";
	
	public HondaPilot() 
	{
		super();
		
	}
	
	public void show() 
	{
		System.out.println("name=" + name);
		System.out.println("vendor=" + vendor);
		print();
	}
}
