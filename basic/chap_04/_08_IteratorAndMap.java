package basic.chap_04;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _08_IteratorAndMap {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("A", 1);
    map.put("B", 2);
    map.put("C", 3);

    // 1. Map 에 저장된 키-값 쌍을 Map.Entry<K, V> 로 반환 후 Iterator 생성
    Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

    // Iterator 를 사용하여 요소 순회
    while (iterator.hasNext()) {
      Map.Entry<String, Integer> entry = iterator.next();
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
    // A = 1
    // B = 2
    // C = 3

    // 2. Map 에 저장된 모든 키들을 Set 으로 반환 후 Iterator 생성
    Iterator<String> iteratorKeys = map.keySet().iterator();

    // Iterator 를 사용하여 요소 순회
    while (iteratorKeys.hasNext()) {
      String key = iteratorKeys.next();
      Integer value = map.get(key);
      System.out.println(key + " = " + value);
    }
    // A = 1
    // B = 2
    // C = 3

    // 3. Map 에 저장된 모든 값들을 컬렉션으로 반환 후 Iterator 생성
    Collection<Integer> values = map.values();
    Iterator<Integer> iteratorValues = values.iterator();

    // 새로운 배열 생성
    Integer[] valueArray = new Integer[map.size()];

    // 인덱스 초기화
    int index = 0;

    // Iterator 를 사용하여 요소 순회
    while (iteratorValues.hasNext()) {
      valueArray[index] = iteratorValues.next();
      index++;
    }

    System.out.println(Arrays.toString(valueArray)); // [1, 2, 3]
  }
}
