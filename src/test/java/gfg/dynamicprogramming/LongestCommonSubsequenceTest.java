package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LongestCommonSubsequenceTest
{
    @Test
    public void find() throws Exception
    {
        Assert.assertEquals(4, LongestCommonSubsequence.find("AGGTAB", "GXTXAYB"));
        Assert.assertEquals(3, LongestCommonSubsequence.find("ABCDGH", "AEDFHR"));
    }

}
