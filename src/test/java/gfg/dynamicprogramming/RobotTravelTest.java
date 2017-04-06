package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RobotTravelTest
{
    @Test
    public void find() throws Exception
    {
        int arrA[][] = {{1, 1, 1}, {1, -1, 1}, {1, -1, 1}};
        Assert.assertEquals(1, RobotTravel.countAllPaths(arrA, 3, 3));
    }

    @Test
    public void find2() throws Exception
    {
        int arrA[][] = {{1, 1, 1}, {1, 1, 1}, {1, -1, 1}};
        Assert.assertEquals(3, RobotTravel.countAllPaths(arrA, 3, 3));
    }

    @Test
    public void find3() throws Exception
    {
        int arrA[][] = {{1, 1, 1}, {1, -1, 1}, {1, 1, 1}};
        Assert.assertEquals(2, RobotTravel.countAllPaths(arrA, 3, 3));
    }

    @Test
    public void find4() throws Exception
    {
        int arrA[][] = {{1, -1, 1, 1}, {1, 1, 1, 1}, {-1, -1, 1, 1}};
        Assert.assertEquals(2, RobotTravel.countAllPaths(arrA, 3, 4));
    }
}
