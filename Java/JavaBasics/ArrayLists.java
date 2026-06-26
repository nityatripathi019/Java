import java.util.ArrayList;

import java.util.Collections;

// import java.util.*;

class ArrayLists {

  // public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
  // int temp = list.get(idx1);
  // list.set(idx1, list.get(idx2));
  // list.set(idx2, temp);
  // }

  // public static int maxWaterContainer(ArrayList<Integer> height) {

  // int max = 0;
  // int lp = 0;
  // int rp = height.size() - 1;
  // while (lp < rp) {
  // // calculate water
  // int ht = Math.min(height.get(lp), height.get(rp));
  // int width = rp - lp;
  // int water = ht * width;
  // max = Math.max(water, max);

  // // update ptr
  // if (lp < rp) {
  // lp++;
  // } else {
  // rp--;
  // }
  // }

  // return max;

  // }

  // pair sum
  // public static boolean pairSum(ArrayList<Integer> list, int target) {
  // for (int i = 0; i < list.size() - 1; i++) {
  // for (int j = i + 1; j < list.size(); j++) {
  // if (list.get(i) + list.get(j) == target) {
  // return true;

  // }
  // }

  // }
  // return false;

  // }

  public static boolean targetSum(ArrayList<Integer> list, int target) {
    Collections.sort(list);
    int lp = 0;
    int rp = list.size() - 1;
    while (lp < rp) {
      if (list.get(lp) + list.get(rp) == target) {
        return true;
      } else if (list.get(lp) + list.get(rp) < target) {
        lp++;
      } else {
        rp--;
      }
    }
    return false;
  }

  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);

    // brute force approach for container with most water
    // int n = list.size();
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < n - 1; i++) {
    // for (int j = i + 1; j < n; j++) {

    // int height = Math.min(list.get(i), list.get(j));
    // int width = j - i;
    // int water = height * width;
    // max = Math.max(water, max);
    // }
    // }

    // System.out.println("container with most water: " + max);
    // for (int i = 0; i < mainList.size(); i++) {
    // ArrayList<Integer> newList = mainList.get(i);
    // for (int j = 0; j < newList.size(); j++) {
    // System.out.print(newList.get(j) + " ");
    // }
    // System.out.println();
    // }

    // int output = maxWaterContainer(list);
    // System.out.println(output);

    // for (int i = 1; i <= 6; i++) {
    // list.add(i);
    // }
    // boolean ans = pairSum(list, 5);
    // System.out.println(ans);
    // pair sum two pointer approach
    boolean ans = targetSum(list, 16);
    System.out.println(ans);
  }
}