package collection.framework;

import java.util.ArrayList;

public class ArrayLDemo1 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add("Akash");
		list.add("Prakash");
		list.add("Bikash");
		list.add("Dinesh");
		list.add(30);
		list.add('a');
		System.out.println(list);
		
		System.out.println("-------------------");
		
  ArrayList<String> list2=new ArrayList<>();
		
		list2.add("Akash1");
		list2.add("Prakash1");
		list2.add("Bikash1");
		list2.add("Dinesh1");
		//list2.add(30);
		//list2.add('a');
		//System.out.println(list2);
		
		for(String abc:list2) 
		{
			System.out.println(abc);
		}
		
		System.out.println("-------------------");
		
		  ArrayList<Integer> list3=new ArrayList<>();
				
				list3.add(10);
				list3.add(5);
				list3.add(26);
				list3.add(32);
				list3.add(30);
				//list3.add("Avinash");
				System.out.println(list3);
				
	}

}
