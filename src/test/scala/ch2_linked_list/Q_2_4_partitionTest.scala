package ch2_linked_list

import org.scalatest.FlatSpec

class Q_2_4_partitionTest extends FlatSpec {

  val partition = new Q_2_4_partition

  "Partition" should "partition the list from value" in {
    val l: LinkedList[Int] = LL(1, LL(6, LL(5, LL(2, LL(8, LinkedListNil)))))

    println(partition.partition(l, 5))
  }
}
