package sorting;

public class AllSort {
  
  public static void BubSort(int[] arr, int size) {
    for (int i = 0; i < size - 1; i++) { // no need to check the last element.
      boolean swapped = false;
      for (int j = 0; j < size - i - 1; j++) { // because the last i elements will be already sorted, so no need to check them.
        if (arr[j] > arr[j + 1]) {
          swapped = true;
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void SelectionSort(int[] arr, int size) {
    for (int i = 0; i < size - 1; i++) {
      int min_idx = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min_idx];
      arr[min_idx] = temp;
    }
  }

  public static void insertionSort(int[] arr, int size) {
    for (int i = 1; i < size; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }
  
  public static void main(String[] args) {
    int[] arr = { 10, 4, 8, 9, 2, 1 };
   AllSort.BubSort(arr, 6);
   for (int i = 0; i < 6; i++) {
     System.out.print(arr[i] + " ");
   }
  }
}
