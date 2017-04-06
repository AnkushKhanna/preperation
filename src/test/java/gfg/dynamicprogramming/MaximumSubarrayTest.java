package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MaximumSubarrayTest
{
    @Test
    public void test() throws Exception
    {
        Assert.assertEquals(10, MaximumSubarray.maxSum(new int[]{1, 2, -3, -4, 2, 7, -2, 3}));
        Assert.assertEquals(28, MaximumSubarray.maxSum(new int[]{1, 3, 0, -4, 2, 9, 7, 10}));
        Assert.assertEquals(-1, MaximumSubarray.maxSum(new int[]{-5, -2, -1, -5, -3}));
        Assert.assertEquals(6, MaximumSubarray.maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
