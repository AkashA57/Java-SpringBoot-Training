package collection.framework2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();
		list.add("Zaved");
		list.add("Aman");
		list.add("Said");
		list.add("Zinet");
		list.add("Biraj");
		list.add(10);
		
		System.out.println(list);
		System.out.println("**********************************");
		
		ArrayList<String> list2=new ArrayList();
		list2.add("Zaved");
		list2.add("Aman");
		list2.add("Said");
		list2.add("Zinet");
		list2.add("Biraj");
		list2.add("Deepesh");
		//list2.add(10);
		System.out.println(list2);
		//System.out.println("**********************************");
		
		ArrayList<Integer> list3=new ArrayList();
		list3.add(13);
		list3.add(15);
		list3.add(9);
		list3.add(6);
		list3.add(10);
		list3.add(10);
		
		System.out.println(list3);
		
			
		//search
		//System.out.println(list3.contains(6));
		System.out.println(list2.contains("Deepesh"));
		
		//Sort the integer values
		Collections.sort(list3);
		System.out.println(list3);
		
		//System.out.println("*********************");
		//Sort the String value
		Collections.sort(list2);
		System.out.println(list2);
	}
	

}