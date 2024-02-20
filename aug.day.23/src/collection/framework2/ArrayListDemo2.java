package collection.framework2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		// ArrayList<String> list=new ArrayList();
		List<String> list = new ArrayList();
		list.add("Zaved");
		list.add("Aman");
		list.add("Deepesh");
		list.add("Yashmin");
		list.add("Harsh");
		 System.out.println(list);

		// iteration using for each loop
		
		 for(String abc:list) { 
			 System.out.println(abc); 
			 }
		 
		 System.out.println("-----------");
		// simple/classical for each loop
		for (int i = 0; i <= list.size() - 1; i++) {
			 System.out.println(list.get(i));
		}
		// using Iterator Interface
		// Collection framework provides another interface iterator .
		// by using iterator you can iterate any collection
		 System.out.println("----Iterator----");
		
		 Iterator<String> itr = list.iterator();
		   while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
