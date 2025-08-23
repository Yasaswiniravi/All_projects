package File_handling;
import java.io.File;
public class createnew_file {

	public static void main(String[] args) {
		File f=new File("sample.txt");
		try {
			f.createNewFile();
			System.out.println(f.setWritable(true));
		}
		catch(Exception e){
			System.out.println("file not found");
			System.out.println(e);
		}
		
	}

}
