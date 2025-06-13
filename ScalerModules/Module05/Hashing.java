package ScalerModules.Module05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Hashing {

  public static void main(String[] args) {
    frequencyOfElementQuery();
    countDistinctElements();
    firstRepeatingElement();
    commonElements();
  }

  static void frequencyOfElementQuery() {
    int[] A = {6, 3, 3, 6, 7, 8, 7, 3, 7};
    int[] B = {10, 9, 8};
    int[] res = new int[B.length];
    HashMap<Integer, Integer> freq = new HashMap<>();
    for (int i = 0; i < A.length; i++) {
      freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
    }
    for (int i = 0; i < B.length; i++) {
      res[i] = freq.getOrDefault(B[i], 0);
    }
    System.out.println("Frequency of elements query: " + Arrays.toString(res));
  }

  static void countDistinctElements() {
    int[] A = {3, 4, 3, 6, 6};
    HashSet<Integer> hashSet = new HashSet<>();
    for (int num : A) {
      hashSet.add(num);
    }
    System.out.println("Count Distinct Elements: " + hashSet.size());
  }

  static void firstRepeatingElement() {
    int[] A = {10, 5, 3, 4, 3, 5, 6};
    HashMap<Integer, Integer> freq = new HashMap<>();
    int res = -1;
    for (int j : A) {
      freq.put(j, freq.getOrDefault(j, 0) + 1);
    }
    for (int j : A) {
      if (freq.containsKey(j) && freq.get(j) > 1) {
        res = j;
      }
    }
    System.out.println("First Repeating Element: " + res);
  }

  static void commonElements() {
    int[] A = {2, 1, 4, 10};
    int[] B = {3, 6, 2, 10, 10};

    HashMap<Integer, Integer> freqA = new HashMap<>();
    List<Integer> res = new ArrayList<>();

    for (int num : A) {
      freqA.put(num, freqA.getOrDefault(num, 0) + 1);
    }

    for (int num : B) {
      if (freqA.containsKey(num) && freqA.get(num) > 0) {
        res.add(num);
        freqA.put(num, freqA.getOrDefault(num, 0) - 1);
      }
    }
    System.out.println("Common Elements: " + res);
  }

}
