package ch1_string_arrays

import org.scalatest.FlatSpec

class Q_1_6_CompressionTest extends FlatSpec {

  val compress = new Q_1_6_Compression

  "Compress" should "compress [aabbccc]" in {
    assert("a2b2c3" === compress.compress("aabbccc"))
  }

  it should "not compress [aabbcc], becuase of same length" in {
    assert("aabbcc" === compress.compress("aabbcc"))
  }

  it should "compress a [aabcccccaaa]" in {
    assert("a2b1c5a3" === compress.compress("aabcccccaaa"))
  }
}
