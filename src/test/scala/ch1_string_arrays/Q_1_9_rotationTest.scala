package ch1_string_arrays

import org.scalatest.FlatSpec

class Q_1_9_rotationTest extends FlatSpec {

  val rotation = new Q_1_9_rotation

  "Rotation" should "check if one string is the rotation of the other" in {
    assert(true === rotation.isRotation("waterbottle", "erbottlewat"))
    assert(true === rotation.isRotation("apple", "pleap"))
    assert(false === rotation.isRotation("camera", "macera"))
  }
}
