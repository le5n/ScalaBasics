object SimpleFunctions {
  val pi = 3.14159

  def square(x: Double): Double = x * x

  def sumOfSquares(x: Double, y: Double): Double = square(x) + square(y)

  def divide(x: Double, y: Double): Double = x / y

  def and(x: Boolean, y: => Boolean): Boolean = if (x) y else false
}


/*
CALL BY NAME (first all values, then functions itself)

sumOfSquares(3, 2 + 2)
→ sumOfSquares(3, 4)
→ square(3) + square(4)
→ 3 * 3 + square(4)
→ 9 + square(4)
→ 9 + 4 * 4
→ 9 + 16
→ 25
 */

/*
CALL BY VALUE (first functions, then values)

sumOfSquares(3, 2 + 2)
→ square(3) + square(2 + 2)
→ 3 * 3 + square(2 + 2)
→ 9 + square(2  + 2)
→ 9 + (2 + 2) * (2 + 2)
→ 9 + 4 * (2 + 2)
→ 9 + 4 * 4
→ 9 + 16
→ 25

 */

