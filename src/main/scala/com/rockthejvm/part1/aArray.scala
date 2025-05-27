package com.rockthejvm.part1
import Array._
  /* array is data structure store fixed size sequential element of same data type
  "same data type"
  array can store data types , collections
   */

  val myarray : Array[Int] = new Array[Int](5)
  val array2 = new Array [Int](6)
  val array3 = new Array [String](6)
  //val array4 = Array (1,2,3,4,5,6,7,0)
object Array {
  def main(args: Array[String]): Unit = {
    myarray (0) = 1
    myarray (1) = 23
    myarray (2) = 22
    myarray (3) = 25
    myarray (4) = 5

    println(myarray)
    println(array2)

    for (x <- myarray){
      println(x)
    }
    for (x <- array2) {
      println(x)
    }
    for (x <- array3) {
      println(x)
    }
    //println(array4)


  }

}
