
// Polymorphism

public class module_six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add(1,3));
		System.out.println(add("Sub", "scriber"));

	}
	
	// method overloading
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static String add(String a, String b) {
		return a + b;
	}
}
