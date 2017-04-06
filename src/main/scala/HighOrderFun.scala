import scala.annotation.tailrec

object HighOrderFun {
  /*
  FIRST ORDER FUNCTION (WHICH DOESNT TAKE ANOTHER FUNCTIONS AS A PARAMETERS
  sum of all ints between a and b
   */
  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0
    else a + sumInts(a + 1, b)
  }

  /*
    HIGH ORDER FUNCTION (WHICH TAKES ANOTHER FUNCTION AS A PARAMETER)
    general idea of previous function
     */

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)
  }

  def sumTail(f: Int => Int, a: Int, b: Int): Int = {
    @tailrec
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }

    loop(a + 1, 0)
  }

  def pow(a: Int): Int = a * a

  def cube(a: Int): Int = a * a * a

  def fact(a: Int): Int = {
    if (a == 1) 1
    else a * fact(a - 1)
  }

  def main(args: Array[String]): Unit = {
    val a = 2
    val b = 4

    sum(pow, a, b)
    sum(cube, a, b)
    sum(fact, a, b)
    sum(FactorialTail.factorial, a, b)

    //anonymous functions

    sum(x => x * x * x, a, b)

    val fun = sum(x => {
      if (x == 1) 1
      else x * fact(x - 1)
    }, a, b)

    println(fun)
  }
}
