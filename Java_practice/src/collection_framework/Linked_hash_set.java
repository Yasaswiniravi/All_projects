package collection_framework;

import java.util.Iterator;
import java.util.LinkedHashSet;

//linked hashset follows insertion order
//no duplicate elements allowed
//store null(only null allowed)
//element store basis of hash code value
public class Linked_hash_set {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("salt");
		set.add("sugar");
		set.add("water");
		set.add("sand");
		set.add("bottle");
		set.add("bottle");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.clone());
		System.out.println(set.contains("sand")); //true
		
		System.out.println(set.isEmpty());
		System.out.println("firstelement="+set.getFirst());
		System.out.println("secondele="+set.getLast());

		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		// TODO Auto-generated method stub

	}

}
