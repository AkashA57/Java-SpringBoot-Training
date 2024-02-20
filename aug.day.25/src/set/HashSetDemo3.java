package set;

import java.util.Collections;

import java.util.HashSet;
import java.util.Set;


public class HashSetDemo3 {
	public static void main(String[] args) {
	Dog dog1=new Dog(5, "Jocky", "White");
	Dog dog2=new Dog(5, "Jocky", "White");
	Dog dog3=new Dog(6, "Doggy", "Brown");
	
	Set<Dog> ss= new HashSet<>();
	ss.add(dog1);
	ss.add(dog2);
	ss.add(dog3);
	
	System.out.println(ss);
	
	//search
			
			System.out.println(ss.contains(dog3));
			
	// sorting by Comparator (Color)
			
			
//	Collections.sort(ss,new SortingByColorComparator());
//	System.out.println(ss);

			
	}
}
