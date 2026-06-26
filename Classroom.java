
import java.util.HashSet;
import java.util.Iterator;

public class Classroom {
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

    Iterator it = cities.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
