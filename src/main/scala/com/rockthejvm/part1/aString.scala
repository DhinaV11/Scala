package com.rockthejvm.part1


   val str1: String = "hello World"
   val str2: String = " Dhina"
   val str4 = " good"
   //val str3 = str3 : String => " World"
   def str3 (x : String)= x
object String {
  def main(args: Array[String]): Unit = {
    println(str1.length)
    println(str1.concat(str2))
    println(str3("world"))
    println(str1+str2+str4)

  }

}
