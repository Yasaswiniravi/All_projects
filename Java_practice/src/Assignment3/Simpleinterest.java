package Assignment3;
//Calculate simple interest 
public class Simpleinterest {

	public static void main(String[] args) {
		double principal = 1000;
        double rate = 5;
        double time = 2;
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + interest);
	}

}
