import java.util.Scanner;

public class task_four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfInputs = 5;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numberOfInputs; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;  
        }

        double average = (double) sum / numberOfInputs;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
