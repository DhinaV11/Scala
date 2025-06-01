package com.Scala.ScalaFundamentals

object ValuesAndTypes {

  val meaningOfLife: Int = 42
  // const int meaningOfLife = 42;
  //values cannot be reassigned

  // type inference
  val anInteger = 67 + 34

  // common types
  val aBoolean:  Boolean = false // or true
  val aChar: Char = 'a'
  val anInt: Int = 45 // 4bytes
  val aShort: Short = 5243
  val aLong: Long = 546789348976L
  val aFloat: Float = 2.4f
  val aDouble: Double = 3.14

  // string type

  val aString: String = "Scala Rocks"


  def main(args: Array[String]): Unit = {

    println (aFloat)

  }

}
