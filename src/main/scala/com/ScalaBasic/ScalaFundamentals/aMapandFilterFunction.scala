package com.Scala.ScalaFundamentals

object aMapandFilterFunction {

  val list = List(2, 3, 4, 5,6,10,12,12,88)
  val map1 = Map(101 -> "ddd", 102 -> "eee", 109 -> "rrr")

  def main(args: Array[String]): Unit = {
    println(list.map(_*2))
    println(list.map (x=>x+2))
    println(list.map(x => x/2))
    println(list.map(x => x/0.2))
    println(list.map(x=>"hi"+ x))
    println(list.map(x=>"hi"* x))

    println(map1.map(x =>"hi"+x))
    println(map1.mapValues(x =>"hi"+x))
    println("dhina".map(_.toUpper))
    println(List(List(1,2,3,3,4),List(9,8,7,4,2)).flatten) // here flatten combine two list
    println(list.map(x=>List (x, x+1)))
    println(list.flatMap(x=>List (x, x+1)))

    println(list.filter(x => x%2==0))
    println(list.filter(x => x%2!=0))

  }

}
