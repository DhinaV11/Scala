package com.rockthejvm.part1

object IfCondition {
  def main(args: Array[String]): Unit = {
   val x = 20
    var res = ""
    if (x==20){
      res = "X == 20"
    }
    else{
      res = "x !=20 "
    }
    println(res)

    if (x == 10)
      println("equal")
    else {
      println("not equal")


    }
    val res2 = if (x != 20) "x==20" else "x != 20"
    println(res2)
    println (if (x != 20) "x==20" else "x != 20")
  }

}
