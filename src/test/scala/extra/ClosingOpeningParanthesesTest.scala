package extra

import org.scalatest.FlatSpec

class ClosingOpeningParenthesesTest extends FlatSpec {

  val paran = new ClosingOpeningParentheses

  "Check" should "return true when correct" in {
    assert(true === paran.check("aaa()adsd(()sdsdsd)dsdsdsd"))
  }

  it should "return false when correct" in {
    assert(false === paran.check("aaa()adsd(())))))))))sdsdsd)dsdsdsd"))
  }
}
