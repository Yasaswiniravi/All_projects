package Assignment3;
//15 segregate even and odd numbers  
public class segregate_even_odd {

	public static void main(String[] args) {
		int[] arr = {10, 15, 20, 25, 30, 35};
        System.out.println("Even numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nOdd numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
	}

}
