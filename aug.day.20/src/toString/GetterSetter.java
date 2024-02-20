package toString;

public class GetterSetter {

	 private String name;
	   private int age;
	   private String color;
	   
	   private void run() {
		   System.out.println("Hello, I am private method");
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	   
		}
