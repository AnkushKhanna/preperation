package ch2_linked_list

import scala.collection.mutable

class Q_2_remove_k_to_last {

  def remove(list: mutable.ListBuffer[Int], k: Int) = {
    val index = list.size - k
    list.remove(index)
  }
}
