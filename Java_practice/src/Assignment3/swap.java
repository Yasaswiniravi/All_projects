package Assignment3;

public class swap {
	// Swap two numbers using third variable 
	public static void main(String[] args) {
		int a = 5;
        int b = 10;
        System.out.println("Before Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
	
