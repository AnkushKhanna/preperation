package sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MergeSortTest
{
    MergeSort mergeSort = new MergeSort();

    @Test
    public void merge() throws Exception
    {
        int[] arr = new int[]{Integer.MAX_VALUE, 4, 6, 1, 9, Integer.MAX_VALUE, 10, 88, 8, 5, 11, 2};
        int[] sortedArr = new int[]{1, 2, 4, 5, 6, 8, 9, 10, 11, 88, Integer.MAX_VALUE, Integer.MAX_VALUE};

        int[] mergedArr = mergeSort.mergeSort(arr, 0, arr.length);

        testSortedArray(sortedArr, mergedArr);
    }

    @Test
    public void merge_1() throws Exception
    {
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8, 9, Integer.MAX_VALUE};

        int[] mergedArr = mergeSort.mergeSort(arr, 0, arr.length);

        testSortedArray(arr, mergedArr);
    }

    private void testSortedArray(int[] expected, int[] actual)
    {
        Assert.assertEquals(expected.length, actual.length);

        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }
}
