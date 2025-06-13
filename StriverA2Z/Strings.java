package StriverA2Z;

import java.util.HashMap;
import java.util.Map;

public class Strings {

  public static void main(String[] args) {
    isAnagram();
  }

  public static boolean isAnagram() {
    String s = "anagram";
    String t = "nagaram";
    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Integer> freq = new HashMap();
    for (char key : s.toCharArray()) {
      freq.put(key, freq.getOrDefault(key, 0) + 1);
    }

    for (char key : t.toCharArray()) {
      freq.put(key, freq.get(key) - 1);
      if (!freq.containsKey(key)) {
        return false;
      }
      if (freq.get(key) == 0) {
        freq.remove(key);
      }
    }
    System.out.println(freq.isEmpty());
    return freq.isEmpty();
  }

}
