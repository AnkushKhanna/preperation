package ch_8_recursion

class Q_1_Triple_step {

  def possibilities(n: Long): Long = {
    n match {
      case n if n < 0 => 0
      case n if n == 0 => 1
      case n => possibilities(n - 1) + possibilities(n - 2) + possibilities(n - 3)
    }
  }
}
