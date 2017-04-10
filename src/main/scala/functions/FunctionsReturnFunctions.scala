package functions

import simpleAlgorithms.FactorialTail

object FunctionsReturnFunctions {
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0
      else f(a) + sumF(a + 1, b)
    }

    sumF
  }

  def shortSum(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum(f)(a + 1, b)
  }

  def main(args: Array[String]): Unit = {
    sum(x => x * x)(1, 10)

    def sumCubes = sum(x => x * x * x)

    sumCubes(2, 6)

    def sumfact = sum(FactorialTail.factorial)

    sumfact(1, 5)

    shortSum(x => x * x)(2, 10)
  }
}
