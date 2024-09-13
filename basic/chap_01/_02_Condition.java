package basic.chap_01;

public class _02_Condition {

  public static void main(String[] args) {
    // 1. if 문
    int a = 5;

    if (a > 10) {
      System.out.println("a는 10보다 큽니다.");
    } else if (a == 5) {
      System.out.println("a는 5입니다."); // 출력
    } else {
      System.out.println("a는 5보다 작습니다.");
    }

    // 2. switch 문
    int day = 2;

    switch (day) {
      case 1:
        System.out.println("월요일");
        break;
      case 2:
        System.out.println("화요일"); // 출력
        break;
      case 3:
        System.out.println("수요일");
        break;
      default:
        System.out.println("해당하는 요일이 없습니다.");
        break;
    }

    // 3. 삼항 연산자
    int x = 10;
    String result = (x > 0) ? "양수" : "음수";

    System.out.println(result); // 양수
  }
}
