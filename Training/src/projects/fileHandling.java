package projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
	public static void main(String[] args) {
		String filename = "newFile.txt";
		String wt, apnd;
		Scanner sc = new Scanner(System.in);
		createfile(filename);
		System.out.print("Type File Content : ");
		wt = sc.nextLine();
		writeContent(filename, wt);
		System.out.println("Reading data from your file" + filename);
		readContent(filename);
		System.out.print("Enter the string to add : ");
		apnd = sc.nextLine();
		append(filename, apnd);
//reading data after append
		System.out.println("Reading data from " + filename + " after append");
		readContent(filename);
		sc.close();
	}

// create file function
	public static void createfile(String fname) {
		File file = new File(fname);
		try {
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // Write content function

	public static void writeContent(String fname, String wrt) {
		File file = new File(fname);
		FileWriter writer;
		try {
			writer = new FileWriter(file);
			writer.write(wrt);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // Read content function

	public static void readContent(String fname) {
		File file = new File(fname);
		try {
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured ");
			e.printStackTrace();
		}
	} // Append data function

	public static void append(String fname, String s1) {
		File file = new File(fname);
		try {
			FileWriter output = new FileWriter(file, true);
			output.write(" ");
			output.write(s1);
			output.close();
		} catch (IOException ex) {
			System.out.println("File append error...");
		}
	}
}
