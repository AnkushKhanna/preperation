package ch_8_recursion

import org.scalatest.FlatSpec

class Q_9_ParanesTest extends FlatSpec {

  val paranes = new Q_9_Paranes

  "Parens" should "return correct pattern" in {
    assert(List("(()())", "((()))", "()()()", "(())()", "()(())").toSet === paranes.validParanes(3).toSet)
  }
}
