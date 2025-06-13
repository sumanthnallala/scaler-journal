package ScalerModules.Module04;

import java.util.Arrays;
import java.util.Comparator;

public class Arrayzz {

  public static void main(String[] args) {
    maxSumContiguousSubArray();
    continuousSumArray();
    rainWaterTrapped();
    addOneToNumber();
    spiralOrderMatrix();
    searchRowWiseAndColumnWise();
    sumOfAllSubMatrices();
    mergeOverLappingIntervals();
    setBit();
    unsetBit();
    singleNumber2();
  }

  static int maxSumContiguousSubArray() {
    int[] A = {1, 2, 3, 4, -10};
    int sum = 0;
    int res = Integer.MIN_VALUE;
    for (int i = 0; i < A.length; i++) {
      sum += A[i];
      res = Math.max(sum, res);
      if (sum < 0) {
        sum = 0;
      }
    }
    System.out.println("Max sum contiguous subArray: " + res);
    return sum;
  }

  static void continuousSumArray() {
    int A = 5;
    int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
    int[] res = new int[A];

    for (int i = 0; i < B.length; i++) {
      int L = B[i][0] - 1;
      int R = B[i][1] - 1;
      int P = B[i][2];
      res[L] += P;
      if (R + 1 < A) {
        res[R + 1] -= P;
      }
    }

    for (int i = 1; i < A; i++) {
      res[i] += res[i - 1];
    }

    System.out.println("Continuous sum array: " + Arrays.toString(res));
  }

  static void rainWaterTrapped() {
    int[] A = {5, 4, 1, 4, 3, 2, 7};
    int count = 0;
    if (A.length < 3) {
      System.out.println(count);
    }
    int[] pf = new int[A.length];
    int[] sf = new int[A.length];

    pf[0] = A[0];
    for (int i = 1; i < A.length; i++) {
      pf[i] = Math.max(pf[i - 1], A[i]);
    }

    sf[A.length - 1] = A[A.length - 1];
    for (int i = A.length - 2; i >= 0; i--) {
      sf[i] = Math.max(sf[i + 1], A[i]);
    }

    for (int i = 1; i < A.length - 1; i++) {
      int maxL = pf[i];
      int maxR = sf[i];
      int water = Math.min(maxL, maxR) - A[i];
      count += water;
    }
    System.out.println("Rain water trapped count: " + count);
  }

  static void addOneToNumber() {
    int[] digits = {1, 2, 3, 4, 9};
    int n = digits.length;

    for (int i = n - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        System.out.println(Arrays.toString(digits));
        break;
      }
      digits[i] = 0; // Carry to the left
    }

    // All digits were 9: need to add a new digit at front (e.g., 999 + 1 = 1000)
    int[] result = new int[n + 1];
    result[0] = 1;
  }

  static void spiralOrderMatrix() {
    int A = 1;
    int[][] res = new int[A][A];
    int r = 0;
    int c = 0;
    int n = A;
    int count = 1;
    while (n > 1) {
      for (int i = 0; i < n - 1; i++) {
        res[r][c] = count++;
        c += 1;
      }

      for (int i = 0; i < n - 1; i++) {
        res[r][c] = count++;
        r += 1;
      }

      for (int i = 0; i < n - 1; i++) {
        res[r][c] = count++;
        c -= 1;
      }

      for (int i = 0; i < n - 1; i++) {
        res[r][c] = count++;
        r -= 1;
      }
      r += 1;
      c += 1;
      n -= 2;
    }

    if (n == 1) {
      res[r][c] = count;
    }
    for (int[] arr : res) {
      System.out.println("Spiral Order Matrix: " + Arrays.toString(arr));
    }
  }

  static void searchRowWiseAndColumnWise() {
    int[][] A = {{1, 2}, {3, 3}};
    int B = 3;
    int n = A.length;
    int r = 0;
    int c = n - 1;
    int res = 0;

    while (r < n && c >= 0) {
      int val = A[r][c];
      if (val == B) {
        res = (r + 1 * 1009) + c + 1;
      }
      if (val > B) {
        c--;
      } else {
        r++;
      }
    }

    System.out.println("Search row wise and column wise: " + res);
  }

  static void sumOfAllSubMatrices() {
    int[][] A = {{1, 1}, {1, 1}};
    int r = A.length;
    int c = A[0].length;
    int sum = 0;

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        int k = (i + 1) * (j + 1) * (r - i) * (c - j);
        sum += k * A[i][j];
      }
    }
    System.out.println("Sum of all sub matrices: " + sum);
  }

  static void mergeOverLappingIntervals() {
    int[][] A = {{3, 2}, {2, 3}};
    Arrays.sort(A, Comparator.comparingInt(a -> a[0]));
    int s = A[0][0];
    int e = A[0][1];
    for (int i = 1; i < A.length - 1; i++) {
      if (e < A[i][1]) {
        s = A[i][0];
        e = A[i][1];
        System.out.println(s + " : " + e);
      } else {
        s = Math.min(s, A[i][0]);
        e = Math.max(e, A[i][1]);
      }
      System.out.println(s + " : " + e);
    }
  }

  static void setBit() {
    int A = 3;
    int B = 5;
    int res = 1 << A | 1 << B;
    System.out.println("Set bit: " + res);
  }

  static void unsetBit() {
    int A = 4;
    int B = 1;
    int res = A & ~1 << B;
    int result = Integer.bitCount(A);
    System.out.println(result);
    System.out.println("unset bit: " + res);
  }

  static void singleNumber2() {
    int[] A = {4, 5, 5, 4, 1, 6, 6, 4, 5, 6};
    int ans = 0;
    for (int i = 0; i <= 32; i++) {
      int count = 0;
      for (int j = 0; j < A.length; j++) {
        if ((A.length & (1 << j)) > 0) {
          count++;
        }
      }
      if (count % 2 == 1) {
        ans |= 1 << i;
      }
    }
    System.out.println("Single Number 2: " + ans);
  }
}
