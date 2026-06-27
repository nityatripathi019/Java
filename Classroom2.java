import java.util.HashMap;

public class Classroom2 {

  public static int[] twoSum(int arr[], int target) {
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int needed = target - arr[i];

      if (hm.containsKey(needed)) {
        return new int[] { hm.get(needed), i };
      }

      hm.put(arr[i], i);
    }
    return new int[] {};
  }

  public static String getStart(HashMap<String, String> tickets) {
    HashMap<String, String> to = new HashMap<>();
    for (String key : tickets.keySet()) {
      to.put(tickets.get(key), key);
    }

    for (String key : tickets.keySet()) {
      if (!to.containsKey(key)) {
        return key;
      }
    }
    return null;
  }

  public static void main(String args[]) {
    // ticket qusetion

    // HashMap<String, String> from = new HashMap<>();
    // from.put("Chennai", "Bengaluru");
    // from.put("Mumbai", "Delhi");
    // from.put("Goa", "Chennai");
    // from.put("Delhi", "Goa");

    // String start = getStart(from);
    // System.out.print(start);
    // for (String key : from.keySet()) {
    // System.out.print("->" + from.get(start));
    // start = from.get(start);
    // }

    // two sum problem
    int arr[] = { 2, 7, 11, 15 };
    twoSum(arr, 9);
  }
}
