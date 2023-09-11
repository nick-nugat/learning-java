// Needed for the File class
import java.io.*;
import java.util.Scanner;

/**

This program reads data from a file.

*/

public class ReadFromFile {
        public static void main(String[] args) throws IOException {
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter the name of the file: " );
            String fileName = input.nextLine();

            File newFile = new File(fileName);
            Scanner fileInput = new Scanner(newFile);
            input.close();

            while (fileInput.hasNextLine())
                        System.out.println(fileInput.nextLine());

            fileInput.close();



        }

    }