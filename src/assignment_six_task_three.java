import java.util.Scanner;

public class assignment_six_task_three {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner closed in finally block");
            }
        }
        
        System.out.println("Program continues after try-catch-finally block");
    }
}
