
import java.util.Scanner;
// public class Test {
//   public static void main(String args[]) {
//     int x = 2, y = 5;
//     int exp1 = (x * y / x);
//     int exp2 = (x * (y / x));

//     System.out.println(exp1);
//     System.out.println(exp2);
//   }
// }

public class Test {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any no :");
    int num = sc.nextInt();
    // int i = 0;
    // int sum = 0;
    // while (i <= num) {
    // sum += i;
    // i++;
    // }
    // System.out.println("sum of n natural no :" + sum);

    int sum = ((num * (num + 1)) / 2);
    System.out.println(sum);

  }
}
