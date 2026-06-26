
// import java.util.*;

public class Strings {

  // String is palindrome or not
  public static boolean isPalindromeString(String str) {
    int n = str.length();
    for (int i = 0; i < n / 2; i++) {
      if (str.charAt(i) == str.charAt(n - i - 1)) {
        return true;
      }
    }
    return false;

  }

  public static float shortestPath(String str) {
    int x = 0, y = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'N') {
        y = y + 1;
      } else if (str.charAt(i) == 'S') {
        y = y - 1;
      } else if (str.charAt(i) == 'W') {
        x = x - 1;
      } else {
        x = x + 1;
      }
    }
    int X2 = x * x;
    int Y2 = y * y;

    return (float) Math.sqrt(Y2 + X2);
  }

  public static String subString(String str, int si, int ei) {
    String substr = "";
    for (int i = 0; i < ei; i++) {
      substr += str.charAt(i);

    }
    return substr;
  }

  public static int countLVowel(String str) {

    if (str == null)
      return 0;

    int count = 0;
    str = str.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' ||
          ch == 'o' || ch == 'u') {
        count++;
      }
    }
    return count;
  }

  public static void main(String args[]) {
    System.out.println(countLVowel("HellojEEeeee"));

  }
}
