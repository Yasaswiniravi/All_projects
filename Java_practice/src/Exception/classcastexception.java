package Exception;

public class classcastexception {

	public static void main(String[] args) {
		try {
            Object obj = "Hello";
            Integer num = (Integer) obj; 
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (ClassCast)");
        }
	}

}
