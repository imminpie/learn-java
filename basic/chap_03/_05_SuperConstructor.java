package basic.chap_03;

public class _05_SuperConstructor {

  public static void main(String[] args) {
    Child child1 = new Child();
    child1.greet();
    // 안녕하세요, 저는 길동입니다.
    // 저는 부모님을 따라왔습니다.

    Child child2 = new Child("철수");
    child2.greet();
    // 안녕하세요, 저는 철수입니다.
    // 저는 부모님을 따라왔습니다.
  }
}

class Parent {

  String name;

  public Parent() {
    this.name = "길동";
  }

  public Parent(String name) {
    this.name = name;
  }

  public void introduce() {
    System.out.println("안녕하세요, 저는 " + this.name + "입니다.");
  }
}

class Child extends Parent {

  public Child() {
    super();
  }

  public Child(String name) {
    // 부모 클래스의 생성자를 호출
    super(name);
  }

  public void greet() {
    // 부모 클래스의 메서드를 호출
    super.introduce();
    System.out.println("저는 부모님을 따라왔습니다.");
  }
}
