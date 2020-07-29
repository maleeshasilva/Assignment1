class Rational(x: Int, y: Int) {
  def numer = x/gcd(x,y)
  def denom = y/gcd(x,y)
 //constructor
  def this(x:Int)=this(x,1)
  
  require(y>0,"Denominator should grater than 0")
    
  private def gcd(x:Int,y:Int):Int=if(y==0)x else gcd(y,x%y)
  def neg = new Rational(-this.numer,this.denom)
  def +(r:Rational) = new Rational(this.numer *r.denom +r.numer * this.denom, denom * r.denom)
  def -(r:Rational) = this+r.neg
  
  
  
  override def toString = numer + "/" + denom
}

object Ass5Ques12 extends App {
  val a = new Rational(2)
  val b = new Rational(6,8)
  val c = new Rational(4,5)
  
  val x=a-b-c
  println("Entered the Rational numbers :")
  println(a)
  println(b)
  println(c)
  println("Ques 1:-Negative Value of the Rational number :")
  println(a.neg)
  println(b.neg)
  println(c.neg)  
  println("Ques 2:-Subtraction :"+x)

}
