// import java.util.*;

public class Strings {
  public static boolean checkPalindrome(String str) {
    int n = str.length();
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(n - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  // uppercase program
  public static String toUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for (int i = 1; i <= str.length() - 1; i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }
    }

    return sb.toString();
  }

  public static void main(String args[]) {
    // String str = "pqr";
    // System.out.println(checkPalindrome(str));

    String str1 = "hi , my name is diya tripathi";
    System.out.println(toUpperCase(str1));
  }
}
