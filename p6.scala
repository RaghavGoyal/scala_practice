object p6{
	def main(args:Array[String]){
		println("for loop demo.");

		println("print all even no upto 20.")

		for(a<-1 to 20){
			if(a%2==0)
			println(a)

		}

		//alternatively:

		for(a<-1 to 10 if a%2==0){
			println(a)
		}


		for(a<- 1 to 10 by 2){
			println(a)
		}
	}
}