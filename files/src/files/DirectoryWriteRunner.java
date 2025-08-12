package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.io.IOException;

public class DirectoryWriteRunner {

	public static void main(String[] args) throws IOException
	{
		Path pathFileToWrite = Paths.get("./resources/file-write.txt");
		
		List<String> list = List.of("Apple","Boy", "Cat", "Hat");
		
		Files.write(pathFileToWrite, list);

	}

}
