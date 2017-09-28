package hackerrank.recursion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DigitSumTest {

    @Test
    public void first() throws Exception {
        assertEquals("3", DigitSum.superDigit("148148148"));
        assertEquals("2", DigitSum.superDigit("9875"));
    }

    @Test
    public void name() throws Exception {

    }
}
