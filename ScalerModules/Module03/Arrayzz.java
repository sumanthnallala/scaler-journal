package ScalerModules.Module03;

import java.util.Arrays;

public class Arrayzz {

  public static void main(String[] args) {
    columnSum();
    mainDiagonalSum();
    matrixTranspose();
    elementsRemoval();
    nobleInteger();
    kthSmallestElement();
    trailingZerosInFactorial();
    veryLargePower();
  }

  static void columnSum() {
    int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
    int rows = arr.length;
    int columns = arr[0].length;
    int[] res = new int[columns];
    for (int i = 0; i < columns; i++) {
      int sum = 0;
      for (int j = 0; j < rows; j++) {
        sum += arr[j][i];
      }
      res[i] = sum;
    }
    System.out.println("Column Sum: " + Arrays.toString(res));
  }

  static void mainDiagonalSum() {
    int[][] arr = {{1, 2, 3}, {5, 6, 7}, {9, 2, 3}};
    int r = arr.length;
    int c = arr[0].length;
    int sum = 0;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (i == j) {
          sum += arr[i][j];
        }
      }
    }
    System.out.println("Main Diagonal Sum: " + sum);
  }

  static void matrixTranspose() {
    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int r = arr.length;
    int c = arr[0].length;
    int[][] result = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        result[i][j] = arr[j][i];
      }
    }
    for (int[] res : result) {
      System.out.println("Matrix Transpose: " + Arrays.toString(res));

    }
  }

  static void elementsRemoval() {
    int[] arr = {1, 2, 5, 4};
    int n = arr.length;
    int sum = 0;
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      sum += (n - i) * arr[i];
    }
    System.out.println("Elements Removal: " + sum);
  }

  static void nobleInteger() {
    int[] arr = {3, 2, 1, 3};
    int n = arr.length;
    Arrays.sort(arr);
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == n - i - 1) {
        System.out.println("Noble Integer: " + 1);
        count++;
        break;
      }
    }
    if (count == 0) {
      System.out.println("Noble Integer: " + -1);
    }
  }

  static void kthSmallestElement() {
    int[] A = {2, 1, 4, 3, 2};
    int B = 3;
    Arrays.sort(A);
    System.out.println("Kth Smallest Element : " + A[B - 1]);
  }

  static void trailingZerosInFactorial() {
    int A = 5;
    int ans = 0;
    for (int i = 5; i <= A; i *= 5) {
      ans += A / i;
    }
    System.out.println(ans);
  }

  static void veryLargePower() {
    int A = 1;
    int B = 1;
    int result = 0;
    System.out.println(factorial(5));
  }

  static long factorial(int A) {
    if (A <= 1) {
      return 1;
    }
    return A * factorial(A - 1);
  }



}
