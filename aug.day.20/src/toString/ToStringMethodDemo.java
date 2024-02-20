package toString;

public class ToStringMethodDemo {
	private String name;
    private int age;
    private String color = "White";

    public ToStringMethodDemo() {
	  
    }

    public ToStringMethodDemo(String name,int age) {
    	this.name=name;
    	this.age=age;

    }

    public ToStringMethodDemo(int age,String name, String color) {
    	this.age=age;
    	this.name=name;
    	this.color=color;
 
	}

	@Override
	public String toString() {
		return "ToStringMethodDemo [name=" + name + ", age=" + age + ", color=" + color + "]";
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
