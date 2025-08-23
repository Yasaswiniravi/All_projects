package File_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class copyfile {

	public static void main(String[] args) throws IOException {
		//create file
		Path path=Paths.get("sampleDemo1.txt");
		Files.createFile(path);
		System.out.println("file created");
		//copy file
		Path copypath=Paths.get("samplecopy.txt");
		Files.copy(path, copypath,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("file copied");
		//move file
		Path movePath=Paths.get("movedfile1.txt");
		Files.move(copypath, movePath,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("file moved");
		//delete file
//		Files.deleteIfExists(path);
//		Files.deleteIfExists(movePath);
//		System.out.println("files deleted");

	}

}
