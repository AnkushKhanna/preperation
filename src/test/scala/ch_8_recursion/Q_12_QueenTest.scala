package ch_8_recursion

import org.scalatest.FlatSpec

class Q_12_QueenTest extends FlatSpec {

  val queen = new Q_12_Queen

  "SetQueen" should "Return correct order for 4x4 matrix" in {
    println(queen.setQueen(4))
  }

}
