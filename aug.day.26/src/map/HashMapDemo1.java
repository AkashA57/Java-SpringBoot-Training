package map;

//map is an interface
//HashMap is a class which implements Map interface
//Map always contains key values pairs(k,v)
//Key can not be duplicate but values may be 
//Map is not ordered means there is no guarantee that-- 
//--insertion order will be maintained
//All the rules which are applied for a set, all are applied on key of a map also
//Keys can not be duplicates, keys must override hashcode() and equals() method
//in fact, set internally uses Map
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {

		Map<String, String> map1 = new HashMap<>();

		String abc = map1.put("100", "Zaved");
		map1.put("200", "Deepesh");
		map1.put("300", "Bipin");
		map1.put("500", "Laxman");
		map1.put("400", "Ram");
		//map1.put("400", "Ram");

		System.out.println(map1);

		System.out.println("----------------");
		
		System.out.println("abc = " + abc);

		abc = map1.put("100", "Arun");
		System.out.println(map1);

		System.out.println("----------------");
		System.out.println("abc = " + abc);
		

		// iteration
		System.out.println("----------------");
		System.out.println("--Print the Entry(Key & Value) Data one by one --------------");
		// Map<String,String>
		Set<Map.Entry<String, String>> entries = map1.entrySet();

		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		
		System.out.println("----------------");
		System.out.println("----------------");

		Set<String> keys = map1.keySet();
		for (String sushma : keys) {
			System.out.println(sushma + "       " + map1.get(sushma));
		
			System.out.println(sushma);	
		
		}	
		  
		  
		  System.out.println("----------------"); 
		  System.out.println("-----Print Key Data------"); 
		  System.out.println("----------------"); 
		 // System.out.println(map1.getKey());
		  
		  System.out.println("----------------"); 
		  System.out.println("-----Print Value Data------"); 
		  System.out.println("----------------"); 
		  System.out.println(map1.values());
		  
		  
			

	}

}
