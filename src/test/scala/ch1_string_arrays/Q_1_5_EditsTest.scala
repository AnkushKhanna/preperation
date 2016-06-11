package ch1_string_arrays

import org.scalatest.FlatSpec

class Q_1_5_EditsTest extends FlatSpec {

  val edits = new Q_1_5_Edits

  "zero_or_one_edit" should "return true for zero edits" in {
    assert(true === edits.zero_or_one_edit("abc", "abc"))
  }

  it should "return true for one edit" in {
    assert(true === edits.zero_or_one_edit("pale", "ple"))
  }
  it should "return true for one edit [pales]" in {
    assert(true === edits.zero_or_one_edit("pales", "pale"))
  }

  it should "return false for two edit [paless]" in {
    assert(false === edits.zero_or_one_edit("paless", "pale"))
  }

  it should "return false for two edit [blake]" in {
    assert(false === edits.zero_or_one_edit("pale", "blake"))
  }
}
