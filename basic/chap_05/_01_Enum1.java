package basic.chap_05;

class Today {

  private Day day;

  public Day getDay() {
    return day;
  }

  public void setDay(Day day) {
    this.day = day;
  }
}

enum Day {
  SUNDAY,
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  FRIDAY,
  SATURDAY,
}

public class _01_Enum1 {

  public static void main(String[] args) {
    Day day = Day.SATURDAY;

    switch (day) {
      case SUNDAY:
        System.out.println("일요일입니다.");
        break;
      case MONDAY:
        System.out.println("월요일입니다.");
        break;
      default:
        System.out.println("그 밖의 요일");
    }

    // 열거형 상수 출력
    for (Day days : Day.values()) {
      System.out.println(days.name()); // SATURDAY
    }

    // 열거형 상수 인덱스 출력
    for (Day days : Day.values()) {
      System.out.println(days.ordinal() + " : " + days.name());
      // 0 : SUNDAY
      // 1 : MONDAY
      // 2 : TUESDAY
      // 3 : WEDNESDAY
      // 4 : FRIDAY
      // 5 : SATURDAY
    }
  }
}
