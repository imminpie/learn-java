package basic.chap_04;

import java.util.HashSet;
import java.util.Set;

public class _04_Set {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();

    set.add(1);
    set.add(2);
    set.add(3);

    System.out.println(set.size()); // 3

    System.out.println(set.contains(2)); // true

    set.remove(2);
    System.out.println(set.contains(2)); // false

    set.clear();

    System.out.println(set.isEmpty()); // true
  }
}
