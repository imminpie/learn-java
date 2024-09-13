package basic.chap_03;

public class _02_This {

  public static void main(String[] args) {
    Animal dog = new Animal();
    dog.introduce("댕댕이");
  }
}

class Animal {

  String name = "바둑이";

  public void introduce(String name) {
    System.out.println(this.name); // 바둑이
    System.out.println(name); // 댕댕이

    this.name = name;
    System.out.println(this.name.equals(name)); // true
  }
}
