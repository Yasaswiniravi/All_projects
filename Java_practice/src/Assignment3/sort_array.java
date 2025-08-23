package Assignment3;
//9.Sort an array in ascending order 
import java.util.Arrays;
public class sort_array {

	public static void main(String[] args) {
		int[] arr = {5,2,8,1,3,0};
        Arrays.sort(arr);
        System.out.println("Array in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
