package toString;

public class ToStringMethodMain {

	public static void main(String[] args) {
		
		ToStringMethodDemo tsmd=new ToStringMethodDemo();
		System.out.println(tsmd);
		
		System.out.println("______________");
		System.out.println(tsmd.getName());
		System.out.println(tsmd.getAge());
		System.out.println(tsmd.getColor());
	
		System.out.println("______________");
		
		ToStringMethodDemo tsmd1=new ToStringMethodDemo("XYZ",10);
		
		System.out.println("______________");
		System.out.println(tsmd1.getName());
		System.out.println(tsmd1.getAge());
		tsmd1.setColor("Red");
		System.out.println(tsmd1.getColor());
		System.out.println(tsmd1);
		
		ToStringMethodDemo tsmd2=new ToStringMethodDemo(20,"ABC", "yellow");
		
		System.out.println("______________");
		System.out.println(tsmd2.getAge());
		System.out.println(tsmd2.getName());
		System.out.println(tsmd2.getColor());
		System.out.println(tsmd2);
		

	}

}
