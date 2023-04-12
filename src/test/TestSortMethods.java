import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestSortMethods {
  private int[] arr;
  private int[] sortedArr;
  private int[] arrayWithDuplicates;
  private int[] sortedArrayWithDuplicates;
  private int[] emptyArr;
  private int[] reverseSortedArr;
  private int[] arrLen1;
  private int[] arrLen2;

  @Before
  public void setup() {
    arr = new int[]{3, 1, 5, 2, 4};
    sortedArr = new int[]{1, 2, 3, 4, 5};
    arrayWithDuplicates = new int[]{3, 3, 1, 1, 5, 5, 2, 4};
    sortedArrayWithDuplicates = new int[]{1, 1, 2, 3, 3, 4, 5, 5};
    emptyArr = new int[]{};
    reverseSortedArr = new int[]{5, 4, 3, 2, 1};
    arrLen1 = new int[]{3};
    arrLen2 = new int[]{3, 1};
  }

  @Test
  public void testInsertionSort() {
    assertArrayEquals(sortedArr, SortMethods.insertionSort(arr));
    assertArrayEquals(sortedArrayWithDuplicates, SortMethods.insertionSort(arrayWithDuplicates));
    assertArrayEquals(new int[]{}, SortMethods.insertionSort(emptyArr));
    assertArrayEquals(sortedArr, SortMethods.insertionSort(reverseSortedArr));
    assertArrayEquals(new int[]{3}, SortMethods.insertionSort(arrLen1));
    assertArrayEquals(new int[]{1, 3}, SortMethods.insertionSort(arrLen2));
  }

  @Test
  public void testSelectionSort() {
    assertArrayEquals(sortedArr, SortMethods.selectionSort(arr));
    assertArrayEquals(sortedArrayWithDuplicates, SortMethods.selectionSort(arrayWithDuplicates));
    assertArrayEquals(new int[]{}, SortMethods.selectionSort(emptyArr));
    assertArrayEquals(sortedArr, SortMethods.selectionSort(reverseSortedArr));
    assertArrayEquals(new int[]{3}, SortMethods.selectionSort(arrLen1));
    assertArrayEquals(new int[]{1, 3}, SortMethods.selectionSort(arrLen2));
  }

  @Test
  public void testBubbleSort() {
    assertArrayEquals(sortedArr, SortMethods.bubbleSort(arr));
    assertArrayEquals(sortedArrayWithDuplicates, SortMethods.bubbleSort(arrayWithDuplicates));
    assertArrayEquals(new int[]{}, SortMethods.bubbleSort(emptyArr));
    assertArrayEquals(sortedArr, SortMethods.bubbleSort(reverseSortedArr));
    assertArrayEquals(new int[]{3}, SortMethods.bubbleSort(arrLen1));
    assertArrayEquals(new int[]{1, 3}, SortMethods.bubbleSort(arrLen2));
  }
}