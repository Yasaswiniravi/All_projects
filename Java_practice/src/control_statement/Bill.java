package control_statement;

public class Bill {

	public static void main(String[] args) {
		int units = 320; 
        if (units < 100) {
            System.out.println("Low usage");
        } else if (units >= 100 && units <= 299) {
            System.out.println("Medium usage");
        } else if (units >= 300 && units <= 499) {
            System.out.println("High usage");
        } else {
            System.out.println("Very high usage");
        }
        
    }
}

	


