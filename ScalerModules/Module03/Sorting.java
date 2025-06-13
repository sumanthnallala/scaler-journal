package ScalerModules.Module03;

import java.util.Arrays;

public class Sorting {

  public static void main(String[] args) {
    bubbleSort();
    selectionSort();
    insertionSort();
    testBubbleSort();
    testSelectionSort();
  }

  static void bubbleSort() {
    int[] A = {13, 46, 24, 52, 20, 9};
    int N = A.length;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N - i - 1; j++) {
        if (A[j] > A[j + 1]) {
          int temp = A[j];
          A[j] = A[j + 1];
          A[j + 1] = temp;
        }
      }
    }
    System.out.println("Bubble Sort: " + Arrays.toString(A));
  }

  static void selectionSort() {
    int[] A = {13, 46, 24, 52, 20, 9};
    int N = A.length;
    for (int i = 0; i < N; i++) {
      int index = i;
      for (int j = i + 1; j < N; j++) {
        if (A[index] > A[j]) {
          index = j;
        }
      }
      int temp = A[i];
      A[i] = A[index];
      A[index] = temp;
    }
    System.out.println("Selection Sort: " + Arrays.toString(A));
  }

  static void insertionSort() {
    int[] arr = {13, 46, 24, 52, 20, 9};
    for (int i = 1; i < arr.length; i++) {
      int j = i - 1;
      while (j >= 0 && arr[j] > arr[i]) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = arr[i];
    }
    System.out.println("Insertion Sort: " + Arrays.toString(arr));
  }

  static void testBubbleSort() {
    int[] A = {1, 2, 3};
    for (int i = 0; i < A.length; i++) {
      int didSwap = 0;
      for (int j = 0; j < A.length - i - 1; j++) {
        if (A[j] > A[j + 1]) {
          int temp = A[j];
          A[j] = A[j + 1];
          A[j + 1] = temp;
          System.out.println("Yes");
          didSwap++;
        }
      }
      if (didSwap == 0) {
        break;
      }
    }
    System.out.println(Arrays.toString(A));
  }

  static void testSelectionSort() {
    int[] A = {1, 5, 2, 4, 3};
    for (int i = 0; i < A.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < A.length; j++) {
        if (A[min] > A[j]) {
          min = j;
        }
      }
      int temp = A[min];
      A[min] = A[i];
      A[i] = temp;
    }
    System.out.println(Arrays.toString(A));
  }
}
