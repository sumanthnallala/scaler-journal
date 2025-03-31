package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {

  public int inputNumber() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }

  public int[] inputArray() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number of elements: ");
    int size = Integer.parseInt(bufferedReader.readLine());
    int[] arr = new int[size];
    System.out.println("Enter elements separated by space: ");
    String[] input = bufferedReader.readLine().split(" ");
    for (int i = 0; i < size; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }
    return arr;
  }

}
