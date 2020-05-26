object Ques3{

	def main(args:Array[String])
	{	
	println("Total Cost is :"+functionToTotal(60));	
	}

	def functionToTotal(a:Int):Double= {
	
	var total:Double=0
	var afterdiscont:Double =24.95*0.6
	var shippingcost:Double=0

	if(a>50){
		shippingcost=(a%50)*0.75		
	}
	else{
		shippingcost=3
	}
	
	total =afterdiscont*a+shippingcost


	return total
	}


}