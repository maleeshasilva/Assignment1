class Account(NIC: String, accno: Int, b: Double) {
  def NIC: Any = NIC
  def accountnumber = accno
  def balance = b
  
}

object Ass5Ques4 extends App {

   
  val overdraft = (bank: List[Account]) => bank.filter(x => x.balance < 0)
  val Accbalance = (bank: List[Account]) =>bank.reduce((x, y) => new Account("V000000000", 1000, x.balance + y.balance))
  val interest = (bank: List[Account]) =>bank.map(y =>(if (y.balance > 0) y.balance * 1.0005d else y.balance * 1.001d))


    println("---------------------------------------------- ")
    
   
    val a = new Account("967412503v", 101, 1200.00);
    val b = new Account("972505032v", 102, 14500.33);
    val c = new Account("992007802v", 103, -125.00);
    val d = new Account("964582138v", 104, -1025.00);
    val e = new Account("789654802v", 106, 84785.00);
    val f = new Account("652389412v", 107, 485962.00);

    val bank: List[Account] = List(a, b, c, d, e, f)

    //  question 1 :- List of accounts with negative balances

    println("Ques1:- List of accounts with negative balances :")
    var overdraftlist = overdraft(bank)
    overdraftlist.foreach(x => print(x.accountnumber + "   "));
     println(" ")

    //qustion 2:-total balances
   
    var sum = Accbalance(bank)
    println(" ")
    println("Ques2:-  Total balance of the Accounts: " + sum.balance)

    //question 3:- Account balance adding Interest
    println(" ")
    println("Ques3:- Account balance adding Interest :")
    var interestlist = interest(bank)
    interestlist.foreach(i => print(i + " "))



  
}
