package basic.chap_03;

public class _01_Constructor {

  public static void main(String[] args) {
    Car c1 = new Car(); // 0 기본 생성자가 호출됩니다.
    Car c2 = new Car("현대"); // 1 매개변수 생성자가 호출됩니다.
    Car c3 = new Car("현대", 3000); // 2 매개변수 생성자가 호출됩니다.
  }
}

class Car {

  String name;
  int price;

  // 기본 생성자
  public Car() {
    System.out.println("0 기본 생성자가 호출됩니다.");
  }

  // 이름만 받는 생성자
  public Car(String name) {
    this.name = name;
    System.out.println("1 매개변수 생성자가 호출됩니다.");
  }

  // 이름과 가격을 받는 생성자
  public Car(String name, int price) {
    this.name = name;
    this.price = price;
    System.out.println("2 매개변수 생성자가 호출됩니다.");
  }
}
