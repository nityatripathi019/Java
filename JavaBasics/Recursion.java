public class Recursion {

  public static void printIncreasing(int n) {
    // base case
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }
    // faith
    printIncreasing(n - 1);
    // self work
    System.out.print(n + " ");
  }

  public static void printDecreasing(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }
    System.out.print(n + " ");
    printDecreasing(n - 1);
  }

  public static int fact(int n) {
    if (n == 0) {
      return 1;
    }
    return n * fact(n - 1);
  }

  public static int fib(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }

  public static void main(String args[]) {
    // increasing no program
    // printIncreasing(5);
    // reverse counting
    // printDecreasing(10);
    // factorial
    // System.out.println(fact(5));
    for (int i = 0; i <= 10; i++) {
      System.out.println(fib(i));
    }
  }
}
