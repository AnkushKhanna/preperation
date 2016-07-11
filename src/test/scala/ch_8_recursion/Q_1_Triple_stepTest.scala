package ch_8_recursion

import org.scalatest.FlatSpec

class Q_1_Triple_stepTest extends FlatSpec {

  val tripleStep = new Q_1_Triple_step

  "Possibilities" should "return triple steps possibility" in {
    assert(121415 === tripleStep.possibilities(20))
  }
}
