package ch1_string_arrays

class Q_1_3_URLify {

  private val replace = "%20"

  def unlify(array: Array[Char], size: Int): Array[Char] = {
    var space = array.length - size
    if (space != 0) {
      for (i <- size - 1 to 0 by -1) {
        val character = array(i)
        if (character != ' ') {
          array(i + space) = character
        } else {
          array(i + space) = '0'
          array(i + space - 1) = '2'
          array(i + space - 2) = '%'
          space -= 2
        }
      }
    }
    array
  }
}
