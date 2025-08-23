package collection_framework;
import java.util.PriorityQueue;
import java.util.Queue;
//queue follows FIFO order
//duplicate elements allowed
//null not allow
//elemnets store basis of hash code value 
public class Queue_demo {

	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<String>();
		q.add("apple");
		q.add("mango");
		q.add("kiwi");
		q.add("watermelon");
		q.add("banana");
		System.out.println(q);
		System.out.println(q.element());
		q.offer("cherry");
		System.out.println(q);
		System.out.println(q.peek());
		q.poll();
		System.out.println(q);
		q.remove("kiwi");
		System.out.println(q);





		// TODO Auto-generated method stub

	}

}
