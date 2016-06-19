package ch2_linked_list

import scala.collection.mutable

class Q_1_remove_duplicates_with_hash_map {

  def removeDuplicates(list: List[Int]): List[Int] = {
    val map: mutable.Map[Int, Int] = mutable.Map[Int, Int]()
    removeDuplicates(list, map)
    list.reverse
  }

  private def removeDuplicates(list: List[Int], map: mutable.Map[Int, Int]): List[Int] = {
    list match {
      case Nil => List.empty
      case x :: tail if map.get(x) == Option.empty =>
        map += (x -> 1)
        x :: removeDuplicates(tail, map)
      case x :: tail if map.get(x).contains(1) =>
        removeDuplicates(tail, map)
    }
  }
}

class Q_1_remove_duplicates_with_reverse {

  def removeDuplicates(list: List[Int]): List[Int] = {
    val reverseList = list.reverse
    removeDuplicatesReverseList(reverseList).reverse
  }

  private def removeDuplicatesReverseList(reversList: List[Int]): List[Int] = {
    reversList match {
      case Nil => List.empty
      case x :: tail if tail.contains(x) => removeDuplicatesReverseList(tail)
      case x :: tail => x :: removeDuplicatesReverseList(tail)
    }
  }
}


