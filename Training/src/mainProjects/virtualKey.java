package mainProjects;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class virtualKey {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File folder = new File(
				"C:\\Users\\Ahammed Fayas T L\\Desktop\\simplielearn-java\\Projects\\Phase1-Projectwork");
		folder.mkdir(); // creates the folder
		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.println("PROTOTYPE APPLICATION OF LockedMe.com");
			System.out.println("- Developed By Ahammed Fayas T L");
			System.out.println("-------------------------------------------");
			System.out.println("Generic Features of Application are:\n");
			System.out.println("1. To retrieve files in ascending order");
			System.out.println("2. To do Business-Level Operations");
			System.out.println("3. Close the Application");
			System.out.println("\nChoose any above option to continue:");
			int op = s.nextInt();

			switch (op) {
			case 1:
				String listOfFiles[] = folder.list();
				Arrays.sort(listOfFiles);
				for (int i = 0; i < listOfFiles.length; i++) {
					System.out.println(listOfFiles[i]);
				}
				System.out.println("-------------------------------------------");
				break;
			case 2:
				boolean flag = true;
				while (flag) {

					System.out.println("\n1: To add a file to the application");
					System.out.println("2: To delete a file from the application");
					System.out.println("3: To search a file from the application");
					System.out.println("4: Return to the main menu");
					
					System.out.println("\nChoose any above option to continue:");

					int choice = s.nextInt();

					switch (choice) {
					case 1:
						System.out.println("\nEnter the name of file to add:");
						String name = s.next();
						File file = new File(folder, name);
						if (file.createNewFile()) {
							System.out.println("File Successfully created: " + file.getName());
						} else {
							System.out.println("File already exists.");
						}
						break;

					case 2:
						System.out.println("\nEnter the name of file to delete:");
						String ob = s.next();
						File file1 = new File(folder, ob);
						if (file1.delete()) {
							System.out.println("Deleted the file: " + file1.getName());
						} else {
							System.out.println("Failed to delete the file.");
						}
						break;

					case 3:
						System.out.println("\nEnter the name of file to search:");
						String search = s.next();
						String arr[] = folder.list();
						boolean test = Arrays.asList(arr).contains(search);
						if (test) {
							System.out.println("File is present!");
						} else {
							System.out.println("File not found!");
						}
						break;

					case 4:
						flag = false;
						break;

					default:
						System.out.println("Invalid Choice! Please Try Again!");
						break;
					}
				}
				break;
			case 3:
				System.out.println("\nApplication Closed! \nThankYou! \nVisit Again!");
				System.out.println("-------------------------------------------");
				System.exit(0);

			default:
				System.out.println("Invalid Choice! Please Try Again!");
				
				break;
			}
		}

	}

}