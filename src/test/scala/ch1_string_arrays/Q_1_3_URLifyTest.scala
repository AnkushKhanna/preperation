package ch1_string_arrays

import org.scalatest.FlatSpec

class Q_1_3_URLifyTest extends FlatSpec {

  val urlify = new Q_1_3_URLify

  "URLify" should "create correct url" in {
    val str = "A B C    "
    assert("A%20B%20C".toCharArray === urlify.unlify(str.toCharArray, 5))
  }

  it should "create correct url-another" in {
    val str = "Mr John Smith    "
    assert("Mr%20John%20Smith".toCharArray === urlify.unlify(str.toCharArray, 13))
  }

  it should "return same if no space in string" in {
    val str = "ABC"
    assert("ABC".toCharArray === urlify.unlify(str.toCharArray, 3))
  }

  it should "add %20 to end if space in end" in {
    val str = "ABC   "
    assert("ABC%20".toCharArray === urlify.unlify(str.toCharArray, 4))
  }
}
