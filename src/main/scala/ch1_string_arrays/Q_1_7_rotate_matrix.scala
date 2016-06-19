package ch1_string_arrays

class Q_1_7_rotate_matrix {

  def rotateBy90Degree(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    require(matrix.length > 1)
    require(squareMatrix(matrix))

    val length = matrix.length
    val result: Array[Array[Int]] = Array.ofDim[Int](length, length)
    var columnIndex = 0
    for (row <- matrix) {
      var index = 0
      for (value <- row) {
        result(index)(length - columnIndex - 1) = value
        index += 1
      }
      columnIndex += 1
    }
    result
  }

  def rotateBy90InPlace(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    require(matrix.length > 1)
    require(squareMatrix(matrix))

    matrix;
  }


  private def squareMatrix(matrix: Array[Array[Int]]): Boolean = {
    val l = matrix.length

    val result = for {
      row <- matrix
      if row.length != l
    } yield false
    result.length == 0
  }
}
