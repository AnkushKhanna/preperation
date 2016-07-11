package ch_8_recursion

class Q_3_Magic_Index {

  def find(array: Array[Int]): Int = {
    def find(start: Int, end: Int): Int = {
      val mid = (start + end) / 2
      if(mid == array(mid)) mid
      else if (mid < array(mid)) find(start, mid)
      else find(mid, end)
    }

    find(0, array.length)
  }
}
