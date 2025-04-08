package DSA.Arrays;

import java.util.Arrays;

public class ArraysPractice {

  public static void main(String[] args) {
//    maxMin();
//    rotateArray();
//    reverseInRange();
//    generateAllSubArrays();
    subArraysInRange();
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

  static void generateAllSubArrays() {
    int[] A = {1, 2, 3, 4, 5};
    int N = A.length;
    int count = N * (N + 1) / 2;
    int[][] subArrays = new int[count][];
    int index = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i; j < N; j++) {
        int[] subArray = new int[j - i + 1];
        for (int k = i; k <= j; k++) {
          subArray[k - i] = A[k];
        }
        subArrays[index++] = subArray;
      }
    }
    for (int[] array : subArrays) {
      System.out.println(Arrays.toString(array));
    }

  }

  static void subArraysInRange() {
    int[] A = {1, 2, 3, 4, 5};
    int start = 1;
    int end = 4;
    int N = end - start;
    int count = N * (N + 1) / 2;
    int[][] subArrays = new int[count][];
    int index = 0;
    for (int i = start; i < end; i++) {
      for (int j = i; j < end; j++) {
        int[] subArray = new int[j - i + 1];
        for (int k = i; k <= j ; k++) {
          subArray[k-i] = A[k];
        }
        subArrays[index++] = subArray;
      }
    }

    for(int [] array : subArrays){
      System.out.println(Arrays.toString(array));
    }
  }


}
