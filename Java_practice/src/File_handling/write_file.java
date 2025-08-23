package File_handling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class write_file {

	public static void main(String[] args) {
		try {
			BufferedWriter w=new BufferedWriter(new FileWriter("sample.txt",true));
			w.write("hello");
			w.newLine();
			w.write("\nwelcome java");
			w.close();
			System.out.println("\nwrite file succesfully");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
