
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

  public static void removeDuplicateTiles(String str, int idx, StringBuilder newStr, boolean map[]) {
    if (idx == str.length()) {
      System.out.println(newStr);
      return;
    }

    // work
    char currChar = str.charAt(idx);
    if (map[currChar - 'a'] == true) {
      // it means duplocate
      removeDuplicateTiles(str, idx + 1, newStr, map);
    } else {
      map[currChar - 'a'] = true;
      removeDuplicateTiles(str, idx + 1, newStr.append(currChar), map);
    }
  }

  public static void main(String args[]) {
    String str = "apnacollegeee";
    removeDuplicateTiles(str, 0, new StringBuilder(""), new boolean[26]);
  }

}