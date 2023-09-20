import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main.givenAFileShowStringAlongWithTheLineNumber("hey", new File("./quijote.txt"));
	}

	public static void givenAFileShowStringAlongWithTheLineNumber(String givenLine, File givenFile) {
		StringBuilder textFileBuilder = new StringBuilder();
		Scanner textReader;
		try {
			textReader = new Scanner(givenFile);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		while (textReader.hasNextLine()) {
			textFileBuilder.append(textReader.nextLine());
		}
		String textFile = textFileBuilder.toString();
		String[] textFileLines = textFile.split("\n");
		for (int i = 0; i < textFileLines.length; i++) {
			if (textFileLines[i].contains(givenLine)) {

			}
		}
		System.out.println(textFile);
	}
}