import java.util.Scanner;

//leap year program
// class first {
//   public static void main(String args[]) {
//     System.out.println("TO CHECK WHETEHR YEAR IS LEAP OR NOT");
//     System.out.print("enter year : ");
//     Scanner sc = new Scanner(System.in);
//     int year = sc.nextInt();
//     if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//       System.out.println(year + "is leap year");
//     } else {
//       System.out.println(year + "is not leap year");
//     }

//   }

// }

// class first {
//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter any no from 1 to 7");
//     int week = sc.nextInt();

//     switch (week) {
//       case 1:
//         System.out.println("day of the week is monday");
//         break;
//       case 2:
//         System.out.println("day of the week is tuesday");
//         break;
//       case 3:
//         System.out.println("day of the week is wednesday");
//         break;
//       case 4:
//         System.out.println("day of the week is thursday");
//         break;
//       case 5:
//         System.out.println("day of the week is friday");
//         break;
//       case 6:
//         System.out.println("day of the week is saturday");
//         break;
//       case 7:
//         System.out.println("day of the week is sunday");
//         break;
//       default:
//         System.out.println("Invalid input ! please enter week no btw 1 to 7");
//     }
//   }
// }

// calculator 

/* class first {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter first value: ");
    int a = sc.nextInt();
    System.out.print("enter second value :");
    int b = sc.nextInt();
    System.out.println("enter any operator among these :  + , - ,% , *");
    char operator = sc.next().charAt(0);

    switch (operator) {
      case '+':
        System.out.println(a + b);
        break;
      case '-':
        System.out.println(a - b);
        break;
      case '%':
        System.out.println(a % b);
        break;
      case '*':
        System.out.println(a * b);
        break;
      default:
        System.out.println("invalid input ");

    }

  }
} */

class first {
  public static void main(String args[]) {
    System.out.println("check if student is pass or fail");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your marks :");
    int marks = sc.nextInt();
    String result = marks >= 33 ? "PASS" : "FAIL";
    System.out.println(result);

  }
}