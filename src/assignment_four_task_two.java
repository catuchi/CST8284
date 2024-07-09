//
//public class assignment_four_task_two {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

class Member {
 String name;
 int age;
 String phoneNumber;
 String address;
 double salary;
 
 public Member(String name, int age, String phoneNumber, String address, double salary) {
     this.name = name;
     this.age = age;
     this.phoneNumber = phoneNumber;
     this.address = address;
     this.salary = salary;
 }
 
 public void printSalary() {
     System.out.println("Salary: " + salary);
 }
}

class Employee extends Member {
 String specialization;
 
 public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
     super(name, age, phoneNumber, address, salary);
     this.specialization = specialization;
 }
}

class Manager extends Member {
 String department;
 
 public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
     super(name, age, phoneNumber, address, salary);
     this.department = department;
 }
}

public class assignment_four_task_two {
 public static void main(String[] args) {
     Employee emp = new Employee("John Doe", 30, "1234567890", "123 Main St, Cityville", 50000.0, "Software Development");
     
     Manager mgr = new Manager("Jane Smith", 35, "0987654321", "456 Elm St, Townville", 80000.0, "IT");

     System.out.println("Employee Details:");
     System.out.println("Name: " + emp.name);
     System.out.println("Age: " + emp.age);
     System.out.println("Phone Number: " + emp.phoneNumber);
     System.out.println("Address: " + emp.address);
     emp.printSalary();
     System.out.println("Specialization: " + emp.specialization);
     
     System.out.println("Manager Details:");
     System.out.println("Name: " + mgr.name);
     System.out.println("Age: " + mgr.age);
     System.out.println("Phone Number: " + mgr.phoneNumber);
     System.out.println("Address: " + mgr.address);
     mgr.printSalary();
     System.out.println("Department: " + mgr.department);
 }
}

