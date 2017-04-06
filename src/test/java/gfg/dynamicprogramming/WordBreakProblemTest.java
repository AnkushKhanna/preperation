package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class WordBreakProblemTest
{
    @Test
    public void find() throws Exception
    {
        Set<String> hs = new HashSet<>();
        hs.add("this");
        hs.add("is");
        hs.add("sumit");
        hs.add("jain");
        hs.add("the");
        hs.add("problem");

        Assert.assertTrue(WordBreakProblem.find("thisissumitjain", hs));
        Assert.assertFalse(WordBreakProblem.find("thisissumitja", hs));
        Assert.assertFalse(WordBreakProblem.find("thisisadog", hs));
    }
}
