package basic.chap_04;

public class _02_Generic {

  public static void main(String[] args) {
    Box<String> stringBox = new Box<>("Hello");
    Box<Integer> intBox = new Box<>(10);

    System.out.println(stringBox.getItem()); // Hello
    System.out.println(intBox.getItem()); // 10
  }
}

class Box<T> {

  private T item;

  public Box(T item) {
    this.item = item;
  }

  public T getItem() {
    return this.item;
  }
}
