import scala.math.sqrt

object  Ass6Ques1 extends App 
{
  val p1=new Point(7,8)
  val p2= new Point(3,5)

  
  
  //Question 1 add two points
  println("P1 = " +p1)
  println("P2 = " +p2)
  println(" ")
  val p5 =p1+p2
  println("Adding two points : " +p1 +" + " +p2 +" = " +p5 )
  println(" ")
  
  //Question 2 moving a point
  val p6 =p1.move(2,3)
  println("Moving point :" +p1 +" to (2,3)" +" = "+p6)
  println(" ")
  
 //Question 3 distance between two points
  println("Distance between " +p1 +" , " +p2 +"= " +p1.distance(p2))
  println(" ")
  
  //Question 4 invert a point
  println("Invert "+p1 +" = " +p1.invert)
  println(" ")
  
}
 

 case class  Point(a:Int,b:Int)
{
  def x:Int=a; // encapsulate x,y values
  def y:Int=b;
  
  // Question 1....  
  def +(p:Point)=Point(this.x+p.x,this.y+p.y)
  
  //Question 2.....
  def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)
 
  
  //Question 3....  
  def distance(p:Point) = sqrt((this.x -p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y))   
  
  //Question 4....
  def invert =Point(this.y,this.x)
  
}