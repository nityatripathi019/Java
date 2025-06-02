// import java.util.Scanner;

public class Arrays {

  public static void updateMarks(int marks[]) {
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;

    }
    for (int i = 0; i < marks.length; i++) {
      System.out.println(marks[i]);
    }
  }
  // linear search

  public static int linearSearch(String menu[], String item) {
    for (int i = 0; i < menu.length; i++) {
      if (menu[i] == item) {
        return i;
      }
    }
    return -1;
  }

  public static void printLargest_Smallest(int arr[]) {
    int largest = Integer.MIN_VALUE;// -infinity
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (largest < arr[i]) {
        largest = arr[i];
      }
      if (smallest > arr[i]) {
        smallest = arr[i];
      }
    }

    System.out.println("largest value : " + largest);
    System.out.println("Smallest value : " + smallest);
  }

  // arrays in java call by reference
  public static void main(String args[]) {
    // // creation of an array
    // int marks[] = new int[10];
    // Scanner sc = new Scanner(System.in);
    // int marks[] = { 89, 98, 67 };
    // updateMarks(marks);
    // int marks[] = { 20, 0, 5, 15, 9, 8, 2, 7, 3 };
    // System.out.println("enter num: ");
    // int num = sc.nextInt();
    // int index = (linearSearch(marks, num));
    // if (index == -1) {
    // System.out.println("not found");
    // } else {
    // System.out.println("no found at index " + index);
    // }
    // }

    // String menu[] = { "dosa", "idli", "shambhar", "chutney-chutney", "samosa",
    // "chowmine", "burger", "pizza", "momos" };
    // String item = sc.next();
    // int index = linearSearch(menu, null);
    // if (index == -1) {
    // System.out.println("not found");
    // } else {
    // System.out.println("found at index " + index);
    // }

    int arr[] = { 1, 4, 5, 7, 3, 8, -9, 23, -7, -4 };
    printLargest_Smallest(arr);
  }
}
