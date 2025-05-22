
// import java.util.Scanner;
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

  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static int binomialCoeff(int n, int r) {
    int nFact = factorial(n);
    int rFact = factorial(r);
    int nmrFact = factorial(n - r);

    int Bcoeff = nFact / (rFact * nmrFact);
    return Bcoeff;
  }

  // function overloading : in which function can have same name but contains diff
  // data type or no of params;
  public static int multiply(int a, int b) {
    return a * b;
  }

  public static double multiply(double a, double b) {
    return a * b;
  }

  public static int multiply(int x, int y, int z) {
    return x * y * z;
  }

  // public static boolean isPrime(int num) {
  // boolean isPrime = true;
  // if (num == 2) {
  // return true;
  // }
  // for (int i = 2; i <= num - 1; i++) {

  // if (num % i == 0) {
  // isPrime = false;
  // return isPrime;
  // }
  // }
  // return isPrime;
  // }
  // //optimized approach for prime no

  public static boolean isPrime(int num) {
    if (num == 2) {
      return true;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void PrimeRange(int num1, int num2) {
    for (int i = num1; i <= num2; i++) {
      if (isPrime(i) == true) {
        System.out.println(i);
      }
    }

  }

  public static void BinaryToDecimal(int num) {
    int dec = 0;
    int i = 0;

    while (num > 0) {
      int rem = num % 10;
      dec = dec + rem * (int) (Math.pow(2, i));
      num = num / 10;
      i++;
    }
    System.out.println("Decimal: " + dec);
  }

  public static void decToBin(int num) {
    int binNum = 0;
    int pow = 0;
    int originalnum = num;
    while (num > 0) {
      int rem = num % 2;
      binNum = binNum + rem * (int) (Math.pow(10, pow));
      num = num / 2;
      pow++;
    }
    System.out.println("binary of " + originalnum + "=  " + binNum);
  }

  public static void main(String args[]) {
    System.out.println(binomialCoeff(10, 03));
    System.out.println(multiply(5, 10));
    System.out.println(multiply(2.54, 3.42));
    System.out.println(multiply(3, 5, 6));
    System.out.println("prime no in the given range are");
    PrimeRange(20, 40);
    BinaryToDecimal(1111011101);
    decToBin(123);
  }
}
