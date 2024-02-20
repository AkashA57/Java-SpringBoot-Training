package iteration;

import java.util.Scanner;

public class TableOfPositiveInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Table of= ");
		int n = scan.nextInt();
		int a = 1;
		System.out.print("Table of "+n+" is =: ");
		while (a<=10) {
		 System.out.print(a*n + ",");
		 		 a++;

		}
		}
	
	}
