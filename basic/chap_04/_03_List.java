package basic.chap_04;

import java.util.ArrayList;
import java.util.List;

public class _03_List {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);

    System.out.println(list.get(0)); // 1
    System.out.println(list.get(1)); // 2
    System.out.println(list.get(2)); // 3

    System.out.println(list.size()); // 3

    System.out.println(list.contains(4)); // false

    list.set(0, 0);
    System.out.println(list.get(0)); // 0

    list.remove(0);
    System.out.println(list.get(0)); // 2

    list.clear();

    System.out.println(list.isEmpty()); // true
  }
}
