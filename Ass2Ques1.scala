object Ques1{

	def main (args:Array[String])
	{
	 takehome(40,20);
	}

	def  takehome(hrs:Int,ot:Int):Unit =
	{

	var wage:Int=hrs*150
	var otpayment:Int =ot*75
	var income:Int =wage+otpayment
	var tax:Double =income*0.1
	var finalpayment :Double =income-tax
	
	printf("Take home Salary of an employee is : %.2f",finalpayment)

	}

}