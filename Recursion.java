import java.util.LinkedHashSet;

class Recursion {

  // titling problem in recursion

  public static int tilingProblem(int n) {

    // base case
    if (n == 0 || n == 1) {
      return 1;
    }
    // horiznatal choice
    int fnm1 = tilingProblem(n - 1);
    // vertical choice
    int fnm2 = tilingProblem(n - 2);

    int totalways = fnm1 + fnm2;
    return totalways;
  }

  // remove duplicate value from string using recursion
  public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
    if (idx == str.length()) {
      System.out.println(newStr);
      return;
    }

    // work
    char currChar = str.charAt(idx);
    if (map[currChar - 'a'] == true) {
      // it means duplocate
      removeDuplicate(str, idx + 1, newStr, map);
    } else {
      map[currChar - 'a'] = true;
      removeDuplicate(str, idx + 1, newStr.append(currChar), map);
    }
  }

  // removing duplicate values from string using linkedhashset why i used
  // linkedhashset as linkedhashset retirns values in order also dont store
  // duplicate values so betterapproach for removing dupliacte value
  public static void removeDuplicateValue(String str) {

    LinkedHashSet<Character> hs = new LinkedHashSet<>();
    for (int i = 0; i < str.length(); i++) {
      hs.add(str.charAt(i));
    }
    StringBuilder newStr = new StringBuilder();
    for (char s : hs) {
      newStr.append(s);
    }

    System.out.println(newStr);
  }

  public static void main(String args[]) {
    String str = "apnacollegeee!@!#!#";
    // removeDuplicateTiles(str, 0, new StringBuilder(""), new boolean[26]);
    removeDuplicateValue(str);
  }

}