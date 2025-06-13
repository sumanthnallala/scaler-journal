package DSA.Math;

public class PascalTriangle {

  public static void main(String[] args) {
    pascalTriangle();
  }

  static void pascalTriangle() {
    int A = 4;
    int result = 0;
    for (int i = 0; i <= A; i++) {
      for (int j = 0; j <= i; j++) {
        result = factorial(i) / (factorial(i - j) * factorial(j));
        System.out.print(result + " ");
      }
      System.out.println();
    }
  }

  static int factorial(int A) {
    int result = 1;
    while (A > 0) {
      result *= A;
      A--;
    }
    return result;
  }

  static void pascalOptimised() {

  }
}
