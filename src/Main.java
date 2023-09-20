import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main.givenAFileShowStringAlongWithTheLineNumber("aventura, y muchas veces", new File("./quijote.txt"));
	}

	public static void givenAFileShowStringAlongWithTheLineNumber(String givenLine, File givenFile) {
		StringBuilder textFileBuilder = new StringBuilder();
		Scanner textReader;
		try {
			textReader = new Scanner(givenFile);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		int i = 0;
		do {
			if (textFileBuilder.append(textReader.nextLine()).toString().contains(givenLine)){
				System.out.println(givenLine + " <-exists\nIn the line-> " + i); //Encuentras el string, pero no en qué linea
			}
			i++;
		} while (!textFileBuilder.append(textReader.nextLine()).toString().contains(givenLine));
		/*String textFile = textFileBuilder.toString();
		String[] textFileLines = textFile.split("\n");
		for (int i = 0; i < textFileLines.length; i++) {
			if (textFileLines[i].contains(givenLine)) {

			}
		}*/
	}
}