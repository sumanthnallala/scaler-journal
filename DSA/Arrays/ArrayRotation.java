package DSA.Arrays;

import Utils.Input;
import java.io.IOException;
import java.util.Arrays;

public class ArrayRotation {

  /**
   * Given an integer array A of size N and an integer B, you have to return the same array after
   * rotating it B times towards the right.
   * <p>
   * Input Format The first argument given is the integer array A. The second argument given is the
   * integer B.
   * <p>
   * Output Format Return the array A after rotating it B times to the right
   */

  static void reverseInRange(int[] arr, int start, int end) {
    int n = arr.length;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  static void reverseArray(int n, int k, int[] arr) {
    reverseInRange(arr, 0, n - 1);
    reverseInRange(arr, 0, n - k - 1);
    reverseInRange(arr, n - k, n - 1);
  }

  public static void main(String[] args) throws IOException {
    Input input = new Input();
    int[] A = input.inputArray();
    int N = A.length;
    System.out.println("Please enter your integer value for B: ");
    int B = input.inputNumber();
    if (B > N) {
      B = B % N;
    }
    reverseArray(N, B, A);
    System.out.println(Arrays.toString(A));
  }

}
