//oops concept

class Pen {
  String name;
  String type;

  public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.type);
  }
}

class Student {
  String name;
  int age;

  // compile time polymorphism
  public void printInfo(String name) {
    System.out.println(this.name);
  }

  public void printInfo(int age) {
    System.out.println(this.age);
  }

  public void printInfo(String name, int age) {
    System.out.println(this.age + " " + this.name);
  }
}

// inheitence
class Shape {
  String color;
}

class Triangle extends Shape {

  public void print(String color) {
    System.out.println(this.color);
  }
}

public class OOPS {
  public static void main(String args[]) {
    // object creation
    // Pen p1 = new Pen();
    // p1.name = "DOMS";
    // p1.type = "gel";
    // p1.printInfo();

    // Student s1 = new Student();
    // s1.name = "pranav";
    // s1.age = 23;
    // s1.printInfo(s1.name);
    // s1.printInfo(s1.age);

    Triangle t1 = new Triangle();
    t1.color = "grey";
    t1.print(t1.color);

  }
}