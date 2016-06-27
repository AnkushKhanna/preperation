package extra

class MergeRanges {

  def merge(ranges: List[Range]): List[Range] = {
    mergeSorted(ranges.sortBy(x => (x.l1, x.l2)))
  }

  private def mergeSorted(ranges: List[Range]): List[Range] = {
    ranges match {
      case Nil => Nil
      case r1 :: Nil => r1 :: Nil
      case r1 :: r2 :: tail if r1.isMergeable(r2) => mergeSorted(r1.merge(r2) :: tail)
      case r1 :: r2 :: tail => r1 :: mergeSorted(r2 :: tail)
    }
  }

}

class Range(val l1: Int, val l2: Int) {

  require(l1 < l2)

  def isMergeable(that: Range): Boolean = {
    requirement(that)

    if (this.l2 >= that.l1) {
      return true
    }
    false
  }

  def merge(that: Range): Range = {
    requirement(that)

    val term =
      if (this.l2 > that.l2) {
        this.l2
      } else {
        that.l2
      }
    new Range(this.l1, term)
  }


  private def requirement(that: Range): Unit = {
    require(this.l1 <= that.l1)
    if (this.l1 == that.l1) {
      require(this.l2 <= that.l2)
    }
  }
}
