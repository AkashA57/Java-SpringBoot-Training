package constructor.exp;

//Create a class
public class ConstructorExp {
int x;  // Create a class attribute

// Create a class constructor for the ConstructorExp class
public ConstructorExp () {
 x = 5;  // Set the initial value for the class attribute x
}

public static void main(String[] args) {
 ConstructorExp myObj = new ConstructorExp (); // Create an object of class ConstructorExp (This will call the constructor)
 System.out.println(myObj.x); // Print the value of x
}
}
