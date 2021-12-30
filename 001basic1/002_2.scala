//https://igorkraskevich.gitbooks.io/scala-tutorial/content/basics.html
//Basic statements and expressions

object Main extends App {

    // If is an expression, not a statement.
    def doubleIfEven(n: Int) =
     if (n % 2 == 0)
       n * 2
     else
       n

     // while loop.
     def whileLoop(size: Int): Unit = {
       var i = 0
       val a = new Array[Int](size)
       while (i < a.length) {
         a(i) = i
         i = i + 1
       }
       a.foreach(println)
     }

     // do-while loop
     println("doWhileLoop------>")
     def doWhileLoop(size: Int): Unit = {
       var i = 0
       val a = new Array[Int](size)
       do {
         a(i) = i
         i = i + 1
       } while (i < a.length)
       a.foreach(println)
     }
     doWhileLoop(3)

     def matchPair(p: (Int, Int)): String =
       p match {
         case (1, 1) => "one one"
         case (2, 3) => "two three"
         case (_, _) => "something else"
       }

     // StringPair is a case class, so we can pattern match against it.
     case class StringPair(first: String, second: String)


    val pair1 = new StringPair("a", "b")
    val
    pair2 = new StringPair("c", "d")
    val pairs = List(pair1, pair2)
    for (pair <- pairs)
        // pair1 matches the first pattern, pair2 doesn't.
        pair match {
            // "deep" pattern matching
            case StringPair("a", "b") => println("matches")
            case _ => println("does mot match")
     }

    // A for loop with filters and an assigment.
    val names = List("John", "Alex", "Joe", "VeryLongName")
    for {
        name <- names
        if !name.startsWith("A")
        if name.length <= 4
        upperCase = name.toUpperCase
    }
    println(upperCase)


    // Binding a List and an Option.
    // It is possible because of an implicit conversion
    // from Option[A] to Iterable[A].
    println("matchPair----->")
    val list = List(1, 2, 3)
    val opt = Some(5)
    for {
        x <- list
        y <- opt
    } yield (x + y)

    val i1: Int = 2
    val i2: Int = 2
    println(matchPair(i1, i2))

}


