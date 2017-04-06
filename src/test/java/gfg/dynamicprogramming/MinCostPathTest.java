package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MinCostPathTest
{
    int[][] matrix = new int[][]{
        new int[]{1, 2, 3},
        new int[]{4, 8, 2},
        new int[]{1, 5, 3}
    };

    @Test
    public void findCost() throws Exception
    {
        Assert.assertEquals(8, MinCostPath.cost(matrix, 0, 0));
        Assert.assertEquals(11, MinCostPath.cost(matrix, 1, 1));
        Assert.assertEquals(9, MinCostPath.cost(matrix, 2, 0));
        Assert.assertEquals(12, MinCostPath.cost(matrix, 1, 0));
    }
}
