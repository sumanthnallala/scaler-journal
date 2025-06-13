package ScalerModules.Module02;

public class Strings {

  public static void main(String[] args) {
    toggleCase();
    simpleReverse();
    reverseString();
    stringOperations();
  }

  static void toggleCase() {
    String s = "aBcDeF";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= 'a' && c <= 'z') {
        sb.append((char) (c - 32));
      } else {
        sb.append((char) (c + 32));
      }
    }
    System.out.println("Toggle Case: " + sb.toString());
  }

  static void simpleReverse() {
    String s = "abcde";
    StringBuilder sb = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      sb.append(s.charAt(i));
    }
    System.out.println("Simple Reverse: " + sb.toString());
  }

  static void reverseString() {
    String s = "the  sky is  blue".replaceAll(" +", " ").trim();
    StringBuilder sb = new StringBuilder();
    String[] res = s.split(" ");
    for (int i = 0; i < res.length; i++) {
      sb.append(res[res.length - i - 1]);
      if (i != res.length - 1) {
        sb.append(" ");
      }
    }
    System.out.println("Reverse String: " + sb.toString());
  }

  static void stringOperations() {
    String s = "aeiOUz";
    StringBuilder sb = new StringBuilder();
    String newString = s + s;
    for (int i = 0; i < newString.length(); i++) {
      char c = newString.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        sb.append("#");
      } else if (c >= 'a' && c <= 'z') {
        sb.append(c);
      }
    }
    System.out.println("String Operations: " + sb.toString());
  }
}
