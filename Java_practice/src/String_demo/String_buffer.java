package String_demo;

public class String_buffer {

	public static void main(String[] args) {
		String str="Hello";
		
		StringBuffer sb=new StringBuffer(str);
		sb.append("Dear");
		System.out.println(sb);
		sb.append("students");
		System.out.println(sb);

		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.substring(3,6));
		System.out.println(sb.delete(1, 4));

		
	}

}
