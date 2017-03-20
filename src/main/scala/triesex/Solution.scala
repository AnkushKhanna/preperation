package triesex

object Solution {


  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()
    var a0: Int = 0
    val tries = new Tries[Int]()
    while (a0 < n) {
      var op = sc.next()
      var contact = sc.next()
      if (op == "add") {
        tries.put(contact, 1)
      } else if (op == "find") {
        println(tries.findKeysByPrefix(contact))
      }
      a0 += 1
    }
  }

  class Tries[T] {

    class Node(val char: Option[Char], var value: Option[T] = Option.empty, var children: Array[Node] = new Array[Node](26))

    val root = new Node(char = Option.empty)

    def put(key: String, value: T): Unit = {
      put(key, value, root, 0)
    }

    def findKeysByPrefix(prefix: String): Int = {
      findNodeByPrefix(prefix) match {
        case None => 0
        case Some(n) =>
          val queue = new Array[Int](1)
          queue(0) = 0
          findKeysByPrefix(n, queue)
          queue(0)
      }
    }

    private def findKeysByPrefix(node: Node, queue: Array[Int]): Unit = {
      if (node == null) return
      if (node.value.isDefined) {
       queue(0) = queue(0) + 1
      }

      node.children.foreach(child => {
        if(child != null) {
          findKeysByPrefix(child, queue)
        }
      })
    }

    private def findNodeByPrefix(prefix: String): Option[Node] = {
      findNodeByPrefix(prefix, root, 0)
    }

    private def findNodeByPrefix(prefix: String, node: Node, index: Int): Option[Node] = {
      if (prefix.length == index) {
        return Some(node)
      }

      node.children(prefix.charAt(index)-97) match {
        case null => None
        case n => findNodeByPrefix(prefix, n, index + 1)
      }
    }

    private def put(key: String, value: T, node: Node, index: Int): Node = {

      if (key.length == index) {
        node.value = Some(value)
        return node
      }

      val nextNode =
        node.children(key.charAt(index)-97) match {
          case null =>
            val n = new Node(Some(key.charAt(index)))
            node.children(key.charAt(index)-97) = n
            n
          case n =>
            n
        }

      put(key, value, nextNode, index + 1)
    }
  }
}
