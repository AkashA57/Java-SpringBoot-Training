package map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,String> map1=new LinkedHashMap<>();
		 map1.put("900", "Zaved");
		 map1.put("200", "Deepesh");
		 map1.put("300", "Bipin");
		 map1.put("400", "Ram");
		 map1.put("500", "Laxman");
		 map1.put("400", "Ram");
		 
		 System.out.println(map1);

	}

}
