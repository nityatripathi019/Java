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

  public static void maxsubarraysum(int numbers[]) {
    int max = Integer.MIN_VALUE; // -infinity
    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        int currSum = 0;
        for (int k = start; k <= end; k++) {
          currSum += numbers[k];
          System.out.println(currSum);
          if (max < currSum) {
            max = currSum;

          }
        }
      }
    }
    System.out.println("Max subarraysum : " + max);
  }

  public static void kadans(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      currSum += numbers[i];
      if (currSum < 0) {
        currSum = 0;
      }
      if (maxSum < currSum) {
        maxSum = currSum;
      }
    }
    System.out.println("maxsum : " + maxSum);
  }

  // TrapRainwater
  public static void trapRainwater(int height[]) {
    int n = height.length;

    // calculate left max boundary
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }
    // calculate right max boundary
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    // calculate waterlevel = min(leftmax.rightmax)
    int trappedwater = 0;
    for (int i = 0; i < n; i++) {
      int waterlevel = Math.min(leftMax[i], rightMax[i]);
      trappedwater += waterlevel - height[i];

    }
    System.out.println(trappedwater);
  }

  public static void main(String args[]) {
    // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    // kadans(numbers);
    int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    trapRainwater(height);

  }
}
