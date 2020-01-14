object p4{
	def main(args:Array[String]){

		//scala do not have a switch case.
		//scala has the concept of pattern matching.

		println("Concept of pattern matching in Scala.");

		var a=10;
		// a=a+1;

		a match{

			case 0=> println("zero")
			case 5=> println("five")
			case 10=> println("ten")
			case 15=>println("fifteen")
			case _=> println("default")  //_ is used for default case.

		}


		//multiple lines in case:

		a match{
			case 10=> println("welcome to case")
				var b=1;
				var result=b+a;
				println(result);

			case _=> println("default case.")
		}

		var b=a match{
			case 10 => //println(b).  error
				a*10;

			case _=> a*2;
		}
		println(b)
	}
}