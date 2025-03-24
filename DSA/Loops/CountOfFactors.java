package DSA.Loops;

import java.util.Scanner;

public class CountOfFactors {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input your number: ");
    int n = scanner.nextInt();
    System.out.println("Count of factors: " + factors(n));
  }

  public static int factors(int n) {
    int start = 1;
    int end = n;
    int factorsCount = 0;
    while (start <= end) {
      if (n % start == 0) {
        System.out.println(start);
        factorsCount++;
      }
      start++;
      end--;
    }
    return factorsCount;
  }

}
