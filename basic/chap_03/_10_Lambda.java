package basic.chap_03;

public class _10_Lambda {

  public static void main(String[] args) {
    NoParams noParams;

    // 1줄 실행 코드
    noParams = () -> System.out.println("공부를 한다.");
    noParams.doSomething();

    // 2줄 실행 코드
    noParams =
      () -> {
        System.out.println("공부를 한다.");
        System.out.println("축구를 한다.");
      };
    noParams.doSomething();

    OneParamNoReturn oneParamNoReturn;

    // 1줄 실행 코드
    oneParamNoReturn = s -> System.out.println(s + "를 한다.");
    oneParamNoReturn.doSomething("공부");

    // 2줄 실행 코드
    oneParamNoReturn =
      s -> {
        String something = s;
        System.out.println(something + "을 한다.");
      };
    oneParamNoReturn.doSomething("식사");

    TwoParamNoReturn twoParamNoReturn;

    // 1줄 실행 코드
    twoParamNoReturn = (x, y) -> System.out.println(x + y);
    twoParamNoReturn.doSomething(2, 3);

    // 2줄 실행 코드
    twoParamNoReturn =
      (x, y) -> {
        int sum = x + y;
        System.out.println(sum);
      };
    twoParamNoReturn.doSomething(3, 5);

    TwoParamAndReturn twoParamAndReturn;

    // 1 줄 실행 코드
    twoParamAndReturn = (x, y) -> x + y;
    int sum = twoParamAndReturn.doSomething(2, 3);
    System.out.println(sum);

    // 2 줄 실행 코드
    twoParamAndReturn =
      (x, y) -> {
        int division = x / y;
        return division;
      };
    int result = twoParamAndReturn.doSomething(10, 5);
    System.out.println(result);
  }
}

@FunctionalInterface
interface NoParams {
  void doSomething();
}

@FunctionalInterface
interface OneParamNoReturn {
  void doSomething(String something);
}

@FunctionalInterface
interface TwoParamNoReturn {
  void doSomething(int x, int b);
}

@FunctionalInterface
interface TwoParamAndReturn {
  int doSomething(int a, int b);
}
