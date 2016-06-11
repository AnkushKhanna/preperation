package ch1_string_arrays

class Q_1_5_Edits {

  def zero_or_one_edit(str1: String, str2: String): Boolean = {
    if (str1 == str2) {
      return true
    }

    if (Math.abs(str1.length - str2.length) > 1) {
      return false
    }

    val replace = str1.length == str2.length

    val (array1, array2) =
      if (str1.length > str2.length) {
        (str2.toCharArray, str1.toCharArray)
      } else {
        (str1.toCharArray, str2.toCharArray)
      }

    val edit = edits(array1.toList, array2.toList, 0, replace)

    edit == 1 || edit == 0
  }

  private def edits(array1: List[Char], array2: List[Char], edit: Int, replace: Boolean): Int = {
    (array1, array2) match {
      case (Nil, Nil) => edit
      case (x :: Nil, Nil) => edit + 1
      case (Nil, x :: Nil) => edit + 1
      case (_, Nil) => edit
      case (x1 :: tail1, x2 :: tail2) if x1 == x2 => edits(tail1, tail2, edit, replace)
      case (x1 :: tail1, x2 :: tail2) if replace => edits(tail1, tail2, edit + 1, replace = false)
      case (x1 :: tail1, x2 :: tail2) => edits(x1 :: tail1, tail2, edit + 1, replace)
    }
  }

}
