package ch_8_recursion

import org.scalatest.FlatSpec

class Q_2_RobotTest extends FlatSpec {

  val robot = new Q_2_Robot

  "Reach" should "return correct path" in {
    assert(List("D", "D", "D", "R", "R", "R") === robot.reach(4, 4, List.empty))
  }

  "Reach" should "return correct path with not allowed" in {
    assert(List("D", "R", "R", "D") === robot.reach(3, 3, List((0, 1))))
    assert(List("R", "R", "D", "D") === robot.reach(3, 3, List((0, 1), (1, 1))))
  }

  "Reach" should "return Nil when no path is available" in {
    assert(Nil === robot.reach(3, 3, List((0, 1), (1, 1), (1, 0))))
  }
}
