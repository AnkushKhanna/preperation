package maxsumsubarray;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MaxSumSubArrayMemorizeTest
{
    MaxSumSubArrayMemorize maxSumNonAdjacent = new MaxSumSubArrayMemorize();

    @Test
    public void find_max_adj_value() throws Exception
    {
        int[] arr = new int[]{1, 0, 3, 9, 12};
        Assert.assertEquals(16, maxSumNonAdjacent.findMaximum(arr));

        int[] arr1 = new int[]{1, 0, 3, 9, 2};

        Assert.assertEquals(10, maxSumNonAdjacent.findMaximum(arr1));
    }
}
