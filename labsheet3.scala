import scala.math.BigDecimal.RoundingMode

object Question1 {

    def reversestring(str:String):String = {
        if(str.isEmpty()){
            ""
        }else{
            reversestring(str.tail)+str.head
        }
    }

    def main(args:Array[String]) : Unit = {
        println(reversestring("Hello World!"))
    }
}

object Question2 {

    def filterlist(list:List[String]) : List[String] = {
        list.filter(_.length()>5)
    }

    def main(args:Array[String]) : Unit = {
        val inputlist = List("apple", "banana", "orange", "watermelon", "grape", "kiwi")
        val filteredlist = filterlist(inputlist)
        println(filteredlist)
    }
}

object Question3 {

    def mean(num1: Int, num2: Int): Double = {
        BigDecimal((num1 + num2).toDouble / 2).setScale(2,RoundingMode.HALF_UP).toDouble
    }

    def main(args: Array[String]): Unit = {
        val num1 = 5
        val num2 = 6
        val result = mean(num1, num2)
        println(f"$result%.2f")
    }
}     