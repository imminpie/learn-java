package basic.chap_02;

public class _06_GetterAndSetter {

  public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book();

    b1.setTitle("즐거운 자바");
    b1.setPrice(20000);

    b2.setTitle("즐거운 자바스크립트");
    b2.setPrice(30000);

    System.out.println(b1.getTitle() + ": " + b1.getPrice() + "원"); // 즐거운 자바: 20000원
    System.out.println(b2.getTitle() + ": " + b2.getPrice() + "원"); // 즐거운 자바스크립트: 30000원
  }
}

class Book {

  private String title;
  private int price;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
