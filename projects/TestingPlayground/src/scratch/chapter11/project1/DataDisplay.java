package scratch.chapter11.project1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

public class DataDisplay {
	public static void main(String[] args) {
		String filePath = "data.dat";

		try (FileInputStream fileInputStream = new FileInputStream(filePath);
			 DataInputStream file = new DataInputStream(fileInputStream)) {
			firstFiveBytes(file);
			evenNumberedBytes(file);
			oddNumberedBytes(file);
			lastFiveBytesInReverse(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Error");
		} catch (EOFException e) {
			System.out.println("EOF Error");
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	private static void firstFiveBytes(DataInputStream file) throws IOException {
		for (int i = 0; i < 5; i++) {
			byte firstByte = file.readByte();
			System.out.println(firstByte);
		}
	}

	private static void evenNumberedBytes(DataInputStream file) throws IOException {
		for (long position = 0; position < file.available(); position += 2) {
			byte evenByte = file.readByte();
			if (evenByte % 2 == 0){
				System.out.println(evenByte);
			}
		}
	}

	private static void oddNumberedBytes(DataInputStream file) throws IOException {
		for (long position = 1; position < file.available(); position += 2) {
			byte oddByte = file.readByte();
			if (oddByte % 2 == 1) System.out.println(oddByte);
		}
	}

	private static void lastFiveBytesInReverse(DataInputStream file) throws IOException {
		byte[] lastFiveBytes = new byte[5];
		for (int i = 0; i < 5; i++) {
			lastFiveBytes[i] = file.readByte();
		}
		for (int i = 4; i >= 0; i--) {
			System.out.println(lastFiveBytes[i]);
		}
	}
}
