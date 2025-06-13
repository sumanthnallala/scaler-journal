package ScalerModules.Module04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo implements Comparable<Demo> {

  String name;
  int age;
  int rollNumber;
  int psp;

  public static void main(String[] args) {

    Demo demo = new Demo();
    demo.name = "sumanth";
    demo.age = 1;
    demo.rollNumber = 123;
    demo.psp = 70;

    Demo demo2 = new Demo();
    demo2.name = "abhinav";
    demo2.age = 10;
    demo2.rollNumber = 113;
    demo2.psp = 80;

    Demo dem3 = new Demo();
    dem3.name = "kim";
    dem3.age = 11;
    dem3.rollNumber = 133;
    dem3.psp = 60;

    ArrayList<Demo> arrayList = new ArrayList<>();
    arrayList.add(demo);
    arrayList.add(demo2);
    arrayList.add(dem3);

    Collections.sort(arrayList);

    for (Demo list : arrayList) {
      System.out.println(list.name);
    }

    System.out.println("############################");

    Collections.sort(arrayList, Comparator.comparing(o -> o.name)
    );

    for (Demo list : arrayList) {
      System.out.println(list.name);
    }

    System.out.println("############################");

    Collections.sort(arrayList, new RollNumberComparator());

    for (Demo list : arrayList) {
      System.out.println(list.name);
    }
  }

  @Override
  public int compareTo(Demo o) {
    return this.psp - o.psp;
  }
}

class NameComparator implements Comparator<Demo> {

  @Override
  public int compare(Demo name1, Demo name2) {
    return name1.name.charAt(0) - name2.name.charAt(0);
  }
}

class RollNumberComparator implements Comparator<Demo> {

  @Override
  public int compare(Demo o1, Demo o2) {
    return o1.rollNumber - o2.rollNumber;
  }
}
