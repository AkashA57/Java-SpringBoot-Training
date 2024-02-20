package hash;

public class HashDemo1 {

	public static void main(String[] args) {
		
		Dog d1=new Dog(4,"Tommy");
		System.out.println(d1.hashCode());
		
		Dog d2=new Dog(6,"Jacky");
		System.out.println(d2.hashCode()); 
		
		Dog d3=new Dog(6,"Jacky");
		System.out.println(d3.hashCode());
		
		Dog d4=new Dog(4,"Tommy");
		System.out.println(d4.hashCode());
		
		
		
	}

}


 class Dog{
	int age;
	String name;

	
	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	 public Dog() { 
		 super(); // TODO Auto-generated constructor stub }
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
		Dog other = (Dog) obj;
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
