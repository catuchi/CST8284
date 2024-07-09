// This is an application with Two Classes

class Room {
    float length;
    float breadth;

    void getdata(float a, float b) {
        length = a;
        breadth = b;
    }
}

public class RoomArea {
    public static void main(String[] args) {
        float area;

        Room room1 = new Room(); // Creates an object room1
        room1.getdata(14, 10); // Assigns values to length and breadth

        area = room1.length * room1.breadth;
        System.out.println("Area = " + area);
        
//      Student john = new Student("John", 2);
//      Student sam = new Student("John", 2);
//     
//      john.getInfo("5555555555", "Canada");
//      System.out.println();
//      sam.getInfo("1112223334", "Paris");
//      
//    Area area1 = new Area();
//    area1.setDim(8,4);
//    System.out.println();
//    System.out.printf("Area of rectangle with length %d and breadth %d is %d", area1.length, area1.breadth, area1.getArea());
    }
}

//class Student {
//	String name;
//	int roll_no;
//	
//	Student(String n, int r) {
//		this.name = n;
//		this.roll_no = r;
//	}
//	
//	void getInfo(String phoneNumber, String address){
//		System.out.printf("My name is %s, my roll number is %d. I live in %s and you can call me anytime on %s", this.name, this.roll_no, address, phoneNumber);
//	}
//}

// Student john = new Student("John", 2);
// Student sam = new Student("John", 2);
//
// john.getInfo("5555555555", "Canada");
// sam.getInfo("1112223334", "Paris");


//class Area {
//	int length;
//	int breadth;
//	
//	void setDim(int l, int b) {
//		this.length = l;
//		this.breadth = b;
//	}
//	
//	int getArea() {
//		return this.length * this.breadth;
//	}
//}

// Area area1 = new Area();
// area1.setDim(8,4);
// System.out.printf("Area of rectangle with length %d and breadth %d is %d", area1.length, area1.breadth, area1.getArea());
