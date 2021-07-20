package Practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void readDataFromFile() throws IOException {

		FileReader reader = new FileReader("D:\\Java\\Test1.txt");
		BufferedReader br = new BufferedReader(reader);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

	}

	public static void readDataFromFileUsingScanner() throws IOException {

		File f = new File("D:\\Java\\Test1.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

	public static void main(String[] args) throws IOException {
		readDataFromFileUsingScanner();
	}
}
