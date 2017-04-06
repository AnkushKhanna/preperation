package hiredintech.list;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class JumpOverNumbersTest
{
    @Test
    public void find() throws Exception
    {
        Assert.assertEquals(4, JumpOverNumbers.jump_over_numbers(Lists.newArrayList(3,4,1,2,5,6,9,0,1,2,3,1)));
    }
}
