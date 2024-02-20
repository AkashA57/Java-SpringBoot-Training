package types.exceptions;

import java.util.Scanner;

public class NameThrowsDemo {
	// caller must handle this exception using try and catch block
	static private String takeInput() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		if (name.equals("agile")) {
			Exception exception = new Exception("Agile name is not allowed");
			throw exception;// throw is used to throw the exception
		}
		return name;
	}

	public static void main(String[] args) {
     String name=null;
     try {
    	 name=takeInput();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		//e.printStackTrace();
		return;
	}
     System.out.println("Name" + name);
		System.out.println("main thanks end");
	}
}
