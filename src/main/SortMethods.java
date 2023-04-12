/**
 * The SortMethods class provides static methods insertionSort, selectionSort,
 * and bubbleSort for sorting integer arrays.
 */
public class SortMethods {
  /**
   * Swaps two values of two elements in an int array
   *
   * @param arr the int array
   * @param i   index of the first element to swap
   * @param j   index of the second element to swap
   */
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  /**
   * Returns a sorted int array using the insertion sort method
   *
   * @param arr The unsorted int array
   * @return sorted int array
   */
  public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int j = i;
      //  continues swap with prev elem to find where the element belongs
      while (j > 0 && arr[j] < arr[j - 1]) {
        swap(arr, j, j - 1);
        // decrement until while loop is false to place arr[j] at correct index
        j--;
      }
    }
    return arr;
  }

  /**
   * Returns a sorted int array using the insertion sort method
   *
   * @param arr The unsorted int array
   * @return sorted int array
   */
  public static int[] selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minIdx = i;
      // Define search space
      for (int j = i + 1; j < n; j++) {
        // track minIdx value
        if (arr[j] < arr[minIdx]) {
          minIdx = j;
        }
      }
      swap(arr, i, minIdx);
    }
    return arr;
  }

  /**
   * Returns a sorted int array using the bubble sort method
   *
   * @param arr The unsorted int array
   * @return sorted int array
   */
  public static int[] bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      // create inner loop bounded by i
      for (int j = 0; j < n - i - 1; j++) {
        // bubble up the largest value in each inner loop iteration
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }

    }
    return arr;
  }
}
