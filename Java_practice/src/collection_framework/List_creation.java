package collection_framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class List_creation {

	public static void main(String[] args) {
		//add group of elements with List interface method 'of'
		ArrayList<Integer> list=new ArrayList<>(List.of(50,60,40,70,80));
		Collections.sort(list);
		System.out.println(list);
		int searchelement=60;
		if(list.contains(searchelement)) {
			System.out.println(searchelement+"is found in list");
		}
		else {
			System.out.println(searchelement+"is not found in the list");
		}
	}

}
//create Arraylist and search for an element
