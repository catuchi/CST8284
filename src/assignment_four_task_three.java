//
//public class assignment_four_task_three {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

class Shape {
 public void printShape() {
     System.out.println("This is shape");
 }
}

class Rectangle extends Shape {
 @Override
 public void printShape() {
     System.out.println("This is rectangular shape");
 }
}

class Circle extends Shape {
 @Override
 public void printShape() {
     System.out.println("This is circular shape");
 }
}

class Square extends Rectangle {
 public void printSquare() {
     System.out.println("Square is a rectangle");
 }
}

public class assignment_four_task_three {
 public static void main(String[] args) {
     Square square = new Square();
     
     square.printShape();
     
     square.printSquare();
 }
}

