package OOPS;

class EncapsulationDemo{
  String name;

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }
}

public class Encapsulation {

  public static void main(String[] args) {
    EncapsulationDemo obj = new EncapsulationDemo();
    obj.setName("Sumanth");
    System.out.println(obj.getName());
  }

}
