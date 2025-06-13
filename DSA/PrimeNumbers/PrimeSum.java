package DSA.PrimeNumbers;

public class PrimeSum {

  public static void main(String[] args) {
    primeSum();
  }

  static void primeSum() {
    int A = 4;
    int[] result = new int[2];
    for (int i = 2; i <= A; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          System.out.println(i + " is not a prime number");
          break;
        }
      }
      if (isPrime) {
        if (Math.pow(i, 2) == A) {
          result[0] = i;
          result[1] = i;
        }
        System.out.println(i + " is a prime number");
      }
    }
  }
}
