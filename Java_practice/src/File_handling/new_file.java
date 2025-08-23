package File_handling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;

public class new_file {

	public static void main(String[] args) throws IOException{
		File f=new File("sample.txt");
		if(f.exists())
		{
			System.out.println("file name:"+f.getName());
			System.out.println("file location:"+f.getAbsolutePath());
			System.out.println("file size:"+f.length());
			System.out.println("file readable:"+f.canRead());
			System.out.println("file writable:"+f.canWrite());	
		}
		else {
			System.out.println("file not found");
		}
		
		List<String> lines=new ArrayList<String>();
		BufferedReader r =new BufferedReader(new FileReader("sample.txt"));
		String line;
		while((line=r.readLine())!=null)
		{
			lines.add(line);
		}
		for(String l:lines) {
			System.out.println(l);
		}
		r.close();
		
		try {
			BufferedWriter w=new BufferedWriter(new FileWriter("sample.txt"));
			w.write("hello");
			w.newLine();
			w.write("welcome java");
			w.close();
			System.out.println("write file succesfully");
		}catch(IOException e) {
			e.printStackTrace();
		}

		
		try {
			PrintWriter w =new PrintWriter("sample.txt"); 
			w.println("hello printwriter");
			System.out.println("file wriiten successfully");
			w.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
