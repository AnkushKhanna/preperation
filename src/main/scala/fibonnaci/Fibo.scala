package fibonnaci

class Fibo {
  def fibonacci(x: Int): Int = {
    val memory = new Array[Int](x + 1)

    fibonacci(x, memory)
  }

  def fibonacci(x: Int, memory: Array[Int]): Int = {

    if(x == 1) {
      return 0
    }

    if (x == 2) {
      return 1
    }

    memory(x) = fibonacci(x - 2, memory) + fibonacci(x - 1, memory)
    memory(x)
  }

  def main(args: Array[String]) {
    /** This will handle the input and output **/
    println(fibonacci(readInt()))

  }
}
