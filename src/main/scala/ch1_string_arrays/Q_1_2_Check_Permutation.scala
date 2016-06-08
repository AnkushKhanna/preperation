package ch1_string_arrays

/**
 * With Sorting
 **/
class Q_1_2_Check_Permutation_A {
  def isPermutation(str: String, check: String): Boolean = {
    if (str.length != check.length) {
      return false
    }
    val sortedStr = str.sorted
    val sortedCheck = check.sorted

    if (sortedStr != sortedCheck) {
      return false
    }
    true
  }
}

/**
 * Without Sorting
 **/
class Q_1_2_Check_Permutation_B {
  def isPermutation(str: String, check: String): Boolean = {
    if (str.length != check.length) {
      return false
    }
    val array = new Array[Int](128)

    for (ch <- str.toCharArray) {
      array(ch) += 1
    }
    for (ch <- check.toCharArray) {
      array(ch) -= 1
      if (array(ch) < 0) {
        return false
      }
    }

    true
  }
}

