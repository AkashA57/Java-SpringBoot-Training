package inheritance.prac;


public class DemoMain {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.run();
		d.walk();
		//d.bark();
		System.out.println("----------------------------");
		BarkDog bd=new BarkDog();
		 bd.run();
		 bd.bark();
		 System.out.println("----------------------------");
		 Dog dd=new BarkDog();
		 dd.walk();
		// dd.bark();
		 dd.run();
		 System.out.println("----------------------------");
		 SleepDog sd=new SleepDog(); 
		 sd.run();
		 sd.walk();
		 sd.bark();
		 sd.sleep();
		 
		//use the cancept of downcasting and try to access all 4 behaviors which are mentioned above.  
		 //run
		 //walk
		 //bark
		 //sleep
		 System.out.println("-------------Downcasting---------------");
		 
		 Dog down1 = new BarkDog();
		 BarkDog down2 = (BarkDog)down1;
		 down2 = new SleepDog();
		 SleepDog down3 =(SleepDog)down2;
		 down3.run();
		 down3.walk();
		 down3.bark();
		 down3.sleep();
		 
		 
		 
		 //BarkDog down2 = new SleepDog();
		 //SleepDog down3 =(SleepDog)down2;
		 //down3.run();
		 //down3.walk();
		 //down3.bark();
		 //down3.sleep();
		 
		 
	}

}