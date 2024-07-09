
class Animal {
 void makeSound() {
     System.out.println("Some sound");
 }
}

class Dog extends Animal {
 void makeSound() {
     System.out.println("Bark bark");
 }
}

class Cat extends Animal {
 void makeSound() {
     System.out.println("Meow meow");
 }
}

public class assignment_five_task_one {
 public static void main(String[] args) {
     Animal myAnimal1 = new Dog(); 
     Animal myAnimal2 = new Cat(); 

     myAnimal1.makeSound(); 
     myAnimal2.makeSound();
 }
}
