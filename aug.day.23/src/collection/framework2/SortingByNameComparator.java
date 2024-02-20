package collection.framework2;

import java.util.Comparator;

public class SortingByNameComparator implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		int x=(o1.name).compareTo(o2.name);
		return x;
	}

}
