package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MinCoinTest
{
    MinCoin c = new MinCoin();

    @Test
    public void find() throws Exception
    {
        Assert.assertEquals(86909, c.minCoins(11, new int[]{1, 2, 5}));
        Assert.assertEquals(-1, c.minCoins(7, new int[]{2, 6}));
    }
}
