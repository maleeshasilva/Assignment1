object Ques2{

	def main(args:Array[String])
	{	
	Profit(15)
	Profit(10)
	Profit(20)
	}

	def Profit(price:Int):Unit= 
{
	
	var attendees:Int=120+(15-price)/5*20

	var revenue:Int =attendees*price

	var cost:Int =500+attendees

	var fprofit:Int =revenue -cost

	printf("The profit is :%d", fprofit)
	
	}


}
