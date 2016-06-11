package ch1_string_arrays

import org.scalatest.FlatSpec

class Unique_1_1Test extends FlatSpec {

  val uniqueTest = new Unique_1_1

  "uniqueCharacters" should "return true if string is unique" in {
    assert(true === uniqueTest.uniqueCharacters("abc"))
  }

  it should "return false if string is not unique" in {
    assert(false ===  uniqueTest.uniqueCharacters("aac"))
  }

  it should "return true if string in empty" in {
    assert(true === uniqueTest.uniqueCharacters(""))
  }
}

class Unique_1_1_B_Test extends FlatSpec {
  val uniqueTest = new Unique_1_1_B

  "uniqueCharacters" should "return true if string is unique" in {
    assert(true === uniqueTest.uniqueCharacters("ABbc"))
  }

  it should "return false if string is not unique" in {
    assert(false ===  uniqueTest.uniqueCharacters("aac"))
  }

  it should "return true if string in empty" in {
    assert(true === uniqueTest.uniqueCharacters(""))
  }
}
