package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MaximumSizeSubMatrixTest
{
    @Test
    public void find() throws Exception
    {
        int[][] arrA = {
            { 0, 1, 0, 1, 0, 1 },
            { 1, 0, 1, 0, 1, 0 },
            { 0, 1, 1, 1, 1, 0 },
            { 0, 0, 1, 1, 1, 0 },
            { 1, 1, 1, 1, 1, 1 } };

        Assert.assertEquals(3, MaximumSizeSubMatrix.max(arrA, 5, 6));
    }

    @Test
    public void find1() throws Exception
    {
        int[][] arrA = {
            { 0, 1, 0, 1, 0, 1 },
            { 1, 0, 1, 0, 1, 0 },
            { 1, 0, 1, 0, 1, 0 },
            { 1, 0, 1, 0, 1, 0 },
            { 0, 1, 1, 1, 1, 0 },
            { 0, 0, 1, 1, 1, 0 },
            { 1, 0, 1, 0, 1, 0 },
            { 1, 1, 1, 1, 1, 1 } };

        Assert.assertEquals(2, MaximumSizeSubMatrix.max(arrA, 8, 6));
    }
}
