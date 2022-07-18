object Q2{

  def CtoF(C:Int):Unit={
    var F:Double=C*1.8000+32;
    println(C+ " -> " +F);
  }

  def main(args:Array[String]):Unit={
    CtoF(100);
  }

}
