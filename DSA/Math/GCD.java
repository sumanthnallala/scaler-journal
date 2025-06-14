package DSA.Math;

public class GCD {

  public static void main(String[] args) {
    System.out.println(gcd(4, 6));
  }

  static int gcd(int A, int B) {
    if (B == 0) {
      return A;
    }
    return gcd(B, A % B);
  }
}
