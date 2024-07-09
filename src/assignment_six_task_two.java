
public class assignment_six_task_two {
    public static void main(String[] args) {
        try {
            int result = divideByZero(10, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Array index out of bounds");
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        
        System.out.println("Program continues after try-catch-finally block");
    }

    public static int divideByZero(int numerator, int denominator) {
        return numerator / denominator;
    }
}
