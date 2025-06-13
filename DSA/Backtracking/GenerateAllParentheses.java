package DSA.Backtracking;

import java.util.ArrayList;

public class GenerateAllParentheses {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    generate(arrayList, 1, "", 0, 0);
    System.out.println(arrayList);
  }

  static void generate(ArrayList<String> ans, int A, String s, int o, int c) {
    if (s.length() == 2 * A) {
      ans.add(s);
      return;
    }
    if (o < A) {
      generate(ans, A, s + "(", o + 1, c);
    }

    if (o > c) {
      generate(ans, A, s + ")", o, c + 1);
    }
  }
}
