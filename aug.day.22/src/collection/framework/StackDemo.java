package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;



public class StackDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(50);
		list.add(40);
		list.add("Deepa");
		//list.add('Sushma');

		System.out.println(list);
		System.out.println("_______________");
		Stack<String> list2=new Stack<>();
		list2.add("Durga");
		list2.add("Lal");
		list2.add("Mohd Khan");
		//list2.add(20); not allowed because it's a integer type of data
		System.out.println(list2);
		System.out.println("_______________");
		
		Stack<Character> list3=new Stack<>();
		list3.add('D');
		list3.add('C');
		list3.add('Z');
		System.out.println(list3);
		System.out.println("_______________");
		
		
		Stack<Integer> list4=new Stack<>();
		list4.add(80);
		list4.add(20);
		list4.add(90);
		list4.add(10);
		list4.add(15);
		list4.add(50);
		System.out.println(list4);
		
		// SEARCH
		System.out.println(list4.contains(900)); //FALSE
		System.out.println("_______________");
		System.out.println(list2.contains("Lal")); //TRUE
		System.out.println("_______________");
		
		// SORTING 
		System.out.println(list4);
		System.out.println("_______________");
		Collections.sort(list4);
		System.out.println(list4);
	}

}
