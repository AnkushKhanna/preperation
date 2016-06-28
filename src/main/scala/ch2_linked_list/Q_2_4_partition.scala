package ch2_linked_list

class Q_2_4_partition {

  def partition(l: LinkedList[Int], value: Int): (LinkedList[Int],LinkedList[Int]) = {

    def partition(ll: LinkedList[Int], less: LinkedList[Int], more: LinkedList[Int]): (LinkedList[Int],LinkedList[Int]) = {
      ll match {
        case LinkedListNil =>
          (less, more)
        case (x: Int) LL (tail: LinkedList[Int]) if x < value =>
          partition(tail, LL(x, less), more)
        case (x: Int) LL (tail: LinkedList[Int]) =>
          partition(tail, less, LL(x, more))
      }
    }
    partition(l, LinkedListNil, LinkedListNil)
  }
}
