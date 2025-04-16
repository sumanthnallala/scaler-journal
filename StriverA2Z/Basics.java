package StriverA2Z;

import java.util.Scanner;

public class Basics {

  public static void main(String[] args) {
//    inputOutput();
    ifElse();
    switchCase();
    countDigits();
    sumOfDigits();
    reverseNumber();
    palindromeNumber();
    gcdHcf();
    armstrongNumber();
  }

  static void inputOutput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your input: ");
    int num = scanner.nextInt();
    System.out.println(num);
  }

  static void ifElse() {
    int marks = 95;
    if (marks >= 90) {
      System.out.println("Grade A");
    } else if (marks >= 70) {
      System.out.println("Garde B");
    } else if (marks >= 50) {
      System.out.println("Grade C");
    } else if (marks >= 35) {
      System.out.println("Grade D");
    } else {
      System.out.println("Fail");
    }
  }

  static void switchCase() {
    int day = 1;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid");
        break;
    }
  }

  /**
   * Collection, List, Set, Map, Queue order and allowed duplicates in List unordered and duplicates
   * are not allowed unordered and no duplicate keys
   * <p>
   * ArrayList, LinkedList, HashSet, LinkedHashSet, TreeSet HashMap, LinkedHashMap, TreeMap,
   * HashTable, ConcurrentHashMap
   */

  public static void countDigits() {
    int n = 10101;
    int count = 0;
    while (n > 0) {
      n = n / 10;
      count++;
    }
    System.out.println("Count of digits: " + count);
  }

  public static void sumOfDigits() {
    int n = 101001;
    int result = 0;
    while (n > 0) {
      int sum = n % 10;
      n = n / 10;
      result += sum;
    }
    System.out.println("Sum of digits: " + result);
  }

  public static void reverseNumber() {
    int num = 12;
    int revNum = 0;
    while (num > 0) {
      int digit = num % 10;
      revNum = revNum * 10 + digit;
      num = num / 10;
    }
    System.out.println(revNum);
  }

  public static void palindromeNumber() {
    int num = 121;
    int revNum = 0;
    int dup = num;
    while (num > 0) {
      int res = num % 10;
      revNum = revNum * 10 + res;
      num = num / 10;
    }
    if (dup == revNum) {
      System.out.println("Given number is a palindrome");
    } else {
      System.out.println("Given number is not a palindrome");
    }
  }

  static void gcdHcf() {
    int n1 = 12;
    int n2 = 24;
    int max = Math.max(n1, n2);
    int gcd = 1;
    for (int i = 1; i <= max; i++) {
      if ((n1 % i == 0) && (n2 % i == 0) && i > gcd) {
        gcd = i;
      }
    }
    System.out.println(gcd);
  }

  static void armstrongNumber() {
    int n = 153;
    int dup2 = n;
    int sum = 0;
    int digits = String.valueOf(n).length();
    for (int i = 0; i < digits; i++) {
      int digit = dup2 % 10;
      dup2 = dup2 / 10;
      sum += Math.pow(digit, digits);
    }
    if(sum == n){
      System.out.println("Given number is a armstrong number");
    } else{
      System.out.println("Given number is not a armstrong number");
    }
  }
}
