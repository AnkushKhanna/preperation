package maxsumsubarray;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MaximumSumSubArrayTest
{
    MaximumSumSubArray maximumSumSubArray = new MaximumSumSubArray();

    @Test
    public void test_for_max_Sum() throws Exception
    {
        int[] arr = new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4};

        assertEquals(-1, maximumSumSubArray.max(arr));

        int[] arr1 = new int[]{-2, -1, -3, 4, -1, 2, 1, -5, -4};

        assertEquals(-1, maximumSumSubArray.max(arr));

        Assert.assertEquals(10, maximumSumSubArray.max(new int[]{1, 2, -3, -4, 2, 7, -2, 3}));
        Assert.assertEquals(28, maximumSumSubArray.max(new int[]{1, 3, 0, -4, 2, 9, 7, 10}));
        Assert.assertEquals(-1, maximumSumSubArray.max(new int[]{-5, -2, -1, -5, -3}));
        Assert.assertEquals(10, maximumSumSubArray.max(new int[]{2, -1, 2, 3, 4, -5}));
    }
}
