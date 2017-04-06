package hiredintech.list;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DigitSumTest
{
    @Test
    public void find() throws Exception
    {
        Assert.assertEquals(20,DigitSum.digit_sum(2567l));
        Assert.assertEquals(43,DigitSum.digit_sum(1325132435356l));
    }
}
