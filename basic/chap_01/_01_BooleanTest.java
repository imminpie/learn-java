package basic.chap_01;

public class _01_BooleanTest {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    // AND (&&)
    if (a < 15 && b > 15) {
      System.out.println("두 조건이 모두 참입니다."); // 출력
    } else {
      System.out.println("한 가지 또는 두 조건 모두 거짓입니다.");
    }

    // OR (||)
    if (a < 15 || b > 30) {
      System.out.println("적어도 하나의 조건이 참입니다."); // 출력
    } else {
      System.out.println("두 조건이 모두 거짓입니다.");
    }

    // NOT (!)
    boolean isJavaFun = true;
    if (!isJavaFun) {
      System.out.println("자바는 재미없습니다.");
    } else {
      System.out.println("자바는 재미있습니다."); // 출력
    }
  }
}
