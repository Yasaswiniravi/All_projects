package collection_framework;
import java.util.LinkedList;
import java.util.ArrayList;
public class Linkedtoarraylist {

	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add(0,"Apple");
		linkedList.add(1,"Mango");
		linkedList.add(2,"Kiwi");
		linkedList.add(3,"banana");
		
		ArrayList<String> arrayList=new ArrayList<>(linkedList);
	System.out.println("linkedlist:"+linkedList);
	System.out.println("Arraylist:"+arrayList);
		
		// TODO Auto-generated method stub

	}

}
