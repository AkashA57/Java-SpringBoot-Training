package map;


import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> map1=new TreeMap<>();
		//LinkedHashMap<String,String> map1=new LinkedHashMap<>();
		map1.put("900", "Zaved");
		 map1.put("200", "Deepesh");
		 map1.put("300", "Bipin");
		 map1.put("400", "Ram");
		 map1.put("500", "Laxman");

		 System.out.println(map1);		 


	}

}
