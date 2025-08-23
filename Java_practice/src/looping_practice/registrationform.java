package looping_practice;

import java.util.Scanner;

public class registrationform {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name");
		String name=sc.nextLine();
		System.out.println("enter mobile number");
		long number=sc.nextLong();
		sc.nextLine();
		System.out.println("enter email address");
		String email=sc.nextLine();
		System.out.println("enter username");
		String username=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		System.out.println("confirm password");
		String conpass=sc.nextLine();
		
		System.out.println("Registration details are:..");

		System.out.println("Name  ="+name);
        System.out.println("Mobile number  ="+number);
        System.out.println("Email  ="+email);
        System.out.println("username  ="+username);

		System.out.println("password  ="+password);

		System.out.println("confirm password  ="+conpass);


	}

}
