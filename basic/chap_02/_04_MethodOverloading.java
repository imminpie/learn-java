package basic.chap_02;

public class _04_MethodOverloading {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    System.out.println(calculator.add(10, 20));
    System.out.println(calculator.add(10.5, 20.3));
    System.out.println(calculator.add(10, 20, 30));
  }
}

class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public double add(double a, double b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }
}
