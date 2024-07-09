
//public class assignment_four_task_one {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

class ParentClass {
 public void printParentMethod() {
     System.out.println("This is parent class");
 }
}

class ChildClass extends ParentClass {
 public void printChildMethod() {
     System.out.println("This is child class");
 }
}

public class assignment_four_task_one {
 public static void main(String[] args) {
     ParentClass parentObj = new ParentClass();
     
     parentObj.printParentMethod();
     
     ChildClass childObj = new ChildClass();
     
     childObj.printChildMethod();
     
     childObj.printParentMethod();
 }
}
