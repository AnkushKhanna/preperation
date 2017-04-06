package priorityQueue;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MaxWindowTest
{
    @Test
    public void find() throws Exception
    {

        List<Window> windows = Lists.newArrayList(
            new Window(1, 5),
            new Window(2, 1),
            new Window(3, 7),
            new Window(4, 10),
            new Window(5, 11),
            new Window(6, 9)
        );

        Assert.assertEquals(49, MaxWindow.maxRevenue(windows, 5));
    }
}
