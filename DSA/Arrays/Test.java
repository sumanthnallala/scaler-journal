package DSA.Arrays;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    System.out.println(Arrays.toString(test(nums)));
  }

  public static int[] test(int[] nums) {
    int n = nums.length;
    int[] ans = new int[2 * n];
    int start = 0;
    int index = 0;
    while (index < 2 * n) {
      if (start % n == 0) {
        start = 0;
      }
      ans[index] = nums[start];
      index++;
      start++;
    }
    return ans;
  }

}
