package rationals

object Main {
  def main(args: Array[String]): Unit = {
    val a = new Rational(1, 3)
    val b = new Rational(5, 7)
    val c = new Rational(3, 2)

    println(a.sub(b).sub(c))
  }

}
