package File_handling;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
public class Path_demo {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("employee.txt");
		Files.createFile(path);
		System.out.println("File created");
		Path copypath=Paths.get("samplecopy.txt");
		Files.copy(path, copypath,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("file copied");
	}

}
