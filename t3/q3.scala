import scala.math._

object Q3{

  def volume(r:Int):Unit={
    var vol:Double=4*r*r*r/3*Pi;
    println("volume of sphere of radius " +r+ " is " +vol);
  }

  def main(args:Array[String]):Unit={
    volume(7);
  }

}
