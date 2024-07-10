
import java.io.File;
import java.io.IOException;

public class assignment_seven_task_one {

    public static void main(String[] args) {
        
        String fileName = "myfile.txt";
        
        try {
            
            File file = new File(fileName);
            
            
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
