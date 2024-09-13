package basic.chap_01;

public class _06_LabeledBreak {

  public static void main(String[] args) {
    // outer 라벨 선언
    outer:for (int i = 0; i < 3; i++) {
      System.out.println("i = " + i);

      for (int j = 0; j < 3; j++) {
        System.out.println("j = " + j);
        if (j == 1) {
          System.out.println("break outer 실행!");
          break outer; // outer 라벨이 붙은 반복문을 종료
        }
      }
    }
    System.out.println("반복문 종료");
  }
}
// i = 0
// j = 0
// j = 1
// break outer 실행!
// 반복문 종료
