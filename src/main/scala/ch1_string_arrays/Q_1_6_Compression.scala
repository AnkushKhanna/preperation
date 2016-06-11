package ch1_string_arrays

class Q_1_6_Compression {

  def compress(str: String): String = {
    val compressed = compress(str.toList, "", 0)
    if (compressed.length < str.length) {
      compressed
    } else {
      str
    }
  }

  private def compress(str: List[Char], compressed: String, count: Int): String = {
    str match {
      case Nil => compressed
      case x :: Nil => compressed + x + (count + 1)
      case x :: y :: tail if x == y => compress(y :: tail, compressed, count + 1)
      case x :: y :: tail => compress(y :: tail, compressed + x + (count + 1), 0)
    }
  }
}
