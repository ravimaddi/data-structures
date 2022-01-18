package binarysearch;

/**
 * BinarySearch
 */
public class BinarySearch {

  public static int bSearch(int arr[], int num, int size) {
    int low = 0, high = size - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == num) {
        return mid;
      } else if (arr[mid] > num) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

  static int recursivebSearch(int arr[],int low, int high, int num) {
    if (low > high) {
      return -1;
    }
    int mid = (low + high) / 2;
    if (arr[mid] == num) {
      return mid;
    }
    else if (arr[mid] > num) {
     return recursivebSearch(arr,low,mid - 1,num);
    }
    else {
       return recursivebSearch(arr,mid+1,high,num);
      }
  }

  public static void main(String[] args) {
    int arr[]= {10,20,30,40,50,60,70};
    int arr1[]={1,2,3,4};
    System.out.println(BinarySearch.bSearch(arr, 20, 7));
    System.out.println(BinarySearch.bSearch(arr1, 4, 4));
    System.out.println(BinarySearch.recursivebSearch(arr, 0, 7,20));
    System.out.println(BinarySearch.recursivebSearch(arr1, 0,4,4));

  }
}