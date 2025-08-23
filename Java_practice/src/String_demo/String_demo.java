package String_demo;

public class String_demo {

	public static void main(String[] args) {
		String st="Hello";
		System.out.println(st.charAt(2));
		System.out.println(st.codePointAt(1));		
		System.out.println(st.codePointBefore(2));
		System.out.println(st.codePointCount(0,4));
		System.out.println(st.equals("hello"));
		System.out.println(st.equalsIgnoreCase("hello"));
		System.out.println(st.isBlank());
		System.out.println(st.isEmpty());
		System.out.println(st.lastIndexOf("o"));
		System.out.println(st.contains("lo"));


		}

}
