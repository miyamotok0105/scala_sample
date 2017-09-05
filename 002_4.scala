try {
  val s: String = null
  println(s.length) // throws a NullPointerException
} catch {
  // Instead of multiple catch clauses for different types of exceptions,
  // there one catch clause which uses pattern matching.
  case e: NullPointerException => println(e)
  case _ => println("Unknown exception")
} finally {
  println("finally block")
}
