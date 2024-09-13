package basic.chap_04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class _05_Map {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();

    map.put(1, "A");
    map.put(2, "B");
    map.put(3, "C");

    // 키와 값 쌍의 수를 반환
    System.out.println(map.size()); // 3

    // 지정된 키에 해당하는 값을 반환
    System.out.println(map.get(2)); // B

    // 지정된 키가 존재하는지 여부를 확인
    System.out.println(map.containsKey(2)); // true

    // 지정된 값이 존재하는지 여부를 확인
    System.out.println(map.containsValue("B")); // true

    // 모든 키를 출력
    for (Integer key : map.keySet()) {
      System.out.println(key); // 1 2 3
    }

    // 모든 값을 출력
    for (String value : map.values()) {
      System.out.println(value); // A B C
    }

    // 모든 값을 컬렉션으로 반환
    Collection<String> values = map.values(); // [A, B, C]

    for (String str : values) {
      System.out.println(str); // A B C
    }

    // 키에 해당하는 값을 삭제
    map.remove(2);
    System.out.println(map.containsKey(2)); // false

    // 맵의 모든 요소를 삭제
    map.clear();

    // 맵이 비어있는지 여부를 확인
    System.out.println(map.isEmpty()); // true
  }
}
