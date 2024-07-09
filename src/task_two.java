import java.util.Scanner;
public class task_two {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any number to generate a weekday: ");
        int userInput = scanner.nextInt();

        int day = (int) (Math.random() * 7) + 1;

        String weekday;
        switch (day) {
            case 1:
                weekday = "Sunday";
                break;
            case 2:
                weekday = "Monday";
                break;
            case 3:
                weekday = "Tuesday";
                break;
            case 4:
                weekday = "Wednesday";
                break;
            case 5:
                weekday = "Thursday";
                break;
            case 6:
                weekday = "Friday";
                break;
            case 7:
                weekday = "Saturday";
                break;
            default:
                weekday = "Invalid day";
                break;
        }

        System.out.println("Generated day: " + day + " (" + weekday + ")");

        scanner.close();
    }
}

