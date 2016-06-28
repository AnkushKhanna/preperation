package ch2_linked_list

class Q_3_Sum {


  def sum(l1: LinkedList[Int], l2: LinkedList[Int]): LinkedList[Int] = {
    sum(l1, l2, 0)
  }

  private def sum(l1: LinkedList[Int], l2: LinkedList[Int], carry: Int): LinkedList[Int] = {
    val pair: (LinkedList[Int], LinkedList[Int]) = (l1, l2)
    pair match {
      case (LinkedListNil, LinkedListNil) =>
        LinkedListNil
      case ((x1: Int) LL (tail1: LinkedList[Int]), LinkedListNil) =>
        val s1 = x1 + carry
        val c1 = s1 / 10
        val v1 = s1 % 10
        LL(v1, sum(tail1, LinkedListNil, c1))
      case (LinkedListNil, (x2: Int) LL (tail2: LinkedList[Int])) =>
        val s1 = x2 + carry
        val c1 = s1 / 10
        val v1 = s1 % 10
        LL(v1, sum(LinkedListNil, tail2, c1))
      case ((x1: Int) LL (tail1: LinkedList[Int]), (x2: Int) LL (tail2: LinkedList[Int])) =>
        val sum1: Int = x1 + x2 + carry
        val carry1 = sum1 / 10
        val value1 = sum1 % 10
        LL(value1, sum(tail1, tail2, carry1))
    }
  }
}
