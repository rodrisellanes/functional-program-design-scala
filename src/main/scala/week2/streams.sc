
// Convert a Range to a Stream
((1 to 1000).toStream)(10)
(1 to 1000).toStream.take(3).toList
(1 to 10).take(3)

(1 until 13195).map(n => if(13195 % n == 0) println(List(n)) else Nil)

((1 until 13195).toStream.map(n => if(13195 % n == 0) n else Nil)).distinct.toList

val stream1 = Stream(1, 2, 3, 4, 5)
val stream2 = Stream(1, 2, 3, 4, 5)

(1 to 1000).toStream
(1 to 1000).toStream.tail
(1 to 1000).toStream.last

stream1.#::(List(3).head).toList

def streamRange(lo: Int, hi: Int): Stream[Int] = {
  if(lo >= hi) Stream.empty
  else Stream.cons(lo, streamRange(lo + 1, hi))
}

/*  Lazy Evaluation  */

lazy val x = List(1,2,3)
val y = List(1, 3, 4)

def expr = {
  val x = { print("x") ; 1 }
  lazy val y = { print("y") ; 2 }
  def z = { print("z") ; 3 }
  z + y + x + z + y + x
}
expr
