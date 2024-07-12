import java.io.*;
import java.net.URL;

public class ModuleEight {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		try {
//            ReadConsole obj = new ReadConsole();
//            obj.consoleReader();
//        } catch (IOException e) {
//            System.err.println("An error occurred: " + e.getMessage());
//        }

//		CreateFile obj1 = new CreateFile();
//		obj1.fileCreator();
		
		FileStreamTest obj2 = new FileStreamTest();
		obj2.tester();
	}

}

// Creates InputStreamReader to read standard input stream until the user types a "q"
class ReadConsole {
	void consoleReader() throws IOException {
		InputStreamReader cin = null;
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit");
			char c;
			do {
				c = (char) cin.read();
				System.out.print(c);
			} while (c != 'q');
		} finally {
			if (cin != null) {
				cin.close();
			}
		}
	}
}

class CreateFile {
//	@SuppressWarnings("deprecation")
	void fileCreator() throws IOException {
		File path = new File("hello.txt");
		System.out.println(path);
		System.out.println(path.exists());
		System.out.println(path.isDirectory());

//		String contentToWrite = "I love Java\n";
//		OutputStream outStream = new FileOutputStream(path);
//		outStream.write(contentToWrite.getBytes());
//		outStream.close();

//		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
//		String firstLine = reader.readLine();
//		reader.close();
//		System.out.println("Read a line: " + firstLine);

		URL url = new URL("https://en.wikipedia.org/wiki/Li_Xin_(Qin)");
		InputStream stream = url.openStream();
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(stream));
		String line = reader1.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader1.readLine();
		}
		System.out.println("Done reading");
	}
}

// Testing out File Input and Output Streams
class FileStreamTest {
	void tester() {
		try {
			byte bWrite[] = { 65, 66, 67, 68, 69 };
			OutputStream os = new FileOutputStream("test.txt");
			for (int i = 0; i < bWrite.length; i++) {
				os.write(bWrite[i]); // writes the bytes
			}
			os.close();
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			for (int i = 0; i < size; i++) {
				System.out.println((char) is.read() + " ");
			}
			is.close();
		} catch (IOException e) {
			System.out.println("Exception");
		}
	}
}

//class ReadConsole {
//    void consoleReader() throws IOException {
//        try (InputStreamReader cin = new InputStreamReader(System.in)) {
//            System.out.println("Enter characters, 'q' to quit");
//            char c;
//            do {
//                c = (char) cin.read();
//                System.out.print(c);
//            } while (c != 'q');
//        }
//    }
//}