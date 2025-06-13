package Utils;

public class SingletonExample {

  private SingletonExample() {

  }

  public static SingletonExample getInstance() {
    return SingletonHelper.INSTANCE;
  }

  public void showMessage(){
    System.out.println("Singleton example");
  }

  public static void main(String[] args) {

  }

  private static class SingletonHelper {
    private static final SingletonExample INSTANCE = new SingletonExample();
  }
}
