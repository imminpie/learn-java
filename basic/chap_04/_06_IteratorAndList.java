package basic.chap_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _06_IteratorAndList {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("apple");
    list.add("banana");
    list.add("cherry");

    // Iterator 생성
    Iterator<String> iterator = list.iterator();

    // Iterator 를 사용하여 요소 순회
    while (iterator.hasNext()) {
      String element = iterator.next();
      System.out.println(element);
    }
    // apple
    // banana
    // cherry

    // Iterator 가 소진되었으므로, 이제 다음 반복은 아무것도 출력하지 않는다.
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    // 출력 없음

    // 반복을 다시 시작하려면 Iterator 객체를 반드시 초기화해야 한다.
    iterator = list.iterator();

    // Iterator 를 사용하여 요소를 다시 순회
    while (iterator.hasNext()) {
      String element = iterator.next();
      System.out.println(element);
    }
    // apple
    // banana
    // cherry
  }
}
