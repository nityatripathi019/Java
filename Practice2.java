import java.util.HashMap;

public class Practice2 {
  public static int largestSubaaraySum(int arr[]) {
    HashMap<Integer, Integer> map = new HashMap<>();

    int sum = 0, len = 0;

    for (int j = 0; j < arr.length; j++) {
      sum += arr[j];
      if (map.containsKey(sum)) {
        len = Math.max(len, j - map.get(sum));

      } else {
        map.put(sum, j);
      }
    }
    return len;
  }

  public static void main(String[] args) {
    int arr[] = { 15, -2, 2 };
    int output = largestSubaaraySum(arr);
    System.out.println("largest subarray sumequals to 0 :" + output);
  }
}
