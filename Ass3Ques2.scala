object Ass3Ques2{


	// for gcd function
	def gcd(x:Int ,y:Int):Int=y match{
      	case 0 =>x
     	 case y if(y>x) =>gcd(y,x)
     	case _ => gcd(y,x%y)
	}


	//function for prime
	def prime(p:Int,n:Int=2):Boolean=n match
	{
     	case x if(p==x) =>true
      	case x if (gcd(p,x)>1) =>false
      	case x =>prime(p,x+1)
    	  }

	//function for sequence

	def primeSeq(n:Int):Any={

	if(prime(n,2)==true){
	println(n)	
	}
	if((n-1)>=2){
	primeSeq(n-1)
	}
	}

	//main function
	def main(args:Array[String]){
	primeSeq(10)
	
	}

}