object Ass3Ques4 extends App{


	 def isEven(n:Int):Boolean= n match
	{
     	case 0 => true
     	case _ => isOdd(n-1)
     	}
	
	 def isOdd(n:Int):Boolean  = !(isEven(n))
	

	
	println(isEven(4),isEven(5))
	println(isEven(5),isEven(6))
	

}