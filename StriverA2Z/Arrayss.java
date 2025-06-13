package StriverA2Z;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arrayss {

  public static void main(String[] args) {
//    largestElement();
//    secondLargest();
//    checkIfArrayIsSorted();
//    removeDuplicates();
//    linearSearch();
//    unionOfTwoArrays();
  }
  //leetcode

  static void largestElement() {
    int[] arr = {1, 2, 3, 4};
    int largest = Integer.MIN_VALUE;
    for (int num : arr) {
      if (num > largest) {
        largest = num;
      }
    }
    System.out.println("Largest Number: " + largest);
  }

  static void secondLargestLC() {
    int[] arr = {1, 2, 3, 4, 6, 5};
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int num : arr) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }
    }
    System.out.println("Largest Number: " + largest);
    System.out.println("Second Largest Number: " + secondLargest);
  }

  static void checkIfArrayIsSorted() {
    int[] arr = {1, 2, 3, 4, 6, 5};
    int first = arr[0];
    boolean isSorted = true;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] <= first) {
        isSorted = false;
        break;
      } else {
        first = arr[i];
      }
    }
    if (isSorted) {
      System.out.println("Array is sorted");
    } else {
      System.out.println("Array is not sorted");
    }
  }

  static void removeDuplicates() {
    int[] nums = {1, 3, 1, 2};
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    Set<Integer> set = new HashSet();
    int n = nums.length;
    int[] expectedNums = new int[n];
    int index = 0;
    for (int i = 0; i < n; i++) {
      if (set.add(nums[i])) {
        expectedNums[index++] = nums[i];
      }
    }
    for (int i = 0; i < n - set.size(); i++) {
      expectedNums[index++] = 0;
    }
    System.out.println(java.util.Arrays.toString(expectedNums));
    System.out.println(set.size());
  }

  static void linearSearchLC() {
    int[] res = {1, 2, 3, 4, 5, 6};
    int target = 5;
    int index = -1;
    for (int i = 0; i < res.length; i++) {
      if (res[i] == target) {
        index = i;
        break;
      }
    }
    System.out.println("Linear Search Value: " + index);
  }

  static void unionOfTwoArrays() {
    int[] arr1 = {1, 2, 3, 4, 5};
    int n1 = arr1.length;
    int[] arr2 = {1, 2, 4, 7};
    int n2 = arr2.length;
    List<Integer> result = new ArrayList<>();
    int i = 0, j = 0;
    while (i < n1 && j < n2) {
      if (arr1[i] < arr2[j]) {
        result.add(arr1[i++]);
      } else if (arr1[i] > arr2[j]) {
        result.add(arr2[j++]);
      } else {
        result.add(arr1[i]);
        i++;
        j++;
      }
    }
    while (i < n1) {
      result.add(arr1[i++]);
    }
    while (j < n2) {
      result.add(arr2[j++]);
    }
    System.out.println(result);
  }

}
