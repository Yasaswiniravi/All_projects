package Map_collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hash_map {
//unordered
//no duplicate allowed it will override value for that key
//store null(only one null allowed)
	//elemnets store basis of the key
	public static void main(String[] args) {
//		Map<String,String> map=new HashMap<String,String>();
//		map.put("one","mango");
//		map.put("Four","Kiwi");
//		map.put("seven", "banana");
//		map.put("six","cherry");
//		map.put("ten","grapes");
//		map.put(null,"nothing");
//		map.put(null, null);
//		System.out.println(map);
//		System.out.println(map.get("six"));
//		map.replace("ten", "custard apple");
//		System.out.println(map);
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println(map.entrySet());
//		System.out.println(map);
		
//		Map<Integer,String> map=new HashMap<Integer,String>();
//		map.put(1, "one");
//		map.put(2, "Two");
//		map.put(4, "Three");
//		map.put(3, "four");
//		System.out.println(map);
//		System.out.println(map.get(3));
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println(map.entrySet());
		
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("one","mango");
		map.put("Four","Kiwi");
		map.put("seven", "banana");
		map.put("six","cherry");
		map.put("ten","grapes");
		map.put(null,"nothing");
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.get("six"));
		map.replace("ten", "custard apple");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map);

	}

}
