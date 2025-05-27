package com.rockthejvm.part1

// class is blueprint for the object
// var getter setter
// val getter no setter (cannot modify)
//default --- ----
// suppose we are mentioning private in the class we cannot acces the value outside class

class user

class user1(var name:String,var age:Int)
//////2222222
class use (private var name:String,private var age: Int)  {
  def printName: Unit = {println(name)}
  def PrintAge: Unit = {println(age)}
}

object OClass {
  def main(args: Array[String]): Unit = {
    var user = new user
    var user1= new user1("ram",22)
    println(user1.name)
    println(user1.age)
    user1.name = "somu"
    user1.age = 13
    println(user1.name)
    println(user1.age)

    //////2222222222

    var use = new use("din",22)
    use.printName
    use.PrintAge
  }

}
