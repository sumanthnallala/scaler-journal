package DSA.Math;

import Utils.Input;

public class PerfectNumber {

  public static void main(String[] args) {
    Input input = new Input();
    int n = input.input();
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
