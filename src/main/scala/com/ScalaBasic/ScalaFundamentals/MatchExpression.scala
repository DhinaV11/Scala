package com.Scala.ScalaFundamentals

object MatchExpression {
  def main(args: Array[String]): Unit = {
    val age = 200

    age match {
      case 20 => println(age)
      case 10 => println(age)
      case 70 => println(age)
      case 18 => println(age)
      case 30 => println(age)

      case _ => println("default")
    }
    val i = 1
    i match {
      case 1 |5|3 => println("odd")
      case 2| 4|6 => println("even")
    }
  }

}
