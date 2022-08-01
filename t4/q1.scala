object Q1{


  def interest (m:Int) = m match {

    case x if m>2000000 =>println(6.5*m/100);

    case x if (m>200000 && m<=2000000) =>println(3.5*m/100)

    case x if (m>20000 && m<=200000) =>println(4*m/100);

    case _ =>println(2*m/100);

}

  def main (args:Array[String]):Unit={
    println(interest(10000000));
  }


}
