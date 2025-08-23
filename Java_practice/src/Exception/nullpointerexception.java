package Exception;

public class nullpointerexception {

	public static void main(String[] args) {
		try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (NullPointer)");
        }

	}

}
