// public class pattern {
//   public static void main(String args[]) {
//     int n = 6;
//     for (int i = 1; i <= n; i++) {
//       for (int j = 1; j <= n; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }

// public class pattern {
//   public static void main(String args[]) {
//     int n = 4;
//     for (int i = 1; i <= n; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }

// public class pattern {
//   public static void main(String args[]) {
//     int n = 4;
//     for (int i = 1; i <= n; i++) {
//       for (int j = n; j >= i; j--) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }

// public class pattern {
//   public static void main(String args[]) {
//     int n = 4;
//     for (int i = 1; i <= n; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print(j);
//       }
//       System.out.println();
//     }
//   }
// }

// public class pattern {
//   public static void main(String args[]) {
//     int n = 10;
//     char ch = 'A';
//     for (int i = 1; i <= n; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print(ch);
//         ch++;
//       }
//       System.out.println();
//     }
//   }
// }

//floyd's triangle

// public class pattern {
//   public static void main(String args[]) {
//     int n = 5;
//     int counter = 1;
//     for (int i = 1; i <= n; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print(counter + " ");
//         counter++;
//       }
//       System.out.println();
//     }
//   }
// }

//print hollow rectangle

public class pattern {

  public static void HollowRectangle(int totRows, int totCol) {// outer loop
    for (int i = 1; i <= totRows; i++) {
      // inner col
      for (int j = 1; j <= totCol; j++) {
        if (i == 1 || i == totRows || j == 1 || j == totCol) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }

  public static void main(String args[]) {
    HollowRectangle(5, 7);
  }
}