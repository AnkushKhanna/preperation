package graph

import java.util.StringJoiner

import scala.collection.mutable


class Graph {

  private val nodes: mutable.Map[String, Node] = mutable.Map()


  case class Edge(weight: Long, destinationNode: Node)

  case class Node(id: String, var edges: List[Edge])

  def addNode(id: String): Node = {
    nodes.getOrElseUpdate(id, Node(id, List()))
  }

  def addEntry(startId: String, destinationId: String, weight: Long) = {
    val startNode = addNode(startId)
    val destinationNode = addNode(destinationId)

    startNode.edges = Edge(weight, destinationNode) :: startNode.edges
  }

  def get(id: String) = {
    nodes.get(id)
  }

//  override def toString: String = {
//    val joiner = new StringJoiner("\n")
//    joiner.add("\nGRAPH:")
//    nodes.foreach(n => joiner.add(n._2.toString))
//    joiner.add("\n")
//    joiner.toString
//  }
}

class FindStuff(g: Graph) {

  def reachable(startId: String, destinationId: String) = {
    def reachable(edges: List[g.Edge], destinationNode: g.Node, visited: List[g.Node]): Boolean = {
      edges match {
        case Nil => false
        case head :: tail if head.destinationNode == destinationNode => true
        case head :: tail =>
          if (visited.contains(head.destinationNode)) {
            reachable(tail, destinationNode, visited)
          } else {
            reachable(head.destinationNode.edges.toList, destinationNode, head.destinationNode :: visited) || reachable(tail, destinationNode, visited)
          }
      }
    }

    val start = g.get(startId).get
    val destination = g.get(destinationId).get

    reachable(start.edges.toList, destination, List(start))
  }

  def reachablePath(startId: String, destinationId: String)= {
    var minDistance = -1L
    def reachablePath(edges: List[g.Edge], destinationNode: g.Node, visited: List[g.Node], path: List[g.Node], travelledDistance: Long): List[g.Node] = {
      edges match {
        case e if minDistance > 0 && travelledDistance > minDistance => Nil
        case Nil => Nil
        case e :: es if e.destinationNode == destinationNode =>
          minDistance = e.weight + travelledDistance
          e.destinationNode :: path
        case e :: es =>
          if (visited.contains(e.destinationNode)) {
            reachablePath(es, destinationNode, visited, path, travelledDistance)
          } else {
            val h = reachablePath(e.destinationNode.edges.toList, destinationNode, e.destinationNode :: visited, e.destinationNode :: path, travelledDistance + e.weight)
            val v = reachablePath(es, destinationNode, visited, path, travelledDistance)
            if (calculateCost(h) > calculateCost(v)) v else h
          }
      }

    }

    val start = g.get(startId).get
    val destination = g.get(destinationId).get

    println(reachablePath(start.edges, destination, List(start), List(start), 0))
  }

  private def calculateCost(path: List[g.Node]): Long = {
    path match {
      case Nil => Long.MaxValue
      case n1 :: n2 :: Nil => n2.edges.find(_.destinationNode == n1).get.weight
      case n1 :: n2 :: tail => n2.edges.find(_.destinationNode == n1).get.weight + calculateCost(n2 :: tail)
    }
  }
}


object Start {
  def main(args: Array[String]): Unit = {

    val graph = new Graph

    graph.addEntry("a", "b", 12L)
    graph.addEntry("a", "c", 10L)
    graph.addEntry("b", "d", 9L)
    graph.addEntry("d", "b", 9L)
    graph.addEntry("d", "a", 4L)
    graph.addEntry("d", "c", 4L)
    graph.addEntry("f", "c", 4L)
    graph.addEntry("c", "d", 14L)
    //    graph.addEntry("c", "f", 5L)

//    println(graph)

    val find = new FindStuff(graph)

    //    println(find.shortestPathLess("b", "c"))
    println(find.reachablePath("b", "c"))
    println(find.reachablePath("a", "b"))
    println(find.reachablePath("c", "f"))

  }
}
