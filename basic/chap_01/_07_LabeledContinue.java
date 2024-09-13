package basic.chap_01;

public class _07_LabeledContinue {

  public static void main(String[] args) {
    // outer 라벨 선언
    outer:for (int i = 0; i < 3; i++) {
      System.out.println("i = " + i);

      for (int j = 0; j < 3; j++) {
        if (j == 1) {
          System.out.println("continue outer 실행!");
          continue outer; // outer 라벨이 붙은 반복문의 다음 반복 실행
        }
        System.out.println("j = " + j);
      }
    }
  }
}
// i = 0
// j = 0
// continue outer 실행!
// i = 1
// j = 0
// continue outer 실행!
// i = 2
// j = 0
// continue outer 실행!