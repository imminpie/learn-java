package basic.chap_01;

public class _04_Break {

  public static void main(String[] args) {
    // 1. break 와 for 문
    for (int i = 0; i < 10; i++) {
      if (i == 3) {
        break; // i가 3일 때 반복문을 즉시 종료
      }
      System.out.println(i); // 0 1 2
    }

    // 2. break 와 while 문
    int i = 0;

    while (i < 10) {
      if (i == 3) break;
      System.out.println(i); // 0 1 2
      i++;
    }

    // 3. break 와 do-while 문
    int x = 0;

    do {
      if (x == 3) break;
      System.out.println(x); // 0 1 2
      x++;
    } while (x < 10);

    // 4. break 와 switch 문
    int num = 2;
    switch (num) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two"); // 출력
        break;
      default:
        System.out.println("Default");
    }
  }
}
