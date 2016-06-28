package ch2_linked_list

import org.scalatest.FlatSpec

class Q_3_SumTest extends FlatSpec {
  val sum = new Q_3_Sum

  "Sum" should "add two LinkedList" in {
    val l1 = LL(7, LL(1, LL(6, LinkedListNil)))
    val l2 = LL(5, LL(9, LL(2, LinkedListNil)))

    val answer = LL(2, LL(1, LL(9, LinkedListNil)))

    assert(answer === sum.sum(l1, l2))
  }

  "Sum" should "add two LL with different size" in {
    val l1 = LL(8, LL(5, LL(9, LinkedListNil)))
    val l2 = LL(5, LL(9, LL(2, LL(7, LinkedListNil))))

    val answer = LL(3, LL(5, LL(2, LL(8, LinkedListNil))))

    assert(answer === sum.sum(l1, l2))
  }
}
