package DSA.Hashing;

import java.util.HashSet;

public class CheckPairSum {

  public static void main(String[] args) {
    System.out.println(checkPair());
  }

  static int checkPair() {
    int A = 9;
    int[] B = {3, 5, 1, 2, 1, 2};
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i = 0; i < B.length; i++) {
      int target = A - B[i];
      if (hashSet.contains(target)) {
        return 1;
      }
      hashSet.add(B[i]);
    }
    return 0;
  }
}
