package ch2_linked_list

sealed trait LinkedList[+A]

case class LL[A](head: A, tail: LinkedList[A]) extends LinkedList[Int]

case object LinkedListNil extends LinkedList[Nothing]

object Test {
  def main(args: Array[String]) {
    val x: LinkedList[Int] = LL(1, LL(2, LinkedListNil))

    x match {
      case (x1: Int) LL tail => println(x1)
    }
  }
}
