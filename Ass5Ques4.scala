class Account(NIC: String, accno: Int, b: Double) {
  def NIC: Any = NIC
  def accountnumber = accno
  def balance = b

  def withdraw(l: Double) = {
    this.balance - l
  }
  def deposit(n: Double) = {
    this.balance + n
  }

  def transfer(a: Account, m: Double) = {
    this.withdraw(m)
    a.deposit(m)
    println("A balance :" + this.withdraw(m))
    println("B balance :" + a.withdraw(m))
  }

  override def toString = "[" + NIC + ":" + accountnumber + ":" + balance + "]"
}

object Ass5Ques4 extends App {

  val a = new Account("967412503v", 101, 1200.00)
  val b = new Account("972505032v", 102, 14500.33)
  val c = new Account("992007802v", 103, -125.00)
  val d = new Account("964582138v", 104, -1025.00)
  val e = new Account("789654802v", 106, 84785.00)

  val bank: List[Account] = List(a, b, c, d, e)
  

  //  question 1 :- List of accounts with negative balances
  val overdraft = (bank: List[Account]) => bank.filter(x => x.balance < 0)
  println("Ques1:- List of accounts with negative balances :")
  println(" ")
  println(overdraft(bank))
  


  //qustion 2:-total balances
  val balance =(b:List[Account])=>Double={b.reduce((x,y)=>(x.balance) + (y.balance))}
  println(" Total balance of the Accounts: "+balance(bank)) 
  
  
 //question 3:- Interest
  val f1 =(b:List[Account])=>for(i<-b){if(b(i).balance<0) b(i).balance *1.0005  else b(i).balance* 1.001}
  val interest=(b:List[Account])=>b.map(f1)
  println("After the addition of interest :") 
  println(interest(bank))                               

}