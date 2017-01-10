package maxsumsubarray;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MaxSumSubArrayTest
{
    MaxSumSubArray maxSumNonAdjacent = new MaxSumSubArray();

    @Test
    public void find_max_adj_value() throws Exception
    {
        int[] arr = new int[]{1, 0, 3, 9, 12};

        Assert.assertEquals(16, maxSumNonAdjacent.findMaximum(arr));
    }
}
