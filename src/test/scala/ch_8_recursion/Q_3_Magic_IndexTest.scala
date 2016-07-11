package ch_8_recursion

import org.scalatest.FlatSpec

class Q_3_Magic_IndexTest extends FlatSpec {

  val magicIndex = new Q_3_Magic_Index

  "Find" should "magic index for the given array" in {
    assert(4 === magicIndex.find(Array(-1,0,1,2,4,8,9)))
  }

  "Find" should "magic index for the given array 2" in {
    assert(2 === magicIndex.find(Array(-1,0,2,4,5,8,9)))
  }
}
