public class StudentClass1 {

  public static class Student {
    String name;
    int rno;
    double percent;
  }

  public static void fun(Student x) {
    System.out.println(x.name);
    return;
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Sadanad";
    s1.rno = 25;
    s1.percent = 89.5;

    fun(s1);
  }

}
