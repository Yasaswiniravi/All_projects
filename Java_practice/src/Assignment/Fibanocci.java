package Assignment;
//fibanocci series upto 10 terms
public class Fibanocci {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3;

        System.out.print("Fibonacci Series up to 10 terms: ");
        System.out.print(n1 + " " + n2 + " "); 

        for (int i = 3; i <= 10; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
	}

}
