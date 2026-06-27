
import java.util.HashSet;
// import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Classroom {

  public static void removeDuplicateValue(String str) {
    LinkedHashSet<Character> hs = new LinkedHashSet<>();
    for (int i = 0; i < str.length(); i++) {
      hs.add(str.charAt(i));
    }
    StringBuilder newStr = new StringBuilder();
    for (char ch : hs) {
      newStr.append(ch);
    }

    System.out.println(newStr);
  }

  public static void countDistinctElement(int arr[]) {
    HashSet<Integer> hs = new HashSet<>();
    for (int nums : arr) {
      hs.add(nums);
    }
    System.out.println(hs.size());
  }

  public static void union(int arr1[], int arr2[]) {
    LinkedHashSet<Integer> hs = new LinkedHashSet<>();
    for (int nums : arr1) {
      hs.add(nums);
    }
    for (int nums : arr2) {
      hs.add(nums);
    }
    System.out.println(hs);
    System.out.println(hs.size());
  }

  public static void intersection(int arr1[], int arr2[]) {

    HashSet<Integer> hs = new HashSet<>();
    for (int nums : arr1) {
      hs.add(nums);
    }
    int count = 0;
    for (int nums : arr2) {
      if (hs.contains(nums) == true) {
        count++;
        hs.remove(nums);

      }
    }
    System.out.println(count);
  }

  public static void main(String args[]) {

    // hashset is used for storing unique values we can store null values to it
    HashSet<Integer> set = new HashSet<>();

    set.add(1);
    set.add(2);
    set.add(3);
    set.add(2);
    set.add(3);
    set.add(4);

    // System.out.println(set);
    // System.out.println(set.size());
    // System.out.println(set.contains(3));
    // iteration on hashset

    HashSet<String> cities = new HashSet<>();
    cities.add("delhi");
    cities.add("bombay");
    cities.add("gurugram");
    cities.add("pune");

    // System.out.println(cities);
    // Iterator it = cities.iterator();
    // while (it.hasNext()) {
    // System.out.println(it.next());
    // }

    // for (String city : cities) {
    // System.out.println(city);
    // }

    // linkedhashset used for storing ordered collection

    LinkedHashSet<String> lhs = new LinkedHashSet<>();
    lhs.add("Delhi");
    lhs.add("Mumbai");
    lhs.add("Bombay");
    lhs.add("Gurugram");
    // System.out.println(lhs);

    // removeDuplicateValue("apnaCollllllehgef@!@!@!");

    // treeset : sorted in asc order ,null values are not allowed treeset do not
    // allow null values bcz tresset do tree comaprsion and for comparsion purpose
    // it needed some value to be comoared

    TreeSet<String> ts = new TreeSet<>();
    ts.add("Delhi");
    ts.add("Mumbai");
    ts.add("Bombay");
    ts.add("Gurugram");
    // System.out.println(ts);

    // int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
    // countDistinctElement(arr);

    int arr1[] = { 7, 3, 9 };
    int arrr2[] = { 6, 3, 9, 2, 9, 4 };
    union(arr1, arrr2);
    intersection(arr1, arrr2);
  }
}
