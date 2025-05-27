package com.rockthejvm.part1
 //arrays are mutable list are immutable we cannot change list value once decleared
object aListExample {
   def main(args: Array[String]): Unit = {
     val mylist: List[Int] = List(1, 2, 3, 7, 8, 9)
     val list2: List[String] = List("ram", "sam", "som", "lis")
     println(0::mylist)
     println(mylist)
     println(list2)
     println(list2.head)   // it will give first value of list
     println(list2.tail)   // it will give remains first value
     println(mylist.tail)
     println(list2.isEmpty)
     println((mylist.reverse))
     println((List.fill(5)(4)))
     println((list2.max))
     println((mylist.max))

     for (list <- list2){
       println(list)
     }



   }



}
