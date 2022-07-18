object Q4{

def cost (n:Int):Unit={

  var cover:Double=24.95*0.4;
  if (n<=50) {
    println("wholesale cost is " + (n*3+cover) );
  }
  else
  {
    var m=n-50;
    println("wholesale cost is " + (50*3+0.75*m+cover) );
  }

}

def main (args:Array[String]):Unit={
  cost(100);

}
}
