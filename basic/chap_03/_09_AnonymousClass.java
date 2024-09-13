package basic.chap_03;

public class _09_AnonymousClass {

  public static void main(String[] args) {
    Bus bus = new Bus() {
      @Override
      public void move() {
        System.out.println("버스가 출발합니다.");
      }
    };
    bus.move(); // 버스가 출발합니다.
  }
}

// 추상 클래스
abstract class Bus {

  public abstract void move();
}
