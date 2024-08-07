package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {
	public static void main(String[] args) throws IOException {
		Path dir = Paths.get(".");
		Predicate<? super Path> predicate = path -> String.valueOf(path).endsWith(".java");
		//		Files.list(dir).forEach(System.out::println);
		Files.walk(dir, 4).filter(predicate).forEach(System.out::println);

		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> String.valueOf(path)
				.endsWith(".java");

		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(dir, 4, directoryMatcher).forEach(System.out::println);

	}
}
