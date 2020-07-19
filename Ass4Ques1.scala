object Ass4Ques1{

def main(args:Array[String])
{
val alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

val Encryption=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
//encryption

val Decryption =(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)
//decryption

val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))


val ct=cipher(Encryption,"secret",5,alphabet)

val pt=cipher(Decryption,"secret",5,alphabet)

println("The result of the  Encryption of secret :" +ct)

println("The result of  the  Decryption of secret :" +pt)

  
}

}
