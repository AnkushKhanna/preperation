package ch1_string_arrays

class Q_1_9_rotation {

  def isRotation(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length) {
      return false
    }

    val s1s1 = s1 + s1
    isSubstring(s1s1, s2)
  }

  private def isSubstring(s1: String, s2: String) = {
    if (s1.indexOf(s2) >= 0) {
      true
    } else {
      false
    }
  }

}
