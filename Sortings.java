
public class Sortings {

  public static void printArray(int arr[]) {
    for (int nums : arr) {
      System.out.print(nums + " ");
    }
  }

  public static void mergeSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }

    int mid = si + (ei - si) / 2;// (si+ei)/2
    mergeSort(arr, si, mid);// left part
    mergeSort(arr, mid + 1, ei);// right part
    merge(arr, si, mid, ei);
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];
    int i = si;// iterator for left part
    int j = mid + 1;// iterator for right part
    int k = 0;// iterator for temp arr
    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];

        i++;
      } else {
        temp[k] = arr[j];
        j++;

      }
      k++;
    }

    // left part remaining element
    while (i <= mid) {
      temp[k] = arr[i];
      i++;
      k++;

    }
    // right part
    while (j <= ei) {
      temp[k] = arr[j];
      j++;
      k++;
    }

    // copy temp to original arr
    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }
  // counting sort
  // public static void countSort(int arr[]) {
  // int largest = Integer.MIN_VALUE;
  // for (int i = 0; i < arr.length; i++) {
  // largest = Math.max(largest, arr[i]);
  // }
  // int count[] = new int[largest + 1];
  // for (int i = 0; i < arr.length; i++) {
  // count[arr[i]]++;
  // }
  // // sorting
  // int j = 0;
  // for (int i = 0; i < count.length; i++) {
  // while (count[i] > 0) {
  // arr[j] = i;
  // j++;
  // count[i]--;
  // }
  // }
  // for (int nums : arr) {
  // System.out.print(nums + " ");
  // }
  // }

  // merge sort

  public static void main(String args[]) {
    // System.out.println("Ram Ramji");
    // int arr[] = { 1, 2, 3, 1, 2, 1, 1, 4, 1, 4, 5, 7 };
    // countSort(arr);
    int arr[] = { 6, 3, 5, 6, 2, 7, 2, 1 };
    mergeSort(arr, 0, arr.length - 1);
    printArray(arr);
  }
}
