package basic.chap_03;

public class _08_InterfaceMethods {

  public static void main(String[] args) {
    MyClass my = new MyClass();
    my.myAbstractMethod(); // 추상 메소드가 호출되었습니다.
    my.myDefaultMethod(); // Default 메소드가 호출되었습니다.

    MyInterface.myStaticMethod(); // Static 메소드가 호출되었습니다.
  }
}

interface MyInterface {
  // 추상 메소드
  void myAbstractMethod();

  default void myDefaultMethod() {
    System.out.println("Default 메소드가 호출되었습니다.");
  }

  static void myStaticMethod() {
    System.out.println("Static 메소드가 호출되었습니다.");
  }
}

class MyClass implements MyInterface {

  @Override
  public void myAbstractMethod() {
    System.out.println("추상 메소드가 호출되었습니다.");
  }
}
