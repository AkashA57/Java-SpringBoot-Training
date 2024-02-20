package aboutinterface;

public class Cat implements CatUser, CatInf{
	
	String name = "Bob";
	
	public void jump() {
		System.out.println("Cat can jump.");
	}
	
	public void pounce() {
		System.out.println("Cat can pounce.");
	}

	//The type Dog must implement the inherited abstract method DogUser.sleep()
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myCat() {
		// TODO Auto-generated method stub
		
	}


}
