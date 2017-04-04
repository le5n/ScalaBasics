object SqrNewton {

  def main(args: Array[String]): Unit = {
    println(sqrt(10))
  }

  def sqrt(x: Double): Double = sqrtIter(1D, x)

  def sqrtIter(guess: Double, x: Double): Double = {
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)
  }

  def isGoodEnough(guess: Double, x: Double): Boolean = {
    (guess * guess - x).abs /x < 0.001
  }

  def improve(guess: Double, x: Double): Double = {
    (guess + x / guess) / 2
  }
}

