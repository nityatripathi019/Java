package Backtracking;

public class Classroom {

  public static void printArray(int arr[]) {
    for (int el : arr) {
      System.out.print(el + " ");
    }
    System.out.println();
  }

  public static void changeArray(int arr[], int idx, int val) {
    // base case
    if (idx == arr.length) {
      printArray(arr);
      return;
    }

    // recursion(kaam)
    arr[idx] = val;
    changeArray(arr, idx + 1, val + 1);

    // backtracking
    arr[idx] = arr[idx] - 2;
  }

  public static void findSubsets(String str, String ans, int i) {
    // base case
    if (i == str.length()) {
      if (ans.length() == 0) {
        System.out.println("null");
      }
      System.out.println(ans);
      return;
    }
    // recursion
    // yes choice
    findSubsets(str, ans + str.charAt(i), i + 1);
    // no choice
    findSubsets(str, ans, i + 1);
  }

  public static void main(String[] args) {
    // int arr[] = new int[5];
    // changeArray(arr, 0, 1);
    // printArray(arr);

    // find subsets
    String str = "abc";
    findSubsets(str, "", 0);
  }

}