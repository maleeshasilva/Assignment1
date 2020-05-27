object Ass3Ques5 {
	def addingEven(n:Int):Int =n match
	 {
      	case 0 =>0
      	case n if(n%2!=0) => addingEven(n-1)
    	 case n if(n%2==0)=> n + addingEven(n-1)
     
	}
	
	def main(args:Array[String]){

	println("Enter your number:")
	 val result = scala.io.StdIn.readInt() 
	println(addingEven(result))
	

	


	}
	
	

}