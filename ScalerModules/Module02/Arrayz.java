package ScalerModules.Module02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrayz {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    goodPairs();
    reverseInRange(2, 3, arr);
    arrayRotation();
    maxMinSum();
    linearSearch();
    secondLargest();
    timeToEquality();
    countOfElements();
    rangeSumQuery();
    closestMinMax();
    specialSubsequenceAG();
    subArrayInGivenRange();
    generateAllSubArrays();
    bestTimeToBuyAndSellStocks();
    pickFromBothSides();
    subtractProductAndSum();
    leadersInArray();
    sumOfAllSubArrays();
    totalSubArraySum();
    totalNumberOfSubArraysOfLength();
    printStartAndEndIndices();
    maxSubArrayEasy();
    subArrayWithSumAndLength();
    goodSubArraysEasy();
  }

  static void goodPairs() {
    /*
    Given Array A and Integer B.
    return 1 if good pair exists, else return 0
     */

    int[] A = {1, 2, 3, 4};
    int B = 7;
    int n = A.length;
    boolean isPresent = false;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (B - A[i] == j) {
          isPresent = true;
          break;
        }
      }
    }
    if (isPresent) {
      System.out.println("Good pairs: " + 1);
    } else {
      System.out.println("Good pairs: " + 0);
    }
  }

  static void reverseInRange(int s, int e, int[] arr) {
    /*
    Given an array A of N integers and also given two integers B and C.
     */
    while (s < e) {
      int temp = arr[s];
      arr[s] = arr[e];
      arr[e] = temp;
      s++;
      e--;
    }
    System.out.println("Reverse in range: " + Arrays.toString(arr));

  }

  static void arrayRotation() {
    /*
    Given an integer array A of size N and an integer B,
    you have to return the same array after rotating it B times towards the right.
     */
    int[] A = {1, 2, 3, 4};
    // output [3, 4, 1, 2]
    int N = A.length;
    int B = 2;
    if (B > N) {
      B = B % N;
    }
    reverseInRange(0, N - 1, A);
    reverseInRange(0, B - 1, A);
    reverseInRange(B, N - 1, A);
    System.out.println("Rotated Array: " + Arrays.toString(A));
  }

  static void maxMinSum() {
    /*
    Given an array A of size N. You need to find the
    sum of Maximum and Minimum element in the given array.
     */
    int[] A = {-2, 1, -4, 5, 3};
    int max = Integer.MIN_VALUE; // use
    int min = Integer.MAX_VALUE;
    for (int num : A) {
      max = Math.max(num, max);
      min = Math.min(min, num);
    }
    System.out.println("Max Min Sum: " + (max + min));
  }

  static void linearSearch() {
    /*
    Given an array A and an integer B, find the number of occurrences of B in A.
     */
    int[] A = {1, 2, 2};
    int B = 2;
    int count = 0;
    for (int num : A) {
      if (num == B) {
        count++;
      }
    }
    System.out.println("Linear Search: " + count);

  }

  static void secondLargest() {
    /*
    You are given an integer array A. You have to find the
    second largest element/value in the array or report that no such element exists
     */
    int[] A = {2, 1, 2, 3};
    int secondLargest = Integer.MIN_VALUE;
    int largest = Integer.MIN_VALUE;
    for (int num : A) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }
    }
    System.out.println("Second Largest: " + secondLargest);
  }

  static void timeToEquality() {
    /*
    Given an integer array A of size N. In one second,
    you can increase the value of one element by 1.
    Find the minimum time in seconds to make all elements of the array equal.
     */
    int[] A = {2, 4, 1, 3, 2};
    int max = Integer.MIN_VALUE;
    int time = 0;
    for (int num : A) {
      max = Math.max(num, max);
    }
    for (int num : A) {
      time += max - num;
    }
    System.out.println("Time to equality: " + time);
  }

  static void countOfElements() {
    /*
    Given an array A of N integers.
    Count the number of elements that have at least 1 elements greater than itself.
     */
    int[] A = {5, 5, 4};
    int count = 0;
    int max = Integer.MIN_VALUE;
    for (int num : A) {
      max = Math.max(num, max);
    }
    for (int num : A) {
      if (num < max) {
        count++;
      }
    }
    System.out.println("Count of Elements: " + count);
  }

  static void rangeSumQuery() {
    int[] A = {2, 2, 2};
    int[][] B = {{0, 0}, {1, 2}};
    int n = A.length;
    int m = B.length;
    int[] pf = new int[n];
    long[] res = new long[m];
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        pf[0] = A[0];
      } else {
        pf[i] = A[i] + pf[i - 1];
      }
    }
    for (int i = 0; i < m; i++) {
      int sum = 0;
      int L = B[i][0];
      int R = B[i][1];
      if (L == 0 || R == 0) {
        sum = pf[R];
        res[i] = sum;
      } else {
        sum = pf[R] - pf[L - 1];
        res[i] = sum;
      }
    }
    System.out.println("Range Sum Query: " + Arrays.toString(res));
  }

  static int[] calculateOddIndexedPrefixSum(int[] res) {
    int n = res.length;
    int[] pf = new int[n];
    pf[0] = 0;
    for (int i = 1; i < n; i++) {
      if (i % 2 != 0) {
        pf[i] = pf[i - 1] + res[i];
      } else {
        pf[i] = pf[i - 1];
      }
    }
    return pf;
  }

  static int[] calculateEvenIndexedPrefixSum(int[] res) {
    int n = res.length;
    int[] pf = new int[n];
    pf[0] = res[0];
    for (int i = 1; i < n; i++) {
      if (i % 2 == 0) {
        pf[i] = pf[i - 1] + res[i];
      } else {
        pf[i] = pf[i - 1];
      }
    }
    return pf;
  }

  static void specialIndex() {
    int count = 0;
    int[] res = {4, 3, 2, 7, 6, -2};
    int n = res.length;
    int[] pfEven = calculateEvenIndexedPrefixSum(res);
    int[] pfOdd = calculateOddIndexedPrefixSum(res);
    int sumOdd = 0;
    int sumEven = 0;
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        sumOdd = pfEven[n - 1] - pfEven[i];
        sumEven = pfOdd[n - 1] - pfOdd[i];
      } else {
        sumOdd = pfOdd[i - 1] + pfEven[n - 1] - pfEven[i];
        sumEven = pfEven[i - 1] + pfOdd[n - 1] - pfOdd[i];
      }
      if (sumOdd == sumEven) {
        count++;
      }
    }
    System.out.println(count);
  }

  static void closestMinMax() {
    int[] arr = {2, 6, 1, 6, 9};
    int max = Integer.MIN_VALUE;
    int maxIndex = 0;
    int min = Integer.MAX_VALUE;
    int minIndex = 0;
    int len = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        maxIndex = i;
      }
      if (arr[i] < min) {
        min = arr[i];
        minIndex = i;
      }
    }
    len = (maxIndex - minIndex) + 1;
    System.out.println("Closest min max: " + len);
  }

  static void specialSubsequenceAG() {
    String s = "ABCGAG";
    int count = 0;
    int counta = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'A') {
        counta += 1;
      }
      if (s.charAt(i) == 'G') {
        count += counta;
      }
    }
    System.out.println("Special Subsequences: " + count);
  }

  static void subArrayInGivenRange() {
    int[] A = {4, 3, 2, 6};
    int B = 1;
    int C = 3;
    int index = 0;
    int[] subArray = new int[(C - B) + 1];
    for (int i = B; i <= C; i++) {
      subArray[index++] = A[i];
    }
    System.out.println("Sub Array in given range: " + Arrays.toString(subArray));
  }

  static void generateAllSubArrays() {
    int[] arr = {1, 2, 3};
    int n = arr.length;
    int[][] res = new int[(n * (n + 1) / 2)][];
    int index = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int[] subArray = new int[j - i + 1];
        for (int k = i; k <= j; k++) {
          subArray[k - i] = arr[k];
        }
        System.out.println("Generate All SubArrays: " + Arrays.toString(subArray));
        res[index++] = subArray;
      }
    }
  }

  static void bestTimeToBuyAndSellStocks() {
    int[] arr = {1, 4, 5, 2, 4};
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int num : arr) {
      max = Math.max(num, max);
      min = Math.min(min, num);
    }
    maxProfit = max - min;
    System.out.println("Best time to buy and sell stocks is: " + (max - min));
  }

  static void pickFromBothSides() {
    int[] A = {5, -2, 3, 1, 2};
    int B = 3;
    int sum = 0;
    for (int i = 0; i < B; i++) {
      sum = sum + A[i];
    }
    int j = A.length - 1;
    int max = sum;
    for (int i = B - 1; i >= 0; i--) {
      sum = sum - A[i] + A[j];
      j--;
      if (sum > max) {
        max = sum;
      }
    }
  }

  static void subtractProductAndSum() {
    int n = 123;
    int sum = 0;
    int product = 0;
    while (n > 0) {
      int digit = n % 10;
      n = n / 10;
      sum += digit;
      product *= digit;
    }
    System.out.println("Difference of product and sum: " + (product - sum));
  }

  static void leadersInArray() {
    int[] arr = {16, 17, 4, 3, 5, 2};
    int n = arr.length;
    int last = arr[n - 1];
    List<Integer> res = new ArrayList<>();
    res.add(last);
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] > last) {
        res.add(arr[i]);
        last = arr[i];
      }
    }
    System.out.println("Leaders in Array: " + res);
  }

  static void sumOfAllSubArrays() {
    int[] arr = {1, 2, 3};
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      int total = 0;
      for (int j = i; j < n; j++) {
        total += arr[j];
        System.out.println(total);
      }
    }
  }

  static void totalSubArraySum() {
    int[] arr = {1, 2, 3};
    int n = arr.length;
    int res = 0;

    for (int i = 0; i < n; i++) {
      int total = 0;
      for (int j = i; j < n; j++) {
        total += arr[j];
        res += total;
      }
    }

    System.out.println("Total SubArray Sum: " + res);
  }

  static void totalNumberOfSubArraysOfLength() {
    int[] A = {3, -2, 4, -1, 2, 6};
    int N = A.length;
    int K = 3;
    System.out.println("Total Number of SubArrays with length: " + (N - K + 1));
  }

  static void printStartAndEndIndices() {
    int[] A = {3, -2, 4, -1, 2, 6};
    int N = A.length;
    int K = 3;
    int start = 0;
    int end = K - 1;
    while (end < N) {
      System.out.println("Start and end indices: " + start + "-" + end);
      start++;
      end++;
    }
  }

  static void maxSubArrayEasy() {
    int A = 5;
    int B = 12;
    int[] arr = {2, 1, 3, 4, 5};
    int total = 0;
    for (int i = 0; i < A; i++) {
      int sum = 0;
      for (int j = i; j < A; j++) {
        sum += arr[j];
        if (sum <= B) {
          total = Math.max(sum, total);
        } else {
          break;
        }
      }
    }
    System.out.println("Max sub array: " + total);
  }

  static void subArrayWithSumAndLength() {
    int[] A = {4, 3, 2, 6, 1};
    int N = A.length;
    int B = 3;
    int C = 11;
    int start = 0;
    int end = B;
    boolean isPresent = false;
    while (end < N) {
      int sum = 0;
      for (int i = start; i < end; i++) {
        sum += A[i];
      }
      end++;
      start++;
      if (sum == C) {
        isPresent = true;
        break;
      }
    }
    if (isPresent) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  static void goodSubArraysEasy() {
    int[] A = {1, 2, 3, 4, 5};
    int count = 0;
    int B = 4;
    int N = A.length;
    for (int i = 0; i < N; i++) {
      int sum = 0;
      for (int j = i; j < N; j++) {
        sum += A[j];
        if (((j - i + 1) % 2 == 0 && sum < B) || ((j - i + 1) % 2 != 0 && sum > B)) {
          count++;
        }
      }
    }
    System.out.println("Good SubArrays Easy: " + count);
  }
}
