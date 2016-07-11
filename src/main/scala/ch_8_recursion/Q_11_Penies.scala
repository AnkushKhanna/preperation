package ch_8_recursion

class Q_11_Penies {

  def permutation(n: Long): Long = {
    def permutation(n: Long, v: Array[Int], i: Int): Int = {
      n match {
        case 0 => 1
        case n if n < 0 || i == v.length => 0
        case n => permutation(n - v(i), v, i) + permutation(n, v, i + 1)
      }
    }
    permutation(n, Array(25, 10, 5, 1), 0)
  }
}
