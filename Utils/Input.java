package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {

  public int inputNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input your number: ");
    return scanner.nextInt();
  }

  public int[] inputArray() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int size = Integer.parseInt(bufferedReader.readLine());
    int[] arr = new int[size];
    String[] input = bufferedReader.readLine().split(" ");
    for (int i = 0; i < size; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }
    return arr;
  }

}
