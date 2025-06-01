package com.Scala.ScalaFundamentals

object Expressions {

  // structures that evaluate to a value
  val meaningOfLife  = 40 + 2
//                    + is expression eg + - * / , bitwise | & >> <<
  val mathExpression = 2 + 3 * 4
  val findGreater = 5 + 10 * 5 / 10

  //Boolean Expression

  val equalTest = 1 == 2

  // If Expression

  val anIFExpression = if (equalTest) 45 else 99

  // code blocks

  val acodeBlock: Unit = {
    // define local value
    val localvalue = 78
    // everything in scala in expression
  }

  def main(args: Array[String]): Unit = {
    println(mathExpression)
    println(findGreater)
    println(equalTest)
    println(anIFExpression)

  }

}
