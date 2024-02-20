package aboutSuper;

public class B extends Hello{
	
	String name = "SAID";
	
	public void show() 
	{
		System.out.println("name=" + name);
		System.out.println("this.name=" + this.name);
		System.out.println("color=" + color);
		System.out.println("this.color=" + this.color);
		System.out.println("super.color=" + super.color);
	super.show();
	}

}
