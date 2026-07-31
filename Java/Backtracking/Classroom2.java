package Backtracking;

public class Classroom2 {

  public static void findPermutation(String str, String ans) {
    // base case
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }

    // recursive call
    for (int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);
      String newStr = str.substring(0, i) + str.substring(i + 1);
      findPermutation(newStr, ans + curr);
    }

  }

  public static void findSubsets(String str, String ans, int idx) {
    // base class
    if (idx == str.length()) {
      if (ans.length() == 0) {
        System.out.println("null");
      }
      System.out.println(ans);
      return;
    }
    // recursive calls
    // yes choice
    findSubsets(str, ans + str.charAt(idx), idx + 1);
    // no choice
    findSubsets(str, ans, idx + 1);
  }

  public static void main(String[] args) {
    String str = "abc";
    // findPermutation(str, "");
    findSubsets(str, "", 0);

  }

}