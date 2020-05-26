object Ques1{

	def main (args:Array[String])
	{
	println("Temperature in Fahrenheit : " + functionToConvert(35));

	}

	def  functionToConvert(a:Int):Double=
	{
	var res:Double=0
	res =a*1.8+32
	return res
	}



}