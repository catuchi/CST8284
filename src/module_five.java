
// a sub class is defined as thus
//		Class subclassname extends superclassname {
//			variables declaration;
//			methods declaration;
//		}

class PC {
	public void myPrintMethod() {
		System.out.println("Parent method");
	}
}

class CC extends PC {
	@Override
	public void myPrintMethod() {
//		super.myPrintMethod(); 					// If i want to call the method from the parent
		System.out.println("Child Method");
	}
}

public class module_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC child = new CC();
		child.myPrintMethod();
		
		PC parent = new PC();
		parent.myPrintMethod();
		
		A5 obj = new A5();
		obj.print();
		
		A6 obj1 = new A6();
		obj1.display();
	}
}

// Interfaces
// Interfaces have static variables and abstract methods (methods without bodies)

interface printable{
	void print();
}

class A5 implements printable{
	public void print() {
		System.out.println("Hello");
	}
}

// extending interfaces
interface wallet{
	int money = 400;
	String item1 = "Picture";
	String item2 = "Credit Card";
}

interface walletDetails{
	void display();
}

class A6 implements walletDetails{
	public void display() {
		System.out.printf("I have a %s, my %s and $%d dollars in my pocket", wallet.item1, wallet.item2, wallet.money);
	}
}



