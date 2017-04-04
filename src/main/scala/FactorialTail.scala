import scala.annotation.tailrec

object FactorialTail {
  def factorial(x: Int): Int = {
    @tailrec
    def accFactorial(acc: Int, x: Int): Int = {
      if(x==0) acc
      else accFactorial(acc*x,x-1)
    }
    accFactorial(1,x)
  }
}
