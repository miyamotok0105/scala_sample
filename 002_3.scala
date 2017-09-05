//val vs var

val a = new Array[Int](2)
// Fine, val means that a reference is immutable, the object itself can mutate.
a(0) = 2
// a = new Array[Int](2) Compilation error: reassignment to a val.
println(a(0))

var b = new Array[Int](2)
b(0) = 2 // Fine.
b = new Array[Int](2) // Fine. A var can be reassigned.
println(b(0))