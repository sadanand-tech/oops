
public class StudentClass {
  public static class Student {
    String name;
    int rno;
    double percent;

  }

  public static class Car {
    String name;
    String type;
    int price;
  }

  public static void main(String[] args) {

    Car c1 = new Car();
    c1.name = "alto";
    c1.price = 450000;
    c1.type = "hatchback";

    Student x = new Student(); // declaration
    x.name = "sadanand";
    x.rno = 75;
    x.percent = 92.5;

    Student s = new Student();
    s.name = "sada";
    s.rno = 95;
    s.percent = 87.5;

    System.out.println(x.rno);
  }
}
