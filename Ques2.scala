object Ques2 {

	def main(args:Array[String])
	{	
	println("Volume is :"+functionToVolume(5));	
	}

	def functionToVolume(r:Int):Double= {
	
	var volume:Double=0;

	volume=(4.0/3.0)*math.Pi*r*r*r	

	
	return volume
	}


}
