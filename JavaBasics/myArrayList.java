import java.util.ArrayList;
import java.util.Collections;

class myArrayList {

  public static void reverseArrayList(ArrayList<Integer> list) {
    int i = 0, j = list.size() - 1;
    while (i < j) {
      Integer temp = Integer.valueOf(list.get(i));
      list.set(i, list.get(j));
      list.set(j, temp);
      i++;
      j--;
    }
  }

  public static void main(String args[]) {
    // ArrayList<Integer> l1 = new ArrayList<>();
    // l1.add(5);
    // l1.add(6);
    // l1.add(7);
    // l1.add(8);
    // // printing
    // System.out.println(l1);// [5,6,7,8]
    // // printing through loops
    // for (int i = 0; i < l1.size(); i++) {
    // System.out.print(l1.get(i) + " ");
    // }
    // // get an element at index i
    // l1.get(1);// 6
    // // adding an element at index i
    // l1.add(1, 100);// [5,100,6,7,8]
    // System.out.println(l1);
    // // modifying element at index i
    // l1.set(1, 10);// [5,10,6,7,8]
    // System.out.println((l1));
    // // removing an element at indexi
    // l1.remove(1);// [5,6,7,8]
    // System.out.println(l1);

    // if you dont specify class u can put anything
    ArrayList<Object> l2 = new ArrayList<>();
    l2.add("Rohan");
    l2.add(3);
    l2.add(5.4F);
    System.out.println(l2);
    // reverse an arraylist
    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(3);
    list.add(4);
    list.add(1);
    list.add(5);
    list.add(2);
    // System.out.println("Original list" + list);
    // reverseArrayList(list);
    // System.out.println("new list" + list);
    // reverse with collection framework
    System.out.println("Original list" + list);
    Collections.reverse(list);
    System.out.println("new list" + list);
    // sorting with collection
    Collections.sort(list);// sortinasc
    System.out.println("sorted list" + list);
    // desc sorting
    Collections.sort(list, Collections.reverseOrder());
    System.out.println("dessort" + list);
  }

}
