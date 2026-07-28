import java.util.*;

public class Practice {

  public static boolean validAnagram(String s, String t) {

    HashMap<Character, Integer> map = new HashMap<>();

    if (s.length() != t.length()) {
      return false;
    }
    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }
    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      if (!map.containsKey(t.charAt(i))) {
        return false;
      }

      if (map.get(ch) == 1) {
        map.remove(ch);
      } else {
        map.put(ch, map.get(ch) - 1);
      }

    }

    return map.isEmpty();
  }

  public static String reverseWords(String str) {
    String reverse = new StringBuilder(str).reverse().toString();
    String newStr = "";

    for (int i = 0; i < reverse.length(); i++) {
      // skip spaces

      while (i < reverse.length() && reverse.charAt(i) == ' ') {
        i++;
      }
      String word = "";
      while (i < reverse.length() && reverse.charAt(i) != ' ') {
        word += reverse.charAt(i);
        i++;
      }
      String output = new StringBuilder(word).reverse().toString();
      if (output.length() > 0) {
        newStr += " " + output;
      }
    }
    return newStr.trim();
  }

  public static int countDistinct(int nums[]) {

    HashSet<Integer> set = new HashSet<>();
    int i = 0;
    for (int num : nums) {
      if (!set.contains(num)) {
        set.add(num);
        i++;
      }
    }

    return i;
  }

  public static void unionandIntersection(int num1[], int num2[]) {
    // union
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < num1.length; i++) {
      set.add(num1[i]);
    }
    int count = 0;

    for (int i = 0; i < num2.length; i++) {
      if (set.contains(num2[i])) {
        count++;
        set.remove(num2[i]);
      }
    }
    System.out.println(count);
  }

  public static String tickets(HashMap<String, String> from) {

    HashMap<String, String> to = new HashMap<>();

    for (String keys : from.keySet()) {
      to.put(from.get(keys), keys);
    }
    for (String key : from.keySet()) {
      if (!to.containsKey(key))
        return key;
    }

    return "";
  }

  public static void main(String[] args) {
    // String s = "bulb";
    // String t = "tulb";
    // System.out.println(validAnagram(s, t));

    // String str = " the pen ";
    // System.out.print(reverseWords(str));

    // HashSet => unique ,unordred,null values allowed

    // int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
    // System.out.println(countDistinct(nums));

    // int num1[] = { 7, 3, 9 };
    // int num2[] = { 6, 3, 9, 2, 9, 4 };
    // unionandIntersection(num1, num2);

    // find itenary from tickets
    HashMap<String, String> from = new HashMap<>();
    from.put("Chennai", "Bengaluru");
    from.put("Mumbai", "Delhi");
    from.put("Goa", "Chennai");
    from.put("Delhi", "Goa");
    String start = tickets(from);
    System.out.print(start);
    for (String key : from.keySet()) {
      System.out.print("=>" + from.get(start));
      start = from.get(start);
    }
  }
}
