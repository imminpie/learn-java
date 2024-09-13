package basic.chap_01;

import java.util.Scanner;

public class _03_Loops {

  public static void main(String[] args) {
    // 1. for
    for (int i = 1; i <= 3; i++) {
      System.out.println(i); // 1 2 3
    }

    // 2. forEach
    int[] numbers = { 1, 2, 3 };
    for (int num : numbers) {
      System.out.println(num); // 1 2 3
    }

    // 3. while
    Scanner scanner = new Scanner(System.in);
    String input = "";

    while (!input.equals("end")) { // end 를 입력할 때까지 반복
      System.out.print("종료하려면 'end'를 입력하세요.");
      input = scanner.nextLine();
      System.out.println("입력한 내용: " + input);
    }

    System.out.println("프로그램 종료");
    scanner.close();

    // 4. do-while
    int count = 0;

    do {
      System.out.println(count); // 0 1 2 3
      count++;
    } while (count <= 3);
  }
}
