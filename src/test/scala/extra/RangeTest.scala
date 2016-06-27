package extra

import org.scalatest.FlatSpec

class RangeTest extends FlatSpec {

  "isMergeable" should "check requirements" in {
    val r1 = new Range(2, 5)
    val r2 = new Range(1, 3)
    intercept[IllegalArgumentException] {
      r1.isMergeable(r2)
    }

    val r11 = new Range(2, 5)
    val r22 = new Range(2, 3)
    intercept[IllegalArgumentException] {
      r11.isMergeable(r22)
    }
  }

  it should "return true if mergeable" in {
    val r1 = new Range(2, 5)
    val r2 = new Range(4, 9)

    assert(true === r1.isMergeable(r2))
  }

  it should "return true if mergeable with equals" in {
    val r1 = new Range(2, 4)
    val r2 = new Range(4, 9)

    assert(true === r1.isMergeable(r2))
  }

  "Merge" should "return correct range on merging" in {
    val r1 = new Range(2, 4)
    val r2 = new Range(4, 9)

    checkRange(new Range(2, 9) , r1.merge(r2))
  }

  it should "return correct range on merging 2" in {
    val r1 = new Range(2, 9)
    val r2 = new Range(4, 9)

    checkRange(new Range(2, 9) , r1.merge(r2))
  }

  it should "return correct range on merging 3" in {
    val r1 = new Range(2, 7)
    val r2 = new Range(4, 7)

    checkRange(new Range(2, 7) , r1.merge(r2))
  }

  private def checkRange(r1: Range, r2: Range): Unit = {
    assert(r1.l1 === r2.l1)
    assert(r1.l2 === r2.l2)
  }
}
