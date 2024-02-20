package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;



public class LinkedListDemo2 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(50);
		list.add(40);
		list.add("Deepa");
		//list.add('Sushma');

		System.out.println(list);
		System.out.println("_______________");
		LinkedList<String> list2=new LinkedList<>();
		list2.add("Durga");
		list2.add("Lal");
		list2.add("Mohd Khan");
		//list2.add(20); not allowed because it's a integer type of data
		System.out.println(list2);
		System.out.println("_______________");
		
		LinkedList<Character> list3=new LinkedList<>();
		list3.add('D');
		list3.add('C');
		list3.add('Z');
		System.out.println(list3);
		System.out.println("_______________");
		
		
		LinkedList<Integer> list4=new LinkedList<>();
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