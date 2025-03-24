package DSA.Loops;

import java.util.Scanner;

public class CountOfPrimes {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input your number: ");
    int n = scanner.nextInt();
    System.out.println("Total Count of prime numbers is : " + countOfPrimes(n));
  }

  public static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int countOfPrimes(int n) {
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
        System.out.println(i);
        count++;
      }
    }
    return count;
  }

}

// learnings from this class
// calling the method in same class has multiple ways
// 1 -> remove static keyword from main method and call the util method in main method
// 2 -> create an instance of the class and call the method
// 3 -> make the method as static and call the util method in main method

// best way is to make use of static method