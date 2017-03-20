package cci.sorting_searching;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnagramsTest
{
    @Test
    public void test_anagrams() throws Exception
    {
        Assert.assertEquals(7 ,Anagrams.numberNeeded("abc", "xdssqa"));
        Assert.assertEquals(7 ,Anagrams.numberNeeded("abc", "dddd"));
        Assert.assertEquals(3 ,Anagrams.numberNeeded("abc", "cbaeec"));
    }
}
