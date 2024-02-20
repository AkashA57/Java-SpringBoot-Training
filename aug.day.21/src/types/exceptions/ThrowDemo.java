package types.exceptions;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		try {
			// 100/0- JVM
			if (name.equals("500 pks")) {
				Exception exception = new Exception("you are not permitted");
				throw exception;// throw is used to throw the exception
			}
		}
		// here we can not write
		catch (Exception e) {
			System.out.println(e.getMessage());
			//System.out.println("Hello I have executed in right entry case ");
			
		}
		System.out.println("Hello Name==" + name);
		System.out.println("main thanks end");
	}
}
