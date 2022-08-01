import java.io._

object Q2{

  class Cart(val i:Int, val b:Int, val c:Int){
    var ice:Int=i;
    var bis:Int=b;
    var cup:Int=c;

    def print():Unit={
      println(ice + " vanilla ice cream at Rs.3.99 each");
      println(bis + " chocolate biscuits at Rs.4 each");
      println(cup + " cupcakes at Rs.7.77 each");
    }

    def isIcecream():Unit={
      if (ice!=0){
        println(ice + " vanilla ice cream at Rs.3.99 each");
      }
      if (bis!=0){
        println("Found another item");
      }
      if (cup!=0){
        println("Found another item");
      }
    }
  }

  def main (args:Array[String]):Unit={
    val cart1= new Cart(13,6,7);

    cart1.print();
    //cart1.isIcecream();
  }


}
