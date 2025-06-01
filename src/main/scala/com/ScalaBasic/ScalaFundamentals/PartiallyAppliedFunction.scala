package com.Scala.ScalaFundamentals
import java.util.Date

object PartiallyAppliedFunction {
  
     def log(date : Date, message : String): Unit = {
    //println(date + "  " + message)
    println(date)
  }
 def sum(a : Int, b : Int, c : Int): Int = a+b+c
  def main(args: Array[String]): Unit = {
    println(sum(10,20,30))
    val f = sum(10,20, _:Int) //hera _:Int using for wild card entry
    println(f(30))
    
    val date = new Date
    val newLog = log (date, _:String)
    newLog("new message 1")
  }

}
