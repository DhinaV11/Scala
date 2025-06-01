package com.Scala.ScalaFundamentals
//reduce left, reduce right,fold left, fold right, scan left, scan right
object aReduceFoldScan {

  val list = List(2, 3, 4, 5, 6, 10, 12, 12, 88)
  val list1 = List("A","B","C","D")

  def main(args: Array[String]): Unit = {
    println(list.reduceLeft(_+_))
    println(list1.reduceLeft(_+_))

    println(list.reduceRight(_ + _))
    println(list1.reduceRight(_ + _))
    //println(list.reduceLeft((x,y)=> {
      //println(x,",",+y); x+y }));

    // fold left, fold right

    println(list.foldLeft(10)(_+_)) // here we are giving initial value for adding
    println(list.foldLeft(100)(_+_))
    println(list1.foldLeft("z")(_+_))

    println(list.foldRight(10)(_ + _)) // here we are giving initial value for adding
    println(list.foldRight(100)(_ + _))
    println(list1.foldRight("z")(_ + _))

    // scan left right

    println(list.scanLeft(10)(_ + _)) // here we are giving initial value for adding
    println(list.scanLeft(100)(_ + _))
    println(list1.scanLeft("z")(_ + _))
  }

}
