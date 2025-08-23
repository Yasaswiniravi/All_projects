package Assignment3;
//Write a Program to count digits, letters, spaces and Special characters
public class Special_char {

	public static void main(String[] args) {
		String input = "Java 123 @# is fun!";
        int letters = 0;
        int digits = 0;
        int spaces = 0;
        int specialChars = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isSpaceChar(ch)) {
                spaces++;
            } else {
                specialChars++;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + specialChars);
	}

}
