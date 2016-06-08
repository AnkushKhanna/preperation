package ch1_string_arrays

import org.scalatest.FlatSpec

class Q_1_2_Check_Permutation_ATest extends FlatSpec {

  val checkPermutation = new Q_1_2_Check_Permutation_A

  "CheckPermutation" should "return true if strings are same" in {
    assert(true === checkPermutation.isPermutation("abc", "abc"))
    assert(true === checkPermutation.isPermutation("abc", "bca"))
    assert(true === checkPermutation.isPermutation("abc", "cab"))
  }

  it should "return false if string are different" in {
    assert(false === checkPermutation.isPermutation("abc", "defff"))
  }

  it should "return true if string are permuted reverse" in {
    assert(true === checkPermutation.isPermutation("abc", "cba"))
  }

  it should "return false if string are not same but of equal length" in {
    assert(false === checkPermutation.isPermutation("abc", "abv"))
  }
}

class Q_1_2_Check_Permutation_BTest extends FlatSpec {

  val checkPermutation = new Q_1_2_Check_Permutation_B

  "CheckPermutation" should "return true if strings are same" in {
    assert(true === checkPermutation.isPermutation("abc", "abc"))
    assert(true === checkPermutation.isPermutation("abc", "bca"))
    assert(true === checkPermutation.isPermutation("abc", "cab"))
  }

  it should "return false if string are different" in {
    assert(false === checkPermutation.isPermutation("abc", "defff"))
  }

  it should "return true if string are permuted reverse" in {
    assert(true === checkPermutation.isPermutation("abc", "cba"))
  }

  it should "return false if string are not same but of equal length" in {
    assert(false === checkPermutation.isPermutation("abc", "abv"))
  }
}
