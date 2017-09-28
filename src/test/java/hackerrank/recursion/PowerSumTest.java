package hackerrank.recursion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PowerSumTest {

    @Test
    public void first() throws Exception {
        int solutions = PowerSum.solutions(100, 2);
        System.out.println(solutions);
        Assert.assertTrue(solutions == 3);
    }

    @Test
    public void second() throws Exception {
        int solutions = PowerSum.solutions(10, 2);
        Assert.assertTrue(solutions == 1);
    }
}
