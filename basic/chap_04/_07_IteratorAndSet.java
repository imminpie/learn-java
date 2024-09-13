package basic.chap_04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _07_IteratorAndSet {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);

    // Iterator 생성
    Iterator<Integer> iterator = set.iterator();

    // Iterator 를 사용하여 요소 순회
    while (iterator.hasNext()) {
      Integer element = iterator.next();
      System.out.println(element);
    }
    // 1
    // 2
    // 3

    // 반복을 다시 시작하려면 Iterator 객체를 반드시 초기화해야 한다.
    iterator = set.iterator();

    // Iterator 를 사용하여 요소를 다시 순회
    while (iterator.hasNext()) {
      Integer element = iterator.next();
      System.out.println(element * 2);
    }
    // 2
    // 4
    // 6
  }
}
