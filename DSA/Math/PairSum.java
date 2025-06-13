package DSA.Math;

public class PairSum {

  public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5};
    int B = 2;
    pairSum(A, B);
  }

  static int pairSum(int[] A, int B) {
    int n = A.length;
    int[] freq = new int[B];
    long ans = 0;
    for (int i = 0; i < n; i++) {
      int val = A[i] % B;
      int pair = B - val;
      if (val == 0) {
        pair = 0;
      }
      ans = ans + freq[pair];
      freq[val]++;
    }
    return (int) ans % 1_000_000_007;
  }
}
