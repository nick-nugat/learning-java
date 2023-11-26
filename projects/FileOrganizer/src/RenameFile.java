import java.io.File;
import java.util.Scanner;

public class RenameFile {
	public static void main(String[] args) {
		String fileName, renamed, typeOfFile;
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is the file you want to rename?");
		fileName = scanner.nextLine();
		System.out.println("What type of file is it? (.md/.txt)");
		typeOfFile = scanner.nextLine();

		File file = new File("src/" + fileName + typeOfFile);

		while (!file.exists()) {
			System.out.println("Sorry, that is not a valid file. Please enter another one.");
			fileName = scanner.nextLine();
			System.out.println("What type of file is it? (.md/.txt)");
			typeOfFile = scanner.nextLine();
			file = new File("src/" + fileName + typeOfFile);
		}

		System.out.println("What do you want to rename this file to?");
		renamed = scanner.nextLine();
		File renamedFile = new File("src/" + renamed + typeOfFile);


		boolean wasRenamed = file.renameTo(renamedFile);

		System.out.println(wasRenamed ? "Successfully renamed" : "There was an error");
	}

}

