package extra

import org.scalatest.FlatSpec

class MergeRangesTest extends FlatSpec {
  val mergeRanges = new MergeRanges

  "Merge" should "merge the Ranges" in {
    val ranges = mergeRanges.merge(new Range(4, 5) :: new Range(9, 12) :: new Range(3, 7) :: Nil)

    checkRanges(new Range(3, 7) :: new Range(9, 12) :: Nil, mergeRanges.merge(ranges))

  }

  it should "merge the Ranges 2" in {
    val ranges = mergeRanges.merge(new Range(4, 5) :: new Range(6, 10) :: new Range(3, 7) :: Nil)

    checkRanges(new Range(3, 10) :: Nil, mergeRanges.merge(ranges))

  }

  private def checkRanges(answer: List[Range], result: List[Range]) = {
    if (answer.size != result.size) {
      assert(false, "Ranges did not equal results.")
    }

    for (i <- answer.indices) {
      val a = answer(i)
      val r = result(i)
      if (a.l1 != r.l1 || a.l2 != r.l2) {
        assert(false, s"Result failed, ${a.l1} === ${r.l1}, ${a.l2} === ${r.l2}")
      }
    }
  }
}
