package cci.arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class ArrayRotationTest
{
    ArrayRotation r = new ArrayRotation();

    @Test
    public void test_rotation() throws Exception
    {
        int[] a = new int[]{1, 2,3,4,5};

        System.out.println(Arrays.toString(r.rotate(5, a, 2)).replace(","," ").replace("[", "").replace("]", ""));


        Assert.assertArrayEquals(new int[]{3,4,5,1,2}, r.rotate(5, a, 2));

    }
}
