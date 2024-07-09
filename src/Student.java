
public class Student {
	
	String name;
	int roll_no;
	
	Student(String n, int r) {
		this.name = n;
		this.roll_no = r;
	}
	
	void getInfo(String phoneNumber, String address){
		System.out.printf("My name is %s, my roll number is %d. I live in %s and you can call me anytime on %s", this.name, this.roll_no, address, phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Student john = new Student("John", 2);
	      Student sam = new Student("John", 2);
	     
	      john.getInfo("5555555555", "Canada");
	      System.out.println();
	      sam.getInfo("1112223334", "Paris");

	}

}
