package ch_8_recursion

import org.scalatest.FlatSpec

class Q_11_PeniesTest extends FlatSpec {
  val penies = new Q_11_Penies

  "Permutation" should "return correct permutation count" in {
    assert(4 === penies.permutation(10))
    println(penies.permutation(50))
  }
}
