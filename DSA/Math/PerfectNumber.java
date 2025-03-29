package DSA.Math;

import Utils.Input;

/**
 * You are given an integer A. You have to tell whether it is a perfect number or not. Perfect
 * number is a positive integer which is equal to the sum of its proper positive divisors. A proper
 * divisor of a natural number is the divisor that is strictly less than the number.
 */

public class PerfectNumber {

  public static void main(String[] args) {
    Input input = new Input();
    int n = input.inputNumber();
    int start = 1;
    int end = n;
    int count = 0;
    while (start <= end) {
      if (n % start == 0) {
        count += start;
      }
      start++;
      end--;
    }
    if (count == n) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

}

