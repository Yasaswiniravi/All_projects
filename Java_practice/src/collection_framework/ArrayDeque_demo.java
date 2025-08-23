package collection_framework;
//dequeue
import java.util.ArrayDeque;

public class ArrayDeque_demo {

	public static void main(String[] args) {
		ArrayDeque<String> q=new ArrayDeque<String>();
		q.add("apple");
		q.add("mango");
		q.add("kiwi");
		q.add("watermelon");
		System.out.println(q);
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		q.offer("banana");
		System.out.println(q);
		System.out.println(q.peek());
		q.poll();
		System.out.println(q);
		

	}

}
