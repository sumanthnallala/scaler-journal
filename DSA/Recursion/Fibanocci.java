package DSA.Recursion;

public class Fibanocci {

  /**
   * Problem Description Write a program to find the factorial of the given number A using
   * recursion. Note: The factorial of a number N is defined as the product of the numbers from 1 to
   * N.
   * <p>
   * Problem Constraints 0 <= A <= 12
   * <p>
   * Input Format First and only argument is an integer A.
   * <p>
   * Output Format Return an integer denoting the factorial of the number A.
   * <p>
   * Example Input Input 1: A = 4 Input 2: A = 1
   * <p>
   * Example Output Output 1: 24 Output 2: 1
   * <p>
   * Example Explanation Explanation 1: Factorial of 4 = 4 * 3 * 2 * 1 = 24 Explanation 2: Factorial
   * of 1 = 1
   */


  public static void main(String[] args) {
    try{
      int num = 1234;

      int sum = 0;
      while (num != 0) {
        sum += num % 10;   // get the last digit
        num /= 10;         // remove the last digit
      }

      System.out.println("Sum of digits = " + sum);
    } catch (Exception e){

    }

  }

}
