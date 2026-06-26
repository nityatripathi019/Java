
import java.util.Scanner;

public class JavaBasics {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter annual salary");
    int salary = sc.nextInt();
    int tax;
    if (salary < 500000) {
      tax = 0;
      System.out.println("tax you pay on your salary");
      System.out.println(tax);
    } else if (salary >= 500000 && salary < 1000000) {
      tax = (int) (salary * 0.1);

      System.out.println("tax you pay on salary");
      System.out.println(tax);
      System.out.println("salary after tax deduction");
      salary = salary - tax;
      System.out.println(salary);
    } else {
      System.out.println("20% tax on salary");
      tax = (int) (salary * 0.2);
      System.out.println(tax);
      System.out.println("salary after tax deduction");
      salary = salary - tax;
      System.out.println(salary);
    }

    sc.close();
  }
}