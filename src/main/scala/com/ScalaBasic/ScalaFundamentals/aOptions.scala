package com.Scala.ScalaFundamentals
// its container it will give 2 value
// its will give (some or none ) if values are there means it will give SOME if not finding it will give NONE
// in option we will handle using exception (getorelse) method
object aOptions {

  val list = List(2,3,4,5)
  val map = Map(101->"ddd", 102->"eee",109->"rrr")

  def main(args: Array[String]): Unit = {

    println(list.find(_>4))  // here _ is any value present in the list
    println(map.get(101))
    println(list.find(_<4))
    /*  out put   Some(5)
                  Some(ddd)
                  Some(1)        here adding get we getting only value we will not get some or none */

    println(map.get(101).get)
    println(list.find(_ < 4).get)

    // exception handle suppose if the value not found
    println(map.get(110).getOrElse("no keys value find"))  // if the value find it will give value or it will through exception
    println(list.find(_ < 3).getOrElse("no value find"))
    println(list.find(_< 0).getOrElse("0"))

  }
}
