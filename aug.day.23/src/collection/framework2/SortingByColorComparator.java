package collection.framework2;

import java.util.Comparator;

public class SortingByColorComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		int x=(o1.color).compareTo(o2.color); 
		return x; 
		
	}
}
