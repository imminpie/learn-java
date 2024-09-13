package basic.chap_05;

public class _02_Enum2 {

  public static void main(String[] args) {
    Gender gender = Gender.MALE;

    System.out.println(gender);
    // Gender{chromosome='XY'}
    gender.print();
    // 염색체 정보 : XY
  }
}

enum Gender {
  MALE("XY"),
  FEMALE("XX");

  private String chromosome; // 염색체

  private Gender(String chromosome) {
    this.chromosome = chromosome;
  }

  public String getChromosome() {
    return chromosome;
  }

  // toString() 메소드를 오버라이딩해서 enum 타입을 출력할 수 있다.
  @Override
  public String toString() {
    return "Gender{" + "chromosome='" + chromosome + "'}";
  }

  public void print() {
    System.out.println("염색체 정보 : " + chromosome);
  }
}
