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


//sealed trait Graph[+A] {
//  def ::[A](head: A) = GG(head, this)
//}

//case class GG[A](head: A, tail: List[(Graph[A], Long)]) extends Graph[String]
//
//case object Helper{
//  def gg[A](head: A, tail: List[(Graph[A], Long)]) = GG(head, tail)
//}
//
//case object NilNode extends Graph[Nothing]
//
//object TestGraph {
//
//  def main(args: Array[String]): Unit = {
//    val l: List[(GG[String], Long)] = (GG("b", (NilNode, 0L) :: Nil), 5L) :: (GG("c", (NilNode, 0L) :: Nil), 6L) :: Nil
//    val x: Graph[String] = gg("a", l)
//
//    x gg
//
//    x match {
//      case v GG tail => println(tail)
//    }
//  }
//}

abstract class Graph {
  type Edge
  type Node <: NodeIntf

  abstract class NodeIntf {

    val id: String

    def connectWith(node: Node): Edge
  }

  def nodes: List[Node]

  def edges: List[Edge]

  def addNode(id: String): Node
}

abstract class DirectedGraph extends Graph {
  type Edge <: EdgeImpl

  class EdgeImpl(origin: Node, dest: Node) {
    def from = origin

    def to = dest
  }

  class NodeImpl(override val id: String) extends NodeIntf {
    self: Node =>
    def connectWith(node: Node): Edge = {
      val edge = newEdge(this, node)
      edges = edge :: edges
      edge
    }
  }

  protected def newNode(id:String): Node

  protected def newEdge(from: Node, to: Node): Edge

  var nodes: List[Node] = Nil
  var edges: List[Edge] = Nil

  def addNode(id: String): Node = {
    val node = newNode(id)
    nodes = node :: nodes
    node
  }
}
class ConcreteDirectedGraph extends DirectedGraph {
  type Edge = EdgeImpl
  type Node = NodeImpl
  protected def newNode(id: String): Node = new NodeImpl(id)
  protected def newEdge(f: Node, t: Node): Edge =
    new EdgeImpl(f, t)
}

object Start{
  def main(args: Array[String]): Unit = {
    val g: Graph = new ConcreteDirectedGraph
    val n1: g.Node = g.addNode("a")
    println(n1.id)
    val n2 = g.addNode("b")
    val n3 = g.addNode("c")
    n1.connectWith(n2)
    n2.connectWith(n3)
    n1.connectWith(n3)

    println(g.nodes.map(_.id))
    println(g.edges)
  }
}
