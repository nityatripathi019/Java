// import java.util.*;
//Binary Search

public class ArraysCC {

  public static int BinarySearch(int arr[], int key) {
    int n = arr.length;
    int start = 0, end = n - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (arr[mid] == key) {
        return mid;
      }
      if (arr[mid] < key) {
        // we will check in second half
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }
    return -1;
  }

  // printarray
  public static void printarray(int numbers[]) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }

  // reverse an array
  public static void reverseArray(int numbers[]) {
    int start = 0, end = numbers.length - 1;
    while (start < end) {
      int temp = numbers[start];
      numbers[start] = numbers[end];
      numbers[end] = temp;
      start++;
      end--;
    }
    printarray(numbers);
  }

  // arraypairing
  public static void arrayPairs(int numbers[]) {
    int tp = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
        tp++;
      }
      System.out.println();
    }
    System.out.println("total pairs : " + tp);
  }

  public static void printSubArrays(int numbers[]) {
    int ts = 0;
    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        for (int k = start; k <= end; k++) {
          System.out.print(numbers[k] + " ");

        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total subarrays: " + ts);
  }

  public static void main(String args[]) {
    int numbers[] = { 1, 3, 5, 7, 8, 19, 10 };
    // int result = BinarySearch(numbers, 3);
    // System.out.println("element found at index : " + (result + 1));
    // System.out.println("array after revrse");
    // reverseArray(numbers);
    // System.out.println("array pairing");
    // arrayPairs(numbers);

    System.out.println("print subarrays");
    printSubArrays(numbers);
  }
}
