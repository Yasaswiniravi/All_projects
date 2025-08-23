package control_statement;

public class Temparature {

	public static void main(String[] args) {
		float temperature = 35.9f; 

        if (temperature >= 40) {
            System.out.println("Very hot");
        } else if (temperature >= 30 && temperature <= 39) {
            System.out.println("Hot");
        } else if (temperature >= 20 && temperature <= 29) {
            System.out.println("Warm");
        } else if (temperature >= 10 && temperature <= 19) {
            System.out.println("Cool");
        } else {
            System.out.println("Very cool");
        }
		

	}

}
