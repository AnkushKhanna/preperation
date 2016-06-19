package ch1_string_arrays

class Q_1_8_zero_matrix {


  def zeroMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val zeroMatrix: Array[Array[Int]] = readMatrix(matrix)

    val firstRow = zeroMatrix(0)
    for (column <- firstRow.indices) {
      if (firstRow(column) == 0) {
        setColumnToZero(zeroMatrix, column)
      }
    }

    for (row <- zeroMatrix.indices) {
      if (zeroMatrix(row)(0) == 0) {
        setRowToZero(zeroMatrix, row)
      }
    }

    zeroMatrix
  }

  private def setRowToZero(zeroMatrix: Array[Array[Int]], row: Int) = {
    zeroMatrix(row) = Array.fill(zeroMatrix(row).length)(0)
  }

  private def setColumnToZero(zeroMatrix: Array[Array[Int]], column: Int) = {
    for (row <- zeroMatrix.indices) {
      zeroMatrix(row)(column) = 0
    }
    zeroMatrix
  }

  def readMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    for (row <- matrix.indices) {
      for (column <- matrix(row).indices) {
        if (matrix(row)(column) == 0) {
          matrix(0)(column) = 0
          matrix(row)(0) = 0
        }
      }
    }
    matrix
  }
}
