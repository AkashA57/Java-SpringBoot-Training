package collection.framework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DogMain {

	public static void main(String[] args) {
				
		
		Dog dog1=new Dog(5, "Jocky", "White");
		Dog dog2=new Dog(3, "Tommy", "Black");
		Dog dog3=new Dog(6, "Doggy", "Brown");
			
		List<Dog> list=new ArrayList<>();// blank list
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		
		
		//System.out.println(list);
		System.out.println("*****************************");
		
		//search
		Dog dog4=new Dog(5, "Jocky", "White");	
		System.out.println(list.contains(dog4));
	
		//sorting
		//Collections.sort(list);
		//System.out.println(list);
		
		
		
		// sorting by Comparator (Name)
		Collections.sort(list,new SortingByNameComparator());
		System.out.println(list);
		
		
		// sorting by Comparator (Color)
		Collections.sort(list,new SortingByColorComparator());
		System.out.println(list);
		
	}
}
