package collection_framework;
import java.util.Stack;
public class stack_demo {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(7);
		s.push(8);
		System.out.println(s);
//		s.pop();
//		System.out.println(s);
//		s.pop();
//		System.out.println(s);
//		System.out.println(s.peek());
		System.out.println(s.search(8));


		

	
	}

}
