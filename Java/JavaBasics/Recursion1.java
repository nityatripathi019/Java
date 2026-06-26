// import java.util.*;
public class Recursion1 {

  public static boolean isSorted(int arr[], int i) {
    if (i == arr.length - 1) {
      return true;
    }
    if (arr[i] > arr[i + 1]) {

      return false;
    }
    return isSorted(arr, i + 1);
  }

  public static int power(int x, int n) {
    if (n == 1) {
      return x;
    }
    return x * power(x, n - 1);

  }

  public static void main(String args[]) {
    // check array is sorted using recursion
    System.out.println(power(2, 10));

  }
}
