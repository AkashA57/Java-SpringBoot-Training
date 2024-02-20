package block;

public class FruitDemo1 {

	int price = 230;

		
		static void banana() 
		 {
			System.out.println("I am body of banana method");
		}		
		 
		 public static void main(String[] args) {
	     
			 //FruitDemo1.banana();// internal definition by system(class_name.method_name)
			
			 //FruitDemo1 fd=new FruitDemo1();
			//fd.banana();
			 
			 //System.out.println(FruitDemo1.price); 
			 // getting error because price is a part of class of the object
		     // so if we want to access price then firstly we have to create an object of the class
			
			 
			 // FruitDemo1 fg=new FruitDemo1();
			// System.out.println("price ="+fg.price);
		 }

	}
