package com.rockthejvm.part1

//in scala map is collection of key value pairs keys are unique in the map
//not allowing duplicating value
//keys and value are unique if we are giving duplicate value means map will take last value
object aMapsDemo {

  val mymap : Map [Int,String] = Map(101 -> "ram", 102 -> "sam", 105 -> "som", 105 -> "sim" )
  val mymap1 : Map [Int,String] = Map(107 -> "ramm", 108 -> "samm", 109 -> "somm" )

  def main(args: Array[String]): Unit = {
    println(mymap) // Map(101 -> ram, 102 -> sam, 105 -> sim) here in our map we have 105 two times but here not allowing dublicate
    // its giving last value
    println(mymap(105)) // here we are checking key (105) value ?
    println(mymap(102))
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)

    for (  my <- mymap){
      println(my)
    }
    mymap.keys.foreach{ key =>
      println("key "+ key)
      println(("Value "+ mymap(key)))

    }

    println(mymap.contains(101))  // its used for exception handling 
    
    //println(mymap+ mymap)
  }
}
