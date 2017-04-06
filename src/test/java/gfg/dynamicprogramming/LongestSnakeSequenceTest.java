package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LongestSnakeSequenceTest
{
    @Test
    public void find() throws Exception
    {
        int arrA[][] = {{1, 2, 1, 2},
            {7, 7, 2, 5},
            {6, 4, 3, 4},
            {1, 2, 2, 5}};
        Assert.assertEquals(7, LongestSnakeSequence.findShortestPath(arrA, 4, 4));
    }

    @Test
    public void find2() throws Exception
    {
        int arrA[][] = {{1, 2, 1, 2}};
        Assert.assertEquals(4, LongestSnakeSequence.findShortestPath(arrA, 1, 4));
    }

    @Test
    public void find3() throws Exception
    {
        int arrA[][] = {{1}};
        Assert.assertEquals(1, LongestSnakeSequence.findShortestPath(arrA, 1, 1));
    }
}
