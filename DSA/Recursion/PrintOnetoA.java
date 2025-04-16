package DSA.Recursion;

import java.sql.SQLOutput;

public class PrintOnetoA {

  /**
   * Problem Description You are given an integer A, print 1 to A using using recursion. Note :-
   * After printing all the numbers from 1 to A, print a new line.
   * <p>
   * Problem Constraints 1 <= A <= 104
   * <p>
   * Input Format First argument A is an integer.
   * <p>
   * Output Format Print A space-separated integers 1 to A. Note: There should be exactly one space
   * after each integer. After printing all the integers, print a new line
   * <p>
   * Example Input Input 1: A = 10 Input 2: A = 5
   * <p>
   * Example Output Output 1: 1 2 3 4 5 6 7 8 9 10 Output 2: 1 2 3 4 5
   * <p>
   * Example Explanation Explanation 1: Print 1 to 10 space separated integers. Explanation 2: Print
   * 1 to 5 space separated integers.
   */

  public static void oneToA(int A) {
    //brute force
    StringBuilder res = new StringBuilder();
    for (int i = 1; i <= A; i++) {
      res.append(i).append(" ");
    }
    System.out.println(res);
    System.out.println();
  }

  static String oneToAA(int current, int A) {
    // using recursion
    if (current > A) {
      return "";
    }
    return current + " " + oneToAA(current + 1, A);
  }


  public static void main(String[] args) {
//    oneToA(10);
    String result = oneToAA(1, 10);
    System.out.println(result);
    System.out.println(result.trim());
  }

}
