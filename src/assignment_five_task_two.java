
public class assignment_five_task_two {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
    	assignment_five_task_two obj = new assignment_five_task_two();

        int sum1 = obj.add(10, 20);
        System.out.println("Sum of 10 and 20: " + sum1);

        int sum2 = obj.add(10, 20, 30);
        System.out.println("Sum of 10, 20, and 30: " + sum2);

        String concatenatedString = obj.add("Hello, ", "world!");
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
