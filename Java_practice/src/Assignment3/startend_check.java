package Assignment3;
//Check if String  starts with “j” and end with “a” . eg. “java” 
public class startend_check {

	public static void main(String[] args) {
		String input = "java";
        input = input.toLowerCase();
        if (input.startsWith("j") && input.endsWith("a")) {
            System.out.println(input + " starts with 'j' and ends with 'a'");
        } else {
            System.out.println(input + " does not start with 'j' and end with 'a'");
        }
	}

}
