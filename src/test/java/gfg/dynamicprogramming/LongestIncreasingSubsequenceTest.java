package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LongestIncreasingSubsequenceTest
{

    @Test
    public void find() throws Exception
    {
        Assert.assertEquals(6, LIS3.find(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}));
        Assert.assertEquals(3, LIS3.find(new int[]{3, 10, 2, 1, 20}));
        Assert.assertEquals(1, LIS3.find(new int[]{3, 2}));
        Assert.assertEquals(4, LIS3.find(new int[]{50, 3, 10, 7, 40, 80}));
        Assert.assertEquals(6, LIS3.find(new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15}));
    }
}
