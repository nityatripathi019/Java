import java.util.*;

// public class StackB {

//   static class Stack {
//     static ArrayList<Integer> list = new ArrayList<>();

//     // isEmpty
//     public static boolean isEmpty() {
//       return list.size() == 0;

//     }

//     // push
//     public static void push(int data) {
//       list.add(data);
//     }

//     // pop
//     public static int pop() {
//       if (!isEmpty()) {
//         int top = list.get(list.size() - 1);
//         list.remove(list.size() - 1);
//         return top;
//       }
//       return -1;
//     }

//     // peek
//     public static int peek() {
//       if (!isEmpty()) {
//         return list.get(list.size() - 1);
//       }
//       return -1;
//     }

//   }

//   public static void main(String[] args) {
//     Stack s = new Stack();
//     for (int i = 1; i <= 5; i++) {
//       s.push(i);
//     }
//     while (!s.isEmpty()) {
//       System.out.println(s.peek());
//       s.pop();

//     }
//   }
// }

// public class StackB {

//   public static void pushAtBottom(Stack<Integer> s, int data) {
//     if (s.isEmpty()) {
//       s.push(data);
//       return;
//     }

//     int top = s.pop();
//     pushAtBottom(s, data);
//     s.push(top);
//   }

//   public static void main(String[] args) {
//     Stack<Integer> s = new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     pushAtBottom(s, 4);

//     while (!s.isEmpty()) {
//       System.out.println(s.peek());
//       s.pop();
//     }
//   }

// }

public class StackB {

  public static String reverseString(String str) {
    Stack<Character> s = new Stack<>();
    int idx = 0;
    while (idx < str.length()) {
      s.push(str.charAt(idx));
      idx++;
    }

    StringBuilder newStr = new StringBuilder();
    while (!s.isEmpty()) {
      newStr.append(s.pop());
    }

    return newStr.toString();

  }

  // reverse a stack

  public static void pushAtBottom(Stack<Integer> s, int data) {
    if (s.isEmpty()) {
      s.push(data);
      return;
    }

    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
  }

  public static void reverseStack(Stack<Integer> s) {
    if (!s.isEmpty()) {
      return;
    }
    int top = s.pop();
    reverseStack(s);
    pushAtBottom(s, top);
  }

  public static void printStack(Stack<Integer> s) {
    while (!s.isEmpty()) {
      System.out.println(s.pop());
    }
  }

  public static void main(String[] args) {
    // String str = "helloworld!";
    // String result = reverseString(str);
    // System.out.println(result);

    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    reverseStack(s);
    printStack(s);
  }
}