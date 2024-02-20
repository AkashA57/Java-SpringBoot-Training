package AboutAbstract;

public class Child extends Base{
	
	public void study() {
		System.out.println("I am not studying");
	}

	public static void main(String[] args) {
		
		Child ck = new Child();
		ck.study2();
		ck.study();

	}

}
