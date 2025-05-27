package com.rockthejvm.part1
/* A closure is a function which uses one or more variables
declared outside this function.*/
 var number = 10
 val sum = (x : Int) => x + number // here we are getting value of number getting outside of the function
object Closures {
  def main(args: Array[String]): Unit = {
    println(sum(100))
  }

}
