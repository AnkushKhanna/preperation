package ch1_string_arrays

import org.scalatest.FlatSpec

class Q_1_4_PalindromeTest extends FlatSpec {

  val palindrome = new Q_1_4_Palindrome

  "isPalindrome" should "return true if string is palindrome" in {
    assert(true === palindrome.isPalindrome("abba"))
  }

  it should "return true if string [Tact Coa] is palindrome" in {
    assert(true === palindrome.isPalindrome("Tact Coa"))
  }

  it should "return false if string [ab] is palindrome" in {
    assert(false === palindrome.isPalindrome("ab"))
  }

  it should "return false if string is not palindrome" in {
    assert(false === palindrome.isPalindrome("ankush"))
  }
}
