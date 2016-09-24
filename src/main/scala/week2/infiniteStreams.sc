

def from(n: Int): Stream[Int] = n #:: from(n + 1)

val nats = from(1)
nats map(_ * 4)

(nats take(100)).toList


// Which function is faster to compute
lazy val N = 100

val xs = from(1).map(_ * N) // Much faster!!!
val ys = from(1).filter(_ % N == 0)

xs.take(N).toList
ys.take(N).toList