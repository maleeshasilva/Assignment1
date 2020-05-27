object Ass3Ques1{


	// for gcd function
	def gcd(x:Int ,y:Int):Int=y match{
      	case 0 =>x
     	 case y if(y>x) =>gcd(y,x)
     	case _ => gcd(y,x%y)}


	//function for prime
	def prime(p:Int,n:Int=2):Boolean=n match
	{
     	case x if(p==x) =>true
      	case x if (gcd(p,x)>1) =>false
      	case x =>prime(p,x+1)
    	  }

	//main function
	def main(args:Array[String]){
	println(prime(5))
	println(prime(8))

	}

}