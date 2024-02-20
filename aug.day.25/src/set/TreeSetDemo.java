package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();//TreeSet is used for sorting purpose
		set.add("Zaved");
		set.add("Zaved");
		set.add("Harsh");
		set.add("Raz");
		set.add("EI Bahia");
		System.out.println(set);
		System.out.println("**********************************");

		// iteration using for each loop

		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println("**********************************");
		Set<Integer> set1 = new TreeSet<>();//TreeSet is used for sorting purpose
		set1.add(5);
		set1.add(9);
		set1.add(11);
		set1.add(4);
		set1.add(1); // 

		System.out.println(set1);
		System.out.println("**********************************");

		// iteration using for each loop

		for (Integer s2 : set1) {
			System.out.println(s2);
		}
	}

}
