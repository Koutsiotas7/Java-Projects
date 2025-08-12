package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.io.IOException;

public class DirectoryReadRunner {

	public static void main(String[] args) throws IOException
	{
		Path pathFileToRead = Paths.get("./resources/data.txt");
		List <String> lines = Files.readAllLines(pathFileToRead);
		System.out.println(lines);
		
		Files.lines(pathFileToRead).filter(str -> str.contains("a"))
		.forEach(System.out::println);
	}

}
