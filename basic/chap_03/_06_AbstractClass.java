package basic.chap_03;

public class _06_AbstractClass {

  public static void main(String[] args) {
    Duck duck = new Duck();
    duck.fly(); // 날다!
    duck.sing(); // 꽥꽥!
  }
}

// 추상 클래스
abstract class Bird {

  // 추상 메소드
  public abstract void sing();

  // 일반 메서드도 포함할 수 있다.
  public void fly() {
    System.out.println("날다!");
  }
}

class Duck extends Bird {

  @Override
  public void sing() {
    System.out.println("꽥꽥!");
  }
}
