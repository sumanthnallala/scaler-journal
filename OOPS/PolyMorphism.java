package OOPS;

class Ant{

  void makeSound() {
    System.out.println("Ant carry's sugar");
  }
}

class Bee extends Ant{

  void makeSound() {
    System.out.println("Bee makes honey");
  }
}

class Cows{

  void makeSound() {
    System.out.println("Cows gives milk");
  }

  void makeSound(String sound) {
    System.out.println("Cows makes sound: " + sound);
  }
}

public class PolyMorphism {

  public static void main(String[] args) {
    Ant bee = new Bee();
    bee.makeSound(); // Method Over Riding ( Run Time Polymorphism )
    Cows cow = new Cows();
    cow.makeSound("Moo"); // Method Over Loading ( Compile Time Polymorphism )
  }
}
