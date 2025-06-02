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

  public static void rotatedHalfPyramid(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void invertedNumPyramid(int n) {
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void zeroOneTraingle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }

  public static void butterflyPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int k = 1; k <= 2 * (n - i); k++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // second half
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int k = 1; k <= 2 * (n - i); k++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void solidRhombus(int n) {
    for (int i = 1; i <= n; i++) {
      for (int k = 1; k <= (n - i); k++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void hollowRhombus(int n) {
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // hollowRhombus
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void diamondPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    // HollowRectangle(5, 7);
    // rotatedHalfPyramid(10);
    // invertedNumPyramid(5);
    // zeroOneTraingle(5);
    // butterflyPattern(6);
    // solidRhombus(5);
    // hollowRhombus(7);
    diamondPattern(4);

  }
}