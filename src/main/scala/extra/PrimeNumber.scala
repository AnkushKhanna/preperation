package extra

class PrimeNumber {
  def findPrimes(n: Long): List[Long] = {

    if (n < 4) {
      return List.range[Long](1, n + 1)
    }

    val list = List.range[Long](4, n + 1)

    1L :: 2L :: 3L :: list.filter(isPrime)
  }

  def isPrime(n: Long): Boolean = {
    for (i <- 2L to Math.sqrt(n).toLong) {
      if (n % i == 0) {
        return false
      }
    }
    true
  }
}
