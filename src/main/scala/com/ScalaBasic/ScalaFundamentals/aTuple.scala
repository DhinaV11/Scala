package com.Scala.ScalaFundamentals
   //the value cannot changed once declared
   // fixed size
   // it can be same data types or combination
// tuple contains 1 to 22 element
object aTuple {

     val mytuple = (1,3,4,4,5,"ram","smo","sss","sss")
     val mytup = new Tuple4(5,6,"rrr","sss")
     val mytup2 = new Tuple5(5,6,"rrr","sss","fff")
     val mytuple1 = new Tuple4 (1,"qqq",(2,3,4,5,6,7),("ww","dd","cc","ff"))

     def main(args: Array[String]): Unit = {

       println(mytuple)
       println(mytup2)
       println(mytuple._6)
       println(mytuple._1)
       println(mytuple._2)
       println(mytuple._5)

       println(mytuple++mytup2)

       println(mytuple1._4._4)
       println(mytuple1._4._1)
       println(mytuple1._3._1)


     }

}
