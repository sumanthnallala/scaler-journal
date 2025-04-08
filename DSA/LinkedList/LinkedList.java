package DSA.LinkedList;

public class LinkedList {

  Node head;

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.insertFirst(1);
    System.out.println(linkedList);
  }

  void insertLast(int data) {
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

  void insertFirst(int data){
    Node newNode = new Node(data);

    Node head = null;
    newNode.next = head;
    head = newNode;
  }

}
