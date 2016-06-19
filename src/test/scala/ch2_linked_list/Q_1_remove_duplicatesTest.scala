package ch2_linked_list

import org.scalatest.FlatSpec

class Q_1_remove_duplicates_hash_map_Test extends FlatSpec {

  val removeDuplicates = new Q_1_remove_duplicates_with_hash_map

  "Remove Duplicates" should "remove duplicates from list [1, 3, 4, 5, 6, 1, 5, 8]" in {

    val list = List[Int](1, 3, 4, 5, 6, 1, 5, 8)

    assert(List(1, 3, 4, 5, 6, 8) === removeDuplicates.removeDuplicates(list))
  }

  it should "remove duplicates from list [1, 10, 20, 5, 6, 1, 5, 8]" in {

    val list = List[Int](1, 10, 20, 5, 6, 1, 5, 8)

    assert(List(1, 10, 20, 5, 6, 8) === removeDuplicates.removeDuplicates(list))
  }

  it should "not remove duplicates if list elements are unique" in {

    val list = List[Int](1, 10, 20, 5, 6, 23, 0, 8)

    assert(List(1, 10, 20, 5, 6, 23, 0, 8) === removeDuplicates.removeDuplicates(list))
  }

  it should "remove duplicates from list []" in {

    val list = List[Int]()

    assert(List() === removeDuplicates.removeDuplicates(list))
  }
}

class Q_1_remove_duplicates_reverse_Test extends FlatSpec {
  val removeDuplicates = new Q_1_remove_duplicates_with_reverse

  "Remove Duplicates" should "remove duplicates from list [1, 3, 4, 5, 6, 1, 5, 8]" in {

    val list = List[Int](1, 3, 4, 5, 6, 1, 5, 8)

    assert(List(1, 3, 4, 5, 6, 8) === removeDuplicates.removeDuplicates(list))
  }

  it should "remove duplicates from list [1, 10, 20, 5, 6, 1, 5, 8]" in {

    val list = List[Int](1, 10, 20, 5, 6, 1, 5, 8)

    assert(List(1, 10, 20, 5, 6, 8) === removeDuplicates.removeDuplicates(list))
  }

  it should "not remove duplicates if list elements are unique" in {

    val list = List[Int](1, 10, 20, 5, 6, 23, 0, 8)

    assert(List(1, 10, 20, 5, 6, 23, 0, 8) === removeDuplicates.removeDuplicates(list))
  }

  it should "remove duplicates from list []" in {

    val list = List[Int]()

    assert(List() === removeDuplicates.removeDuplicates(list))
  }
}
