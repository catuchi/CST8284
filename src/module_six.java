
// Polymorphism

public class module_six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add(1,3));
		System.out.println(add("Sub", "scriber"));
		
//		Derived obj = new Derived();
		
		Geeks obj1 = new Geeks();
		GFG obj2 = new Geeks();
		obj1.getData();
		obj2.getData();
	}
	
	// method overloading
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static String add(String a, String b) {
		return a + b;
	}
}

//
abstract class Base {
	Base(){
		System.out.println("Base Constructor called");
	}
	abstract void fun();
}

class Derived extends Base {
	Derived(){
		System.out.println("Derived Constructor called");
	}
	void fun() {
		System.out.println("Derived fun() called");
	}
}

//
class GFG {
	protected void getData() {
		System.out.println("Inside GFG");
	}
}

class Geeks extends GFG{
	protected void getData() {
		System.out.println("Inside Geeks");
	}
}






