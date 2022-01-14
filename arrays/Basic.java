package arrays;

import java.util.ArrayList;

class Basic {

  static int search(int arr[], int n, int x) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }
  
  static int largest(int arr[], int n) {
    int res= 0;
    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[res]) {
        res = i;
      }
    }
    return res;
  }

  static int secondLargest(int arr[], int n) {
    int largest=0;
    int res = -1;
    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[largest]) {
        res = largest;
        largest = i;
      }
      else if (arr[i] != arr[largest]) {
        if (res == -1 || arr[i] > arr[res]) {
          res = i;
        }
      }
    }
    return res;
  }
  public static void main(String args[]) {
    //creating array in java.
    int anarray[] = new int[10];
    anarray[0] = 1;
    int arr[] = { 1, 2, 3, 4, 5 };
    System.out.println(largest(arr, 5));
    System.out.println(secondLargest(arr, 5));
    System.out.println(Basic.search(arr, 5, 3));
    //creating arraylist in java.
    ArrayList<Integer> al = new ArrayList<>();
    ArrayList<Integer> ac = new ArrayList<>(10);
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    ac.add(1);
    System.out.println(al); 
  }
}