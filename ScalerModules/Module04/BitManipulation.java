package ScalerModules.Module04;

public class BitManipulation {

  public static void main(String[] args) {
    checkEvenOrOdd();
    countTheNumberOfBits();
    reversingTheBits();
    swappingTwoNumbers();
    checkNumberIsPowerOfTwo();
    findTheRightMostSetBit();
    clearingTheRightMostSetBit();
    addBinaryNumbers();
    setBit();
    unSetBit();
    checkBit();
    test();
    toggleBit();
  }

  static void checkEvenOrOdd() {
    int n = 20;
    if ((n & 1) == 0) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
    }
  }

  static void countTheNumberOfBits() {
    int n = 20;
    int count = 0;
    while (n > 0) {
      n = n & n - 1;
      count++;
    }
    System.out.println("Count the number of bits: " + count);
  }

  static void reversingTheBits() {
    int num = 12345;
    int reversed = 0;
    while (num > 0) {
      reversed = (reversed << 1) | (num & 1); // Shift left and add the last bit
      num >>= 1; // Shift the number right
    }
    System.out.println("Reversed bits: " + reversed);
  }

  static void swappingTwoNumbers() {
    int a = 5;
    int b = 10;

    System.out.println("Before swap a: " + a + " b: " + b);
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    System.out.println("After swap a: " + a + " b: " + b);
  }

  static void checkNumberIsPowerOfTwo() {
    int n = 16;
    if ((n & (n - 1)) == 0) {
      System.out.println("Number is a power of two");
    } else {
      System.out.println("Number is not a power of two");
    }
  }

  static void findTheRightMostSetBit() {
    int n = 12;
    int res = -n & n;
    System.out.println("Right most set bit: " + res);
  }

  static void clearingTheRightMostSetBit() {
    int n = 12;
    int res = n & (n - 1);
    System.out.println("Clearing the right most set bit: " + res);
  }

  static void addBinaryNumbers() {
    String a = "1010";
    String b = "1101";
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    StringBuilder sb = new StringBuilder();

    while (i >= 0 || j >= 0 || carry != 0) {
      int sum = carry;

      if (i >= 0) {
        sum += a.charAt(i) - '0';
        i--;
      }

      if (j >= 0) {
        sum += b.charAt(j) - '0';
        j--;
      }

      carry = sum / 2;
      sb.append(sum % 2);

    }
    System.out.println(sb.reverse().toString());

  }

  static void setBit() {
    int A = 3;
    int B = 5;
    int res = 1 << A | 1 << B;
    System.out.println(res);
  }

  static void unSetBit() {
    int A = 4;
    int B = 1;
    int res = A & ~(1 << B);
    System.out.println(res);
  }

  static void checkBit() {
    int A = 4;
    int B = 1;
    if ((A & (1 << B)) > 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  static void test() {
    int A = 4;
    System.out.println(4 >> 1);
    System.out.println(4 << 1);
  }

  static void toggleBit() {
    int A = 4;
    int B = 1;
    int res = A ^ 1 << B;
    System.out.println(res);
  }

}
