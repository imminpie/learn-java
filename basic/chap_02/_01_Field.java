package basic.chap_02;

public class _01_Field {

  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();

    // 인스턴스 변수 접근
    p1.name = "홍길동";
    p1.age = 18;

    p2.name = "홍길순";
    p2.age = 20;

    // 인스턴스 변수 출력
    System.out.println("이름: " + p1.name);
    System.out.println("나이: " + p1.age);

    System.out.println("이름: " + p2.name);
    System.out.println("나이: " + p2.age);

    // 클래스 변수 출력
    System.out.println(Person.count);
  }
}

class Person {

  // 인스턴스 변수
  String name;
  int age;

  // 클래스 변수
  static int count = 10;
}
