package ch_8_recursion

class Q_4_Power_Set {


  def powerSet(set: Set[Int]): List[List[Int]] = {
    powerSet(set.toList)
  }

  private def powerSet(list: List[Int]): List[List[Int]] = {
    list match {
      case Nil => Nil
      case head :: Nil => List(List(head))
      case head :: tail =>
        val v: List[List[Int]] = powerSet(tail)
        List(head) :: v.map(head :: _) ++ v
    }
  }
}
