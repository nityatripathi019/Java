// import java.util.*;

public class ArraysCC {

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int trapRainWater(int[] height) {
    int n = height.length;
    // calculate auxilary left max bounday
    int leftmax[] = new int[height.length];
    leftmax[0] = height[0];
    for (int i = 1; i < height.length; i++) {
      leftmax[i] = Math.max(height[i], leftmax[i - 1]);
    }

    // calculate auxilary right max bounday
    int rightmax[] = new int[height.length];
    rightmax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightmax[i] = Math.max(rightmax[i + 1], height[i]);
    }

    int trapWater = 0;
    for (int i = 0; i < n; i++) {
      int ht = Math.min(leftmax[i], rightmax[i]);
      int water = ht - height[i];
      trapWater += water;
    }
    return trapWater;
  }

  public static void main(String args[]) {
    int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(trapRainWater(height));
    ;
  }
}
