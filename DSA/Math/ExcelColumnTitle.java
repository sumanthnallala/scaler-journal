package DSA.Math;

public class ExcelColumnTitle {

  public static void main(String[] args) {
    excelColumnTitle();
  }

  static String excelColumnTitle() {
    int A = 300;
    char[] array = new char[26];
    for (int i = 0; i < 26; i++) {
      array[i] = (char) ('A' + i);
    }
    int num = 26;
    int index;
    String res = "";
    while (A > 0) {
      index = (A - 1 + num) % num;
      A = (A - 1) / num;
      res = array[index] + res;
    }
    return res;
  }
}
