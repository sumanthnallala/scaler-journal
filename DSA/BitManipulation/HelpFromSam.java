package DSA.BitManipulation;

public class HelpFromSam {

  /**
   * Problem Description Alex and Sam are good friends. Alex is doing a lot of programming these
   * days. He has set a target score of A for himself. Initially, Alex's score was zero. Alex can
   * double his score by doing a question, or Alex can seek help from Sam for doing questions that
   * will contribute 1 to Alex's score. Alex wants his score to be precisely A. Also, he does not
   * want to take much help from Sam. Find and return the minimum number of times Alex needs to take
   * help from Sam to achieve a score of A.
   * <p>
   * Problem Constraints 0 <= A <= 10^9
   * <p>
   * Input Format The only argument given is an integer A.
   * <p>
   * Output Format Return the minimum number of times help taken from Sam.
   * <p>
   * Example Input Input 1: A = 5 Input 2: A = 3
   * <p>
   * Example Output Output 1: 2 Output 2: 2
   * <p>
   * Example Explanation Explanation 1: Initial score : 0 Takes help from Sam, score : 1 Alex solves
   * a question, score : 2 Alex solves a question, score : 4 Takes help from Sam, score: 5
   * Explanation 2: Initial score : 0 Takes help from Sam, score : 1 Alex solves a question, score :
   * 2 Takes help from Sam, score : 3
   */

  static int helpFromSam(int A) {
    //bruteforce
    int count = 0;
    int help = 0;
    while(help <= A){
      if(help == 0){
        help++;
        count++;
      }
      help *= 2;
    }
    count++;
    System.out.println(count);
    return count;
  }

  public static void main(String[] args) {
    helpFromSam(5);
    helpFromSam(3);
  }

}
