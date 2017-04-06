package hiredintech.list;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NumericPalindromeTest
{
    @Test
    public void find() throws Exception
    {
        Assert.assertTrue(NumericPalindrome.is_numeric_palindrome(6666));
        Assert.assertTrue(NumericPalindrome.is_numeric_palindrome(66666));
        Assert.assertFalse(NumericPalindrome.is_numeric_palindrome(666667878655L));
        Assert.assertTrue(NumericPalindrome.is_numeric_palindrome(121212212121L));
        Assert.assertFalse(NumericPalindrome.is_numeric_palindrome(10000000000L));
        Assert.assertTrue(NumericPalindrome.is_numeric_palindrome(0));
        Assert.assertTrue(NumericPalindrome.is_numeric_palindrome(1));
        Assert.assertTrue(NumericPalindrome.is_numeric_palindrome(11));
        Assert.assertFalse(NumericPalindrome.is_numeric_palindrome(1051));
    }
}
