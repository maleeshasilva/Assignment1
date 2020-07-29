class Account (NIC:String,accno:Int,b:Double) {
  def NIC:Any=NIC
  def accountnumber=accno
  def balance=b
  
  def transfer(m:Double)=
  { this.balance +m }
  
 
  override def toString ="["+NIC+":"+accountnumber +":"+ balance+"]" 
 }

object Ass5Ques3 extends App {
  val a = new Account ("967412503v",101,1200.00)
  val b = new Account ("972505032v",102,14500.33)
 
  val m:Double=5200.35
  val n:Double=1000.48
  
  println("Your Account: "+a)
  println("Transfered value :"+m)
  println("Final Balance: "+a.transfer(m))
  
  println(" ")
  println("Your Account: "+b)
  println("Transfered value :"+n)
  println("Final Balance: "+b.transfer(n))
 

}

