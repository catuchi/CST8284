import java.io.*;
import java.util.Scanner;

public class CreateWriteRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a file
		try {
			File f = new File("filename.txt");
			if(f.createNewFile()) {
				System.out.println("File "+ f.getName() + " has been created");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		// Write to a file
		try {
			FileWriter w = new FileWriter("filename.txt");
			w.write("Learning Java is fun\n");
			w.close();
			System.out.println("Successfully wrote to file");
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		
		// Read a file
		try {
			File r = new File("filename.txt");
			Scanner myReader = new Scanner(r);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
