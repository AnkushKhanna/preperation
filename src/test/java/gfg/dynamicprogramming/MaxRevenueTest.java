package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MaxRevenueTest
{
    @Test
    public void maxRevenue() throws Exception
    {
        int[] x = {6, 7, 12, 13, 14};
        int[] revenue = {5, 6, 5, 3, 1};

        Assert.assertEquals(10, MaxRevenue.maxR(x, revenue));
    }
}
