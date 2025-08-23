package collection_framework;
import java.util.ArrayList;

public class mergetwoarray {

	public static void main(String[] args) {
		ArrayList<Integer> num1 = new ArrayList<>();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		num1.add(50);

		ArrayList<Integer> num2 = new ArrayList<>();
		num2.add(10);
		num2.add(20);
		num2.add(40);

		for (Integer num: num2) {
				if(!num1.contains(num)) {
					num1.add(num);
		}
	}
		System.out.println("mergedlist"+num1);
		

	}

}
