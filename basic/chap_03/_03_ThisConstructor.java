package basic.chap_03;

public class _03_ThisConstructor {

  public static void main(String[] args) {
    Person person1 = new Person();
    System.out.println(person1); // Person[name=미지정, age=0]

    Person person2 = new Person("홍길동");
    System.out.println(person2); // Person[name=홍길동, age=0]

    Person person3 = new Person("홍길동", 18);
    System.out.println(person3); // Person[name=홍길동, age=18]
  }
}

class Person {

  private String name;
  private int age;

  public Person() {
    this("미지정", 0);
  }

  public Person(String name) {
    this(name, 0);
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person[name=" + name + ", age=" + age + "]";
  }
}
