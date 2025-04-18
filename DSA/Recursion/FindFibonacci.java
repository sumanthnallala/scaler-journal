package DSA.Recursion;

public class FindFibonacci {

  /**
   * Problem Description The Fibonacci numbers are the numbers in the following integer sequence. 0,
   * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …….. In mathematical terms, the sequence Fn of
   * Fibonacci numbers is defined by the recurrence relation: Fn = Fn-1 + Fn-2 Given a number A,
   * find and return the Ath Fibonacci Number using recursion. Given that F0 = 0 and F1 = 1. Problem
   * Constraints 0 <= A <= 20 Input Format First and only argument is an integer A. Output Format
   * Return an integer denoting the Ath term of the sequence. Example Input Input 1: A = 2 Input 2:
   * A = 9 Example Output Output 1: 1 Output 2: 34 Example Explanation Explanation 1: f(2) = f(1) +
   * f(0) = 1 Explanation 2: f(9) = f(8) + f(7) = 21 + 13  = 34
   */

  public static void findFibonacci(int A) {
    int a = 0;
    int b = 1;
    for (int i = 2; i < A; i++) {
      int next = a + b;
      System.out.println(next);
      a = b;
      b = next;
    }
  }

  public static int fibUsingRecursion(int A) {
    if (A <= 1) {
      return A;
    }
    return fibUsingRecursion(A - 1) + fibUsingRecursion(A - 2);
  }

  public static void main(String[] args) {
    System.out.println(fibUsingRecursion(10));
  }


  // learnings
  // everything is stored in call stack and bubbles up the results of individual frames in recursion
  // JVM calculates and holds all the values
  // recursion wont use any variables to declare and store the values
  // drawback is it calculates the same values multiple times for large inputs.
}
