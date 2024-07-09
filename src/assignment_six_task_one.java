
public class assignment_six_task_one {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
