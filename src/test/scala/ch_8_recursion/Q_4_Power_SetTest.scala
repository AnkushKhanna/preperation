package ch_8_recursion

import org.scalatest.FlatSpec

class Q_4_Power_SetTest extends FlatSpec {

  val powerSet = new Q_4_Power_Set

  "Power Set" should "return following power set" in {
    assert(List(List(1, 2), List(1), List(2)).toSet === powerSet.powerSet(Set(1, 2)).toSet)
    assert(List(List(1, 2, 3), List(1, 2), List(1, 3), List(2, 3), List(1), List(2), List(3)).toSet === powerSet.powerSet(Set(1, 2, 3)).toSet)
  }

}
