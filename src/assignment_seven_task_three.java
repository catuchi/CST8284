
import java.io.File;

public class assignment_seven_task_three {

    public static void main(String[] args) {
        String fileName = "myfile.txt";
        
        try {
           
            File file = new File(fileName);
            
            
            if (file.exists()) {
                
                if (file.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("Failed to delete the file.");
                }
            } else {
                System.out.println("File does not exist.");
            }
            
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
