package com.rockthejvm.part1

  /*currying is the technique of transforming a function
  that takes multiple argument into a function
  that takes a single argument
   */
  def add (x: Int) = (y:Int) => x+y
  def add1 (x:Int)(y:Int) = x+y
object Currying {
  def main(args: Array[String]): Unit = {
    println(add (20)(50))

    val sum = add(50)(_:Int)
    println(sum(100))
    val sum1 = add1(100)_
    println(sum1(1))
    println(add1(20)(100))
  }
}
