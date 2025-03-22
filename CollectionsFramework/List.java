package CollectionsFramework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.sound.midi.Soundbank;

public class List {

  public void ArrayListDemo() {
    ArrayList<Integer> list = new ArrayList<>();
    System.out.println("Adding elements to the list");
    list.add(1); // adding element to the list
    list.add(1, 2);
    list.addAll(list);
    System.out.println(list);
    System.out.println("fetching elements based on index " + list.get(0));
    System.out.println("replacing elements based on index " + list.set(0, 0));
    System.out.println("removing elements based on index " + list.remove(0));
    System.out.println("find the index of the element " + list.indexOf(2));
    System.out.println("find the last index of the element " + list.lastIndexOf(2));
    System.out.println("Check if the number is present in the list " + list.contains(2));
    System.out.println("Check if the list is empty " + list.isEmpty());
    System.out.println("Check the size of the list " + list.size());
    System.out.println(list);
    list.clear();
    Collections.addAll(list, 1,2,3,4,5);
    System.out.println(list);
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public void LinkedListDemo() {
    // LinkedList
  }

  public static void main(String[] args) {
    List list = new List();
    list.ArrayListDemo();
  }
}
