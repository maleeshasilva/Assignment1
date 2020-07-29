class Account (NIC:String,accno:Int,b:Double) {
  def NIC:Any=NIC
  def accountnumber=accno
  def balance=b
  
  def withdraw(l:Double)={
    this.balance-l
  }
  def deposit(n:Double)={
    this.balance+n
  }
  
  def transfer(a:Account,m:Double)=
  { this.withdraw(m) 
    a.deposit(m)
   println("A balance :"+this.withdraw(m))
   println("B balance :"+a.withdraw(m))
  }
  
 
  override def toString ="["+NIC+":"+accountnumber +":"+ balance+"]" 
 }

object Ass5Ques3 extends App {
  val a = new Account ("967412503v",101,1200.00)
  val b = new Account ("972505032v",102,14500.33)
 
  val m:Double=1000.00
  
  println("Your Account A: "+a)
  println("Your Account B: "+b)
  println(" ")  
  println("Money is transfered from A to B ")
  println("Transfered value :"+m)
  println("Final Result :")
  a.transfer(b,m)


}



