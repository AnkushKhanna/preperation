package ch_8_recursion

class Q_9_Paranes {


  def validParanes(n: Int): List[String] = {
    validParanes(n, n)
  }

  private def validParanes(nOp: Int, nCl: Int): List[String] = {
    (nOp, nCl) match {
      case (1, 1) => List("()")
      case (nOp, nCl) =>
        val s1: List[String] = validParanes(nOp - 1, nCl - 1)
        val v1 = s1.map("(" + _ + ")")
        val v2 = s1.map("()" + _)
        val v3 = s1.map(_ + "()")
        (v1 ++ v2 ++ v3).distinct
    }
  }
}
