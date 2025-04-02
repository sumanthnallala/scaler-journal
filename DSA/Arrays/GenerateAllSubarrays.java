package DSA.Arrays;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class GenerateAllSubarrays {

  /**
   * Problem Description You are given an array A of N integers. Return a 2D array consisting of all
   * the subarrays of the array
   * <p>
   * Note : The order of the subarrays in the resulting 2D array does not matter.
   * <p>
   * Problem Constraints 1 <= N <= 100 1 <= A[i] <= 105
   * <p>
   * Input Format First argument A is an array of integers.
   * <p>
   * Output Format Return a 2D array of integers in any order.
   */

  static void subArray(int[] arr) {
    int n = arr.length;
    int size = (n * (n + 1)) / 2;
    int[][] res = new int[size][];
    int index = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int[] subarray = new int[j - i + 1];
        for (int k = i; k <= j; k++) {
          subarray[k - i] = arr[k];
        }
        res[index++] = subarray;
      }
    }

    for (int[] ele : res) {
      System.out.println(Arrays.toString(ele));
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    subArray(arr);
  }

}
