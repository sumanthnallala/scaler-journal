package DSA.LinkedList;

public class LinkedList {

  Node head;

  public static void main(String[] args) {

  }

  void insert(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }

    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

}
