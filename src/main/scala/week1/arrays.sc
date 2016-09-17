
val ar = Array[Int](1, 2, 3, 4, 5, 6)
val li = List[Int](1, 2, 3, 4, 5, 6)
ar.map(a => a * a)

ar.apply(0)
li.apply(0)

for {
  i <- ar
} yield(println(i))

for {
  i <- li
} yield(i)
