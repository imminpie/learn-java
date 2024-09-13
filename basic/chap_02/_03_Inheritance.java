package basic.chap_02;

public class _03_Inheritance {

  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.sound(); // 동물이 소리를 낸다.
  }
}

class Animal {

  public void sound() {
    System.out.println("동물이 소리를 낸다.");
  }
}

class Dog extends Animal {}