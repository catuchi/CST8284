
// Java Exceptions
public class module_seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] nums = { 1, 2, 3 };
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println("Something went wrong");

		}

		AgeChecker obj = new AgeChecker();
		obj.checkAge(18);

		try {
			System.out.print("Hello" + " " + 1 / 0);
		} catch (ArithmeticException e) {
			System.out.print("World");
		}
		
		System.out.println();

		// finally keyword
		try 
        {
            int a, b;
            b = 0;
            a = 5 / b;
            System.out.print("A");
        }
        catch(ArithmeticException e) 
        {
    	System.out.print("B");        	
        }
        finally 
        {
	        System.out.print("C");
        }

	}

}

//class AgeChecker{
//	void checkAge(int age) {
//		if(age<18) {
//			throw new ArithmeticException("Access Denied - Must be 18years or over");
//		} else {
//			System.out.println("Access Granted - Welcome!");
//		}
//	}
//}

// throws keyword
class AgeChecker {
	void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("Access Denied - Must be 18years or over");
		} else {
			System.out.println("Access Granted - Welcome!");
		}
	}
}