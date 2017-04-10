package rationals

class Rational(x: Int, y: Int) {
  def numer: Int = x

  def denom: Int = y

  def add(that: Rational): Rational = {
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  }

  def neg: Rational = {
    new Rational(-numer, denom)
  }

  def sub(that: Rational): Rational = add(that.neg)


  override def toString = s"Rational($numer, $denom)"
}

