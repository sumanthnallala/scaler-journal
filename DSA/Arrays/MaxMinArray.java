package DSA.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MaxMinArray {
  // Given an array A of size N.
  // You need to find the sum of Maximum and Minimum element in the given array.

  //  Input Format
  //  First argument A is an integer array.

  //  Output Format
  //  Return the sum of maximum and minimum element of the array

  public static void main(String[] args) throws IOException {
    maxMinArray();
//    readingArrayUsingBufferedReader();
  }

  static void readingArrayInputsUsingScanner() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number of elements: ");
    int size = scanner.nextInt();
    int[] A = new int[size];
    System.out.println("Please enter " + size + " elements: ");
    for (int i = 0; i < size; i++) {
      A[i] = scanner.nextInt();
    }
    System.out.println("Array elements are: ");
    for (int num : A) {
      System.out.println(num);
    }
    scanner.close();
  }

  static void readingArrayUsingBufferedReader() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements: ");
    int size = Integer.parseInt(bufferedReader.readLine());
    int[] arr = new int[size];
    System.out.println("Enter " + size + " elements separated by space ");
    String[] input = bufferedReader.readLine().split(" ");
    for (int i = 0; i < size; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }
    System.out.println("Array elements are: ");
    for (int num : arr) {
      System.out.println(num);
    }
  }

  static void maxMinArray() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements: ");
    int size = Integer.parseInt(bufferedReader.readLine());

    int[] arr = new int[size];
    System.out.println("Enter elements separated by space");
    String[] input = bufferedReader.readLine().split(" ");

    for (int i = 0; i < size; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int num : arr) {
      if (num > max) {
        max = num;
      }
      if (num < min) {
        min = num;
      }
    }

    System.out.println("Sum of maximum and minimum element in an array is: " + (max + min));
  }

}

// learnings from this problem
// how to read an array of elements and iterate over them to return sum of max and min element
// BufferedReader, InputStreamReader, ParseInt, MAX_VALUE, MIN_VALUE,
