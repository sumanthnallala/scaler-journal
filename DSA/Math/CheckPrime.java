package DSA.Math;

import java.util.Scanner;

public class CheckPrime {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input your number: ");
    int n = scanner.nextInt();
    boolean res = true;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        res = false;
      }
    }
    System.out.println(res);
  }
}
