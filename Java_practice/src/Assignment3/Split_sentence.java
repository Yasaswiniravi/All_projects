package Assignment3;
//Split a sentence into words 
public class Split_sentence {

	public static void main(String[] args) {
		String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
	}

}
