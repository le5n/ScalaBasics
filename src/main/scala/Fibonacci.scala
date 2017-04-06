object Fibonacci {
  def fibonacci(a: Int): Int = {
    if(a<=2) 1
    else fibonacci(a-1)+fibonacci(a-2)
  }
}
