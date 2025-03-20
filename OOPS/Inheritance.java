package OOPS;

// Parent class
class Animal {

  void makeSound() {
    System.out.println("Animal makes a sound");
  }
}

// Child class inheriting Animal class
class Dog extends Animal {

  void makeSound() {
    System.out.println("Dog barks");
  }
}

public class Inheritance {

  public static void main(String[] args) {
    Animal dog = new Dog();
    dog.makeSound();
  }
}
