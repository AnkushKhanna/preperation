package ch_8_recursion

class Q_2_Robot {


  /**
   * return: List[R,D,R,D,R,R]
   **/
  def reach(row: Long, column: Long, notAllowed: List[(Int, Int)]): List[String] = {

    require(!notAllowed.contains((0, 0)), "Not allowed list cannot contain (0, 0), because that is where we are reaching")

    def move(row: Long, column: Long): (Boolean, List[String]) = {
      (row, column) match {
        case (0, 0) => (true, Nil)
        case (r, c) if valid(r, c) =>
          move(row - 1, c) match {
            case (true, tail) => (true, "D" :: tail)
            case _ =>
              move(r, c - 1) match {
                case (true, tail) => (true, "R" :: tail)
                case _ => (false, Nil)
              }
          }
        case _ => (false, Nil)
      }
    }

    def valid(row: Long, column: Long): Boolean = {
      (row, column) match {
        case (r, c) if r < 0 => false
        case (r, c) if c < 0 => false
        case (r, c) if notAllowed.contains(r, c) => false
        case _ => true
      }
    }

    val moves = move(row - 1, column - 1)

    if (moves._1) {
      moves._2
    } else {
      Nil
    }
  }
}
