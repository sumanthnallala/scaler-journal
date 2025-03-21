package OOPS;

interface AbstractionDemo {
  void makeSound();
}

public class Abstraction implements AbstractionDemo {
  public void makeSound() {
    System.out.println("Animal makes a sound");
  }
}

class Main{
  public static void main(String[] args) {
    AbstractionDemo dog = new Abstraction();
    dog.makeSound();
  }
}
