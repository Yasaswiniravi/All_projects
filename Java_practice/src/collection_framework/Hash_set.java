package collection_framework;
//unordered
//no duplicate elements allowed
//store null(only null allowed)
//element store basis of hash code value
import java.util.HashSet;
import java.util.Iterator;
public class Hash_set {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("salt");
		set.add("sugar");
		set.add("water");
		set.add("sand");
		set.add("bottle");
		set.add("bottle");
		set.add(null);
		set.add(null);
		System.out.println(set);
		
//		System.out.println(set.clone());
//		System.out.println(set.contains("sand")); //true
//		set.remove("bottle");
//		System.out.println(set);
//		set.add("oil");
//		System.out.println(set);
//		set.clear();
//		System.out.println(set);
//		System.out.println(set.isEmpty());
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		

		
		// TODO Auto-generated method stub

	}

}
