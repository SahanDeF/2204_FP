object q3
{
  val DefaultName:String="Porche";
  val DefaultPrice:Double=200000;

  class Inventory (var Name:String, var Price:Double){

    // one-arg auxiliary constructor
    def this(Name:String)={
      this(Name, DefaultPrice)
    }

    // one-arg auxiliary constructor
    def this(Price:Double)={
      this(DefaultName,Price)
    }

    // zero-arg auxiliary constructor
    def this()={
      this(DefaultName,DefaultPrice)
    }

    def print():Unit={
      val uuid=this.Name.hashCode();
      println("car uuid = " + this.Name + "--" + uuid);
    }
  }






    // Main method
    def main(args:Array[String]):Unit=
    {

        // Applying hashCode method
        //val result = "Nidhi".hashCode()

        // Displays output
        val car1= new Inventory("bmw 3 series",20000);
        val car2= new Inventory(20000);
        car2.print();

    }
}
