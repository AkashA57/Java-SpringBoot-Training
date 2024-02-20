package motor;

public class HeroMotor extends Motor{

	String vendor = "Lal";
	
	public HeroMotor(String name, String vendor) 
	{
		super(name);
		
		this.name = name;
		this.vendor = vendor;
	}
	
	public void show() 
	{
		System.out.println("name=" + name);
		System.out.println("vendor=" + vendor);
		print();
	}
}
