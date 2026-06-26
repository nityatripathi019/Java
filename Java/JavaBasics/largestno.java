// import java.util.*;

public class largestno {
  public static void main(String args[]) {
    System.out.println("printing the largest no among 3 no");
    int a = 10;
    int b = 12;
    int c = 30;
    if (a > b && a > c) {
      System.out.println("a is largest no");
    } else if (b > a && b > c) {
      System.out.println("b is largest no");
    } else {
      System.out.println("c is largest no");
    }
  }
}
