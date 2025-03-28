package DSA.Arrays;

public class GoodPairs {

  // Given an array A and an integer B.
  // A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
  // Check if any good pair exist or not.

  // Input format
  // First argument is an integer array A.
  // Second argument is an integer B.

  // Output format
  // Return 1 if good pair exist otherwise return 0.

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int n = 5;
    boolean res = goodPair(arr, n);
    if (res) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  public static boolean goodPair(int[] arr, int n) {
    boolean res = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == n) {
          res = true;
          break;
        }
      }
    }
    return res;
  }

}

// learnings from this code

// declaration of array
// int [] arr;, int [] array = new int[5];, int [] = {1, 2, 3, 4, 5};
// iterating through array
//for(int num : array){
//print(num);
//}
// parameter vs argument,
// parameter is the value declared in method signature,
// argument is the value that we pass to while performing a method call