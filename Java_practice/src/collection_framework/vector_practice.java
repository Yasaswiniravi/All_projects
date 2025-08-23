package collection_framework;
import java.util.*;
public class vector_practice {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("white");
		v.add("Blue");
		v.add("black");
		v.add("grey");
		v.add("pink");
		v.add(null);
		v.add("black");
		System.out.println(v);
		System.out.println(v.indexOf("Black"));
		System.out.println(v.subList(0,3));

	}

}

