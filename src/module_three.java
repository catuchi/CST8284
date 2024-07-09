
class A {
	int i, j;
	
	A() {
		i=1;
		j=2;
	}
}

public class module_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// the basic for class definition is:
		
//		class classname [extends superclassname] {
//			[fields declaration;]
//			[method declaration;]
//		}
		
		Object obj = new Object();
		System.out.println(obj.getClass());
		
		A obj1 = new A();
		System.out.println(obj1.toString());

	}

}