package DSA.Arrays;

import java.util.Arrays;

public class ReverseInRange {

  /**
   * Given an array A of N integers and also given two integers B and C. Reverse the elements of the
   * array A within the given inclusive range [B, C]. Input Format The first argument A is an array
   * of integer. The second and third arguments are integers B and C Output Format Return the array
   * A after reversing in the given range.
   */

  static void reverseArrayInRange(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int B = 2;
    int C = 4;
    reverseArrayInRange(arr, B, C);
    System.out.println(Arrays.toString(arr));
    // 1 2 5 4 3
  }
}
