import scala.io.StdIn._

object q4
{

  def main(args:Array[String]):Unit=
    {
      //print doesnt take cursor to next line

      print("Please enter your input : ");
      val x:Int=readInt();
      x match{
        case x if x<=0 => println("Negative/Zero");

        case x if x%2==0 => println("Even");

        case x if x%2!=0 => println("Odd");

      }

    }
}
