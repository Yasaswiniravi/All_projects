package Assignment3;
//Write a program to find the sum of all elements in an integer array 
public class sum_array {

	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum of array elements: " + sum);
	}

}
