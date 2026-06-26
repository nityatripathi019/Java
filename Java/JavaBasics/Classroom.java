import java.util.HashMap;

import java.util.Set;

public class Classroom {

  public static void main(String args[]) {
    // create
    // HashMap<String, Integer> hm = new HashMap<>();
    // // insertng data timecomplexity O(1)
    // hm.put("India", 150);
    // hm.put("China", 100);
    // hm.put("Australia", 50);

    // System.out.println(hm);

    // get O(1)
    // int population = hm.get("India");
    // System.out.println(population);
    // if we pass any keythat does not exist than hashmap returns null value in
    // output
    // System.out.println(hm.get("Bhutan"));// null

    // containsKey - O(1) it will return true or false
    // System.out.println(hm.containsKey("Indonesia"));// false
    // System.out.println(hm.containsKey("India"));// true

    // Remove O(1)
    // System.out.println(hm.remove("China"));// it will delete the node named china
    // and returns its value 100 and if key
    // doesnot exist than it returns null
    // System.out.println(hm);

    // Size
    // System.out.println(hm.size());
    // Is Empty
    // System.out.println(hm.isEmpty());
    // clear it will clear whole hashmap
    // hm.clear();
    // System.out.println(hm.isEmpty());

    // Iteration on Hashmap O(1)
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);
    hm.put("Indonesia", 10);
    hm.put("Nepal", 5);
    System.out.println(hm);
    // keySet()
    Set<String> keys = hm.keySet();
    System.out.println(keys);// [india,china,us..]

    for (String k : keys) {
      System.out.println(k + " " + hm.get(k));
    }
    // we can also find max and min
    int max = Integer.MIN_VALUE;
    for (String k : keys) {
      if (max < hm.get(k)) {
        max = hm.get(k);
      }

    }
    System.out.println("maximum value:" + max);
  }
}
