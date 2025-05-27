package com.rockthejvm.part1
// set cannot contain duplicate value list mutable
object aSetsDemo {
 val myset : Set[Int] = Set(7,8,5,6,3,2,3,3,22,22)
  val myset2 : Set[Int] = Set(17,18,15,6,13,2,13,3,223,22)
 val myset1 : Set[String] = Set("aaa","bbb","ccc","ddd","ff ff","ddd")

  def main(args: Array[String]): Unit = {

  }

 println(myset1)
 println(myset)
  println(myset(7))
 println(myset+10)
 println(myset) /// set is inorder its not work based on index
 //
 println(myset(10)) // here it will check 10 is present in the set or not

 println(myset ++ myset1) // concodinate
 println(myset ++ myset2)
 println(myset1.++(myset2))

 println(myset.& (myset2)) // common value in 2 set or intersecting value
 println(myset.intersect(myset2))

 println(myset.max)
 println(myset.min)
 
 println(myset.head) // giving first value
 println(myset.tail)  // it will give apart from first value we are getting all values
 println(myset.isEmpty) // its finding getting values present in the set are not

    //myset2.foreach(println())

  for (my <- myset){
    println(my)
  }

}
