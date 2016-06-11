package ch1_string_arrays

class Q_1_4_Palindrome {

  def isPalindrome(str: String): Boolean = {
    isPalindrome(str.toLowerCase.toCharArray)
  }

  private def isPalindrome(array: Array[Char]): Boolean = {
    if (array.length == 1) {
      return true
    }

    if (array.length == 2) {
      return array(0) == array(1)
    }
    val allowed =
      if (array.length % 2 == 0) {
        2
      } else {
        1
      }
    isPalindrome(array.sorted.toList, allowed)
  }

  private def isPalindrome(sortedArray: List[Char], allowed: Int): Boolean = {
    if (allowed < 0) {
      return false
    }
    sortedArray match {
      case Nil => true
      case x :: Nil if allowed > 0 => true
      case x :: Nil => false
      case x :: y :: tail if x == y => isPalindrome(tail, allowed)
      case x :: y :: tail => isPalindrome(y :: tail, allowed - 1)
    }
  }
}
