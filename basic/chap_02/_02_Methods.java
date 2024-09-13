package basic.chap_02;

public class _02_Methods {

  public static void main(String[] args) {
    // 인스턴스 메서드 호출
    MethodsExample method = new MethodsExample();
    method.printValue(100);

    // 클래스 메서드 호출
    MethodsExample.printMessage();
  }
}

class MethodsExample {

  // 인스턴스 메서드 선언
  public void printValue(int value) {
    System.out.println(value);
  }

  // 클래스 메서드 선언
  public static void printMessage() {
    System.out.println("클래스 메서드 호출");
  }
}