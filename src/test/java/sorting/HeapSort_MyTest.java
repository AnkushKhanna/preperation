package sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HeapSort_MyTest
{
    HeapSort_My heapSort = new HeapSort_My();

    @Test
    public void quick_sort() throws Exception
    {
        int[] arr = new int[]{4, Integer.MAX_VALUE, 6, 1, 9, Integer.MAX_VALUE, 10, 88, 8, 5, 11, 2};
        int[] sortedArr = new int[]{1, 2, 4, 5, 6, 8, 9, 10, 11, 88, Integer.MAX_VALUE, Integer.MAX_VALUE};
        heapSort.heapSort(arr);
        testSortedArray(sortedArr, arr);
    }

    @Test
    public void quick_sort_1() throws Exception
    {
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8, 9, Integer.MAX_VALUE};
        int[] sortedArr = new int[]{1, 2, 3, 5, 6, 7, 8, 9, Integer.MAX_VALUE};

        heapSort.heapSort(arr);

        testSortedArray(sortedArr, arr);
    }

    private void testSortedArray(int[] expected, int[] actual)
    {
        Assert.assertEquals(expected.length, actual.length);

        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }
}
