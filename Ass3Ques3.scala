object Ass3Ques3{


	 def addition(n:Int):Int= n match
	{
     	case 0 => n
     	case n if(n>0) =>(n+addition(n-1))
     	}
	
	
	def main(args:Array[String]){
	println(addition(5))
	
	}

}