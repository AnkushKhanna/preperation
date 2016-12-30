package ch_8_recursion

class Q_12_Queen {


  def setQueen(n: Int): List[Int] = {
    setQueen(0, 0, n, Array.fill(n)(-1))._2
  }

  private def setQueen(row: Int, column: Int, n: Int, location: Array[Int]): (Boolean, List[Int]) = {
    if (n == row) {
      return (true, location.toList)
    }

    if (column == n) {
      return (false, Nil)
    }

    if (validLocation(row, column, n, location)) {
      location(row) = column
      val nextQueen = setQueen(row + 1, 0, n, location)
      if (!nextQueen._1) {
        setQueen(row + 1, column + 1, n, location)
      } else {
        nextQueen
      }
    } else {
      setQueen(row, column + 1, n, location)
    }
  }

  private def validLocation(row: Int, column: Int, n: Int, location: Array[Int]): Boolean = {
    if(row == 0 && column == 0){
      return true
    }
    if (location.isEmpty) {
      return true
    }
    if (location.contains(column)) {
      return false
    }
    for (i <- 0 to row) {
      if(location(i) == column - row -i){
        return false
      }
    }
    return true
  }
}
