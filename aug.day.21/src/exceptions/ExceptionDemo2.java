package exceptions;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		int a, b, c;
        a = 100;
        b = 0;
        c = 0;
        
        System.out.println("Before suspicious code");
        try {
        	
        	System.out.println("_______________________");
        	System.out.println("This is try block");
        	c = a/b;
        	 System.out.println("_______________________");
        }
        
       catch (Exception e) {
    	  
    	   System.out.println("_______________________");
    	   System.out.println("This is catch block");
    	   e.printStackTrace();
    	   System.out.println(e);
    	   System.out.println("_______________________");
       }
        
        System.out.println(c);
        
        System.out.println("After suspicious code");
        
        System.out.println("Will it print");

        
	}
}
	
	

	

