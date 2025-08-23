package Assignment;
import java.util.Scanner;
//6. print factorial of a number(eg. 5!=5*4*3*2*1)
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact*=i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
        sc.close();
		

	}

}
