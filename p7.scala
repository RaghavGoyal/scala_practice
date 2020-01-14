import scala.util.control.Breaks._
object p7{
	def main(args:Array[String]){

		for(i <- 1 to 3){  
            breakable {   
                for(j <- 1 to 3){  
                    if(i == 2 & j == 2 )   
                       break    //breaks the loop from the breakable point.
                    println(i+" "+j)  
                }  
            }  
        }  
	}
}

//if breakable poinr is not explicitly mentioned, the conrol breaks the loop from the outermost loop.