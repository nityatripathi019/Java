class Person {
  String name;
  int weight;
}

class Student extends Person {
  String schoolName;
  int rollNumber;
}

class Vehicle {
  void print() {
    System.out.println("Base class vehicle");
  }
}

class Car extends Vehicle {
  void print1() {
    System.out.println("derived class vehicle");
  }
}

class Book {
  int price;
  static int count;

  public Book(int price) {
    this.price = price;
    count++;
  }
}

public class Practice {
  public static void main(String args[]) {
    // Student s = new Student();
    // s.name = "aman";
    // s.weight = 35;
    // s.schoolName = "SSMV";
    // s.rollNumber = 27;
    // System.err.println(s.name);
    // System.out.println(s.rollNumber);
    // System.out.println(s.weight);
    // System.out.println(s.schoolName);
    // Vehicle obj = new Car();
    // obj.print();

    // Vehicle obj1 = new Vehicle();
    // obj1.print();
    System.out.println(Book.count);
    Book b1 = new Book(150);
    System.out.println(b1.price);
    Book b2 = new Book(250);
    System.out.println(b2.price);
    System.out.println(Book.count);// static variable can be access directly through class
  }
}
