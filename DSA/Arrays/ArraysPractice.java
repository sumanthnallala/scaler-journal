package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

  public static void main(String[] args) {
//    maxMin();
//    rotateArray();
//    reverseInRange();
//    generateAllSubArrays();
//    subArraysInRange();
//    mainDiagonalSum();
    maxOnes();
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

  static void mainDiagonalSum() {
    Scanner scanner = new Scanner(System.in);
    String[] input = scanner.nextLine().split(" ");
    int rows = Integer.parseInt(input[0]);
    int columns = Integer.parseInt(input[1]);
    boolean squareMatrix = rows == columns;
    int index = 2;
    int mainDiagonal = 0;
    int[][] matrix = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = Integer.parseInt(input[index++]);
      }
    }
    for (int i = 0; i < rows; i++) {
      mainDiagonal += matrix[i][i];
    }
    System.out.println(mainDiagonal);
  }

  static void maxOnes() {
    int[][] A = {{0, 1, 1}, {1, 1, 1}, {0, 0, 1}};
    int max = 0;
    int index = -1;
    int n = A.length;
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (A[i][j] == 1) {
          count++;
        }
      }
      if (count > max) {
        max = count;
        index = i;
      }
    }
    System.out.println(index);
  }
  // 3 3 1 2 3 4 5 6 7 8 9

}
