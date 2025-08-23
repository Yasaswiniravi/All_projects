package File_handling;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class printwriter_use {

	public static void main(String[] args) {
		try {
			PrintWriter w =new PrintWriter("sample.txt"); 
			w.println("hello printwriter");
			System.out.println("file wriiten successfully");
			w.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
