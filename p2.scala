object p2{
	def main(args:Array[String]){
		println("welcome");

		var a=10;
		println(a);
		a+=1;
		a+=1;
		println("a after two increments is: "+a);
		println("bye");

		val b=10;
		println(b);
		// b+=1;   //error: val can not be changed.
		// b+=1;
		println("b can not br incremented ");
		println("bye");
	}
}