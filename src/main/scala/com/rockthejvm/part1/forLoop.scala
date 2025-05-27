package com.rockthejvm.part1

object forLoop {
  def main(args: Array[String]): Unit = {

    // hear to and until are method for range
    /*for (i <- 1.to (7)) {
      println("i using to "+  i)

    }
    for (i <- 1.until(7)) {
      println("i using until " + i)

    }
    for (i <- 1 until 10) {
      println("i using until " + i)

    }
    for (i <- 1 to  10 ; j <- 1 to 2) {
      println("i using until " + i + " "+j)

    }*/
    val lst = List(1,3,4,5,6,7,8,9)
    for (i <- lst){
      println("list stored in lst " + i)
    }
    for (i <- lst ; if i < 6)  {
      println("list stored in lst " + i)
    }
    val result = for (i <- lst; if i < 6) {
      println("list stored in lst " + i)
    }
    val result1 = for {
      i <- lst; if i < 6} yield {
      i * i

    }
    println("Result is" + result1)

  }

}
