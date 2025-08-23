package collection_framework;
import java.util.LinkedHashSet;
import java.util.TreeSet;
//tree set follows increasing order(alphabetical order)
//no duplicate elements allowed
// null not allowed)
//element store basis of hash code value
public class tree_set {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("salt");
		set.add("sugar");
		set.add("water");
		set.add("sand");
		set.add("bottle");
		set.add("bottle");
		System.out.println(set);
		System.out.println(set.clone());
		System.out.println(set.contains("sand")); //true
		//set.remove("bottle");
		System.out.println(set);
		System.out.println(set.ceiling("waters"));//next
		System.out.println(set.floor("waters"));//previous
		System.out.println(set.higher("salt"));
		System.out.println(set.lower("salt"));
		set.pollFirst();
		System.out.println(set);
		set.pollLast();
		System.out.println(set);
		System.out.println(set.descendingSet());


		// TODO Auto-generated method stub

	}

}
