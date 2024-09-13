package basic.chap_02;

public class _05_MethodOverriding {

  public static void main(String[] args) {
    Parent parent = new Parent();
    parent.intro(); // 부모 클래스의 메서드 호출

    Child child = new Child();
    child.intro(); // 자식 클래스의 메서드 호출

    // 업캐스팅
    Parent childToParent = new Child();
    childToParent.intro(); // 자식 클래스의 메서드 호출
    
    // 컴파일 오류
    // childToParent.sayHello();
  }
}

class Parent {

  public void intro() {
    System.out.println("부모 클래스의 메서드 호출");
  }
}

class Child extends Parent {

  @Override
  public void intro() {
    System.out.println("자식 클래스의 메서드 호출");
  }

  public void sayHello() {
    System.out.println("안녕하세요!");
  }
}
