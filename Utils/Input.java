package Utils;

import java.util.Scanner;

public class Input {

  public int input() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input your number: ");
    int n = scanner.nextInt();
    return n;
  }

}
