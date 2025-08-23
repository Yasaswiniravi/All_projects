package Exception;

public class classnotfoundexception {

	public static void main(String[] args) {
		try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (ClassNotFound)");
        }
	}

}
