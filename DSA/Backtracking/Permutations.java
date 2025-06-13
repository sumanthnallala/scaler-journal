package DSA.Backtracking;

import java.util.Arrays;

public class Permutations {

  public static void main(String[] args) {
    int[] A = {1, 2, 3};
    boolean[] used = {false, false, false};
    int[] perm = new int[A.length];
    permutations(A, 0, used, perm);
  }

  static void permutations(int[] A, int pos, boolean[] used, int[] perm) {
    if (pos == A.length) {
      System.out.println(Arrays.toString(perm));
      return;
    }
    for (int i = 0; i < A.length; i++) {
      if (!used[i]) {
        used[i] = true;
        perm[pos] = A[i];
        permutations(A, pos + 1, used, perm);
        used[i] = false;
        perm[pos] = 0;
      }
    }
  }
}
