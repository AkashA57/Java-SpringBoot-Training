package exceptions;

public class ExceptionDemo1 {
	
	public static void main(String[] args) {
		
		int a, b, c;
        a = 100;
        b = 0;
        
        
        System.out.println("Before suspicious code");
        
        c = a/b;
        
        System.out.println(c);
        
        System.out.println("After suspicious code");
        
        System.out.println("Will it print");
	}
}
