package block;

public class MobileVar {

	String name;
	static String color;
		
	public MobileVar(String name,String color) {
		this.name=name;
		this.color=color;
			}
	public void info() {
		System.out.println("Name="+name);
		System.out.println("this.name="+this.name);
		System.out.println("Color="+color);
		System.out.println("MobileVar.color="+MobileVar.color);
	}
}
