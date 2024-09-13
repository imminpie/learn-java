package basic.chap_01;

public class _05_Continue {

  public static void main(String[] args) {
    // 1. continue 와 for 문
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue; // 짝수일 때 바로 다음 반복으로 넘어감
      }
      System.out.println(i); // 1 3 5 7 9
    }

    // 2. continue 와 while 문
    int i = 0;

    while (i < 5) {
      i++;
      if (i == 3) {
        continue; // i가 3일 때 바로 다음 반복으로 넘어감
      }
      System.out.println(i); // 1 2 4 5
    }

    // 3. continue 와 do-while 문
    i = 0;

    do {
      i++;
      if (i == 3) {
        continue; // i가 3일 때 바로 다음 반복으로 넘어감
      }
      System.out.println(i);
    } while (i < 5); // 1 2 4 5
  }
}
