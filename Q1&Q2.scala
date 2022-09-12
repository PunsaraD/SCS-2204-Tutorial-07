case class RationalNumber(a: Int, b: Int){
    
    def this(a: Int) = this(a, 1)

    private def GCD(x: Int, y: Int): Int = if (y == 0) x.abs else GCD(y, (x % y))
    
    private def gcd = GCD(b, a)
    private def numer = a / gcd
    private def denom =b / gcd
    
    def -(that: RationalNumber) = RationalNumber(numer * that.denom - that.numer * denom, denom * that.denom)
    override def toString = s"$numer/$denom"
    
}

object MyApp extends App{
        val x = new RationalNumber(3, 4)
        val y = new RationalNumber(5, 8)
        val z = new RationalNumber(2, 7)

        println(x - y - z)
}