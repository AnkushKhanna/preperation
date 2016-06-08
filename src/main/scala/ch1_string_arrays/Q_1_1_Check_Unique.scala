package ch1_string_arrays

class Unique_1_1 {

  def uniqueCharacters(str: String): Boolean = {
    var map: Map[Char, Int] = Map.empty
    for (ch <- str.toCharArray) {
      val value: Int = map.getOrElse(ch, 0)
      if (value > 0) {
        return false
      }
      map = map + (ch -> (1 + value))
    }

    true
  }
}

class Unique_1_1_B {
  def uniqueCharacters(str: String): Boolean = {
    val array = new Array[Int](128)
    for (ch <- str.toCharArray) {
      val value = array(ch)
      if (value > 0) {
        return false
      }
      array(ch) = 1
    }
    true
  }

}
