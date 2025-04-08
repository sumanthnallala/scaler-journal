package DSA.Arrays;

import java.util.Arrays;

public class ArraysPractice {

  public static void main(String[] args) {
//    maxMin();
//    rotateArray();
    reverseInRange();
  }

  static int maxMin() {
    int[] A = {1, 2, 3, 4, 5};
    int max = A[0];
    int min = A[0];
    for (int num : A) {
      if (num > max) {
        max = num;
      }
      if (num < min) {
        min = num;
      }
    }
    System.out.println(max + min);
    return max + min;
  }

  static int[] reverseInRange(int start, int end, int[] A) {
    while (start < end) {
      int temp = A[start];
      A[start] = A[end];
      A[end] = temp;
      start++;
      end--;
    }
    System.out.println(Arrays.toString(A));
    return A;
  }

  static int[] rotateArray() {
    int[] A = {1, 2, 3, 4, 5};
    int n = A.length;
    int B = 2;
    if (B > n) {
      B = B % n;
    }
    reverseInRange(0, n - 1, A);
    reverseInRange(0, B - 1, A);
    reverseInRange(B, n - 1, A);
    return A;
  }

  static int[] reverseInRange() {
    int[] A = {1, 2, 3, 4, 5};
    int B = 2;
    int C = 3;
    while (B < C) {
      int temp = A[B];
      A[B] = A[C];
      A[C] = temp;
      B++;
      C--;
    }
    System.out.println(Arrays.toString(A));
    return A;
  }


}
