package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductRowCuttingTest
{
    @Test
    public void name() throws Exception
    {
        Assert.assertEquals(6, ProductRowCutting.maxProduct(50));
    }
}
