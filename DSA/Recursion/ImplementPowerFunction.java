package DSA.Recursion;

public class ImplementPowerFunction {

  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    int c = 3;

    int result = 1;
    for (int i = 1; i <= b; i++) {
      result *= a;
    }

    System.out.println(result % c);
  }

}
