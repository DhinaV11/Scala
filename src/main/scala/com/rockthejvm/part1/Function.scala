package com.rockthejvm.part1

object Function {
  // def functionname ((argument):data type,(argument):data type) : data type { return X+Y:}
  // def add (x:Int,Y:Int) : Int {x+Y}
  def add(x: Int, y: Int): Int = {
      x + y
  }
  def sub(x:Int,y:Int) : Int = {
    x-y
  }
  def div (x:Int,y:Int) : Int = x / y
  def mul (x:Int,y:Int) = x * y
  def square (x : Int) = x * x
  def print (x : Int, y : Int) : Unit = {
    println(x+y)

  }

  def main(args: Array[String]): Unit = {

    var dd = (x:Int,y:Int) => x+y
    print(2,4)
    println(dd(5,4))
    println(add(20,30))
    println(sub(100,200))
    println(div(2,6))
    println(mul(4,5))
    println(square(4))
  }
}
