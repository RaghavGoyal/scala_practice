object p5{
	def main(args:Array[String]){
		println("while loop demo.");

		println("print even no. upto 10");

		var a=2;
		while(a<=20){
			println(a)
			a=a+2;
		}

		a=2
		println("do while demo.")
		do{
			println(a);
			a=a+2
		}while(a<=20)
	}
}