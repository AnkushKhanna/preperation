package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MinCoinsNumberOfWaysTest
{
    @Test
    public void find() throws Exception
    {
        Assert.assertEquals(4, MinCoinsNumberOfWays.ways(4, new int[]{1, 2, 3}));
        Assert.assertEquals(0, MinCoinsNumberOfWays.ways(7, new int[]{2, 6}));
    }
}
