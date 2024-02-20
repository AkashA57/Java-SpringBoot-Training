package hash;

public class HashDemo {

	//hash.code.HashDemo.class (fully classified name)
	public static void main(String[] args) {
		Dogy d1 = new Dogy(4, "Tommy");
		System.out.println(d1.hashCode());// 80991899
		
		Dogy d2 = new Dogy(2, "Jack");
		System.out.println(d2.hashCode());//2301950

		Dogy d3 = new Dogy(4, "Tommy");
		System.out.println(d3.hashCode());//80991899
		
		
		System.out.println("Output of comparision...........");
		System.out.println(d2.equals(d3)); //false
		System.out.println(d1.equals(d3)); //true
	}

}

class Dogy {
	int age;
	String name;

	public Dogy(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Dogy() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dogy other = (Dogy) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
