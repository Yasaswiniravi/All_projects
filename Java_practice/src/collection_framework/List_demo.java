package collection_framework;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public class List_demo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add(0,"Apple");
		list.add(1,"Mango");
		list.add(2,"Kiwi");
		list.add(3,"banana");
		String[] array=list.toArray(new String[0]);
		
		System.out.println(Arrays.toString(array));
//		System.out.println(list.get(3));
//		list.set(2, "cherry");
//		System.out.println(list);
//
//		list.add(3,"kiwi");
//		System.out.println(list);
//		System.out.println(list.contains("banana"));
//		System.out.println(list.equals("banana"));
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.indexOf("Mango"));
//		System.out.println(list.isEmpty());
//		list.remove(0);
//		System.out.println(list);
//		list.remove("Kiwi");
//		System.out.println(list);
//		System.out.println(list.reversed());
//		for(String ch:list)
//		{
//			System.out.println(ch);
//		}
		//using iterator
//		Iterator<String> itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		//using list Iterator
//		Iterator<String> itrs=list.listIterator();
//		while(itrs.hasNext()) {
//			System.out.println(itrs.next());
//		}
		}

}
