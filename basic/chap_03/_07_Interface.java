package basic.chap_03;

public class _07_Interface {

  public static void main(String[] args) {
    TV tv = new LedTV();
    tv.turnOn(); // 켜다
    tv.turnOff(); // 끄다
  }
}

interface TV {
  void turnOn();
  void turnOff();
}

class LedTV implements TV {

  @Override
  public void turnOn() {
    System.out.println("켜다");
  }

  @Override
  public void turnOff() {
    System.out.println("끄다");
  }
}
