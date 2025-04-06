package DSA.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandling {

  public static void fileHandlingUsingScanner() {

  }

  public static void fileHandlingUsingBufferedReader(String filePath) {
    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static void fileHandlingUsingFiles() {

  }


  public static void main(String[] args) {
    String filePath = "/Users/sumanthreddy/scaler-journal/test.txt";
    fileHandlingUsingBufferedReader(filePath);
  }
}
