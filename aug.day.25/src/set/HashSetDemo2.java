package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		Set set= new HashSet();
		set.add(10);
		set.add(9);
		set.add(86123247);
		set.add("Zaved");
		set.add(null);//
		set.add(null);//
		set.add(4);
		set.add(2);
		set.add(6);
		set.add(3);
		
		set.add(3);//
		
		System.out.println(set);
		System.out.println("***********LinkedHashSet**************");

		Set<String> set2= new LinkedHashSet<>();
		
		set2.add("Ashish");
		set2.add("Biwas");
		set2.add("Rabin");
		set2.add("Yogesh");
		set2.add("Harsh");
		set2.add("Harsh");
		 System.out.println(set2);
		 
		 System.out.println("----------TreeSet------");
		 Set<String> set3= new TreeSet<>();
		    set3.add("Yogesh");
			set3.add("Ashish");
			set3.add("Biwas");
			set3.add("Rabin");
			
			set3.add("Harsh");
			set3.add("Harsh");
			 System.out.println(set3);
			 
	
				// iteration using for each loop
				
				 //for(String s:set) { 
					 //System.out.println(s); }
				 

					
				// using Iterator Interface
				// by using iterator you can iterate any collection
				/*
				 * // System.out.println("**********************************"); Iterator<String>
				 * itr = set.iterator(); while (itr.hasNext()) { System.out.println(itr.next());
				 * }
				 */
			 System.out.println("----------TreeSet------");
			 
			 Set<String> numberSet = new HashSet();
			 for(int i = 0; i<100; i++) {
				 numberSet.add(""+i);
			 }
			 
			 Iterator<String> iterator = numberSet.iterator();
			 while(iterator.hasNext()) {
				 System.out.println(iterator.next());
			 }
		
			}
	

}
