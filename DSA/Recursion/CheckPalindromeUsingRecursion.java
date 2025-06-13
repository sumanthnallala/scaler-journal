package DSA.Recursion;

public class CheckPalindromeUsingRecursion {

  public static void main(String[] args) {
    String s = "namana";
    int start = 0;
    int end = s.length() - 1;
    boolean result = checkPalindrome(start, end, s);
    if (result) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }

  static boolean checkPalindrome(int start, int end, String s) {
    if (start > end) {
      return true;
    }
    if (s.charAt(start) != s.charAt(end)) {
      return false;
    }
    return checkPalindrome(start + 1, end - 1, s);
  }

}
