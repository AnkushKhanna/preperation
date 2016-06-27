package extra

import org.scalatest.FlatSpec

class PrimeNumberTest extends FlatSpec {

  val prime = new PrimeNumber

  "FindPrimes" should "find prime till 3" in {
    compare(1L :: 2L :: 3L :: Nil, prime.findPrimes(3))
  }

  it should "find prime till 9" in {
    compare(1L :: 2L :: 3L :: 5L :: 7L :: Nil, prime.findPrimes(9))
  }

  private def compare(answer: List[Long], result: List[Long]): Unit = {
    if (answer.size != result.size) {
      assert(false, "Does not equals")
    }

    assert(answer.sorted === result.sorted)

  }
}
