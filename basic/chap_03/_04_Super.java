package basic.chap_03;

public class _04_Super {

  public static void main(String[] args) {
    Child child = new Child();
    child.introduce();
  }
}

class Parent {

  String name = "부모님";

  void introduce() {
    System.out.println("안녕하세요, 저는 " + name + "입니다.");
  }
}

class Child extends Parent {

  String name = "자식";

  void introduce() {
    System.out.println("안녕하세요, 저는 " + this.name + "입니다.");

    // 부모 클래스의 필드 출력
    System.out.println("저는 " + super.name + "의 자식입니다.");

    // 부모 클래스의 메서드 호출
    super.introduce();
  }
}
