package basic.chap_04;

public class _01_Array {

  public static void main(String[] args) {
    String[] str = new String[5];
    int[] numbers = { 1, 2, 3, 4, 5 };

    numbers[2] = 100;

    // for
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    // forEach
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
