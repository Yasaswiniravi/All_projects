package Assignment3;
//Write a program to sort characters of a String Alphabetically 
import java.util.Arrays;
public class sort_char {

	public static void main(String[] args) {
		String input = "Alphabets";
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println("Original String: " + input);
        System.out.println("Sorted Characters: " + sorted);
	}

}
