package cci.sorting_searching;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BracketMatchingTest
{
    @Test
    public void bracketMatching() throws Exception
    {
        Assert.assertTrue(BracketMatching.isBalanced("{[()]}"));
        Assert.assertFalse(BracketMatching.isBalanced("{[(])}"));
        Assert.assertTrue(BracketMatching.isBalanced("{{[[(())]]}}"));
        Assert.assertTrue(BracketMatching.isBalanced("((()))[]{[(()({[()({[]}{})]}))]}{[]}{{({}{})[{}{}]{()([()])[{()}()[[]{}()]{}{}[]()]}[[]{[]}([])]}}"));
        Assert.assertFalse(BracketMatching.isBalanced("((){}])][]][}{]{)]]}][{]}[)(])[}[({("));
    }
}
