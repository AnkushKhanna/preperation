package ch1_string_arrays

import org.scalatest.FlatSpec

class Q_1_8_zero_matrixTest extends FlatSpec {

  val zeroMatrix = new Q_1_8_zero_matrix

  "ReadMatrix" should "return zero head of column and row" in {
    val matrix = Array(Array(1, 2, 3), Array(3, 0, 5))

    val result = Array(Array(1, 0, 3), Array(0, 0, 5))

    assert(result === zeroMatrix.readMatrix(matrix))
  }

  "ZeroMatrix" should "return zero matrix" in {
    val matrix = Array(Array(1, 5, 3), Array(1, 0, 7), Array(5, 6, 7))

    val result = Array(Array(1, 0, 3), Array(0, 0, 0), Array(5, 0, 7))

    assert(result === zeroMatrix.zeroMatrix(matrix))
  }

  it should "return zero matrix for [4*3]" in {
    val matrix = Array(Array(1, 5, 3, 6), Array(1, 0, 7, 8), Array(5, 6, 7, 0))

    val result = Array(Array(1, 0, 3, 0), Array(0, 0, 0, 0), Array(0, 0, 0, 0))

    assert(result === zeroMatrix.zeroMatrix(matrix))
  }
}
