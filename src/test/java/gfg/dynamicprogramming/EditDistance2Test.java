package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EditDistance2Test
{
    @Test
    public void editDistance() throws Exception
    {
        Assert.assertEquals(3, EditDistance2.minEdits("sunday", "saturday"));
    }
}
