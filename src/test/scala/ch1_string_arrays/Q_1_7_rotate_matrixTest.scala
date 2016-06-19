package ch1_string_arrays

import org.scalatest.FlatSpec

class Q_1_7_rotate_matrixTest extends FlatSpec {

  val rotateMatrix = new Q_1_7_rotate_matrix

  "RotateMatrix" should "rotate [2*2] matrix by 90 degrees" in {
    val matrix = Array(Array(1, 2), Array(3, 4))

    val result = Array(Array(3, 1), Array(4, 2))

    assert(result === rotateMatrix.rotateBy90Degree(matrix))
  }

  it should "rotate [4*4] matrix by 90 degree" in {
    val matrix = Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8), Array(9, 10, 11, 12), Array(13, 14, 15, 16))

    val result = Array(Array(13, 9, 5, 1), Array(14, 10, 6, 2), Array(15, 11, 7, 3), Array(16, 12, 8, 4))

    assert(result === rotateMatrix.rotateBy90Degree(matrix))
  }

  "RotateMatrix" should "give error for a non square matrix [1*2]" in {
    val matrix = Array(Array(1), Array(3, 4))
    intercept[IllegalArgumentException] {
      rotateMatrix.rotateBy90Degree(matrix)
    }
  }
}
