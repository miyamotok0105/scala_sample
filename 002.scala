//基本の型
object StandardTypes {

  def main(args: Array[String]): Unit = {
    // Numbers. Type annotations are used deliberately.
    val i: Int = 2
    println(i)
    val long: Long = 100000000000000L
    println(long)
    val d: Double = 3.14
    println(d)
    // A String
    val s: String = "A string"
    println(s)
    // A Boolean
    val b: Boolean = true
    println(b)
    // Tuples.
    val t1: (String, Int) = new Tuple2("string", 1)
    println(t1)
    val t2: (Int, Int, Boolean) = new Tuple3(1, 2, false)
    println(t2)
    // An array.
    val a: Array[Int] = new Array(3)
    a(0) = 1
    a(1) = 10
    a(2) = 100
    println(a(0) + " " + a(1) + " " + a(2))
    // A list.
    val list: List[Int] = List(1, 2, 3)
    println(list)
  }
}
