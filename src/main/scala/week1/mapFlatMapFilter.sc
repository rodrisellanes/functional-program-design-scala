// Examples using method map, flatMap and filter


def lists(ls1: List[Int], ls2: List[Int]): List[Int] = {
  ls1.flatMap(l1 => ls2 map(l2 => l1 + l2))
}
lists(List(1, 2, 3, 4), List(2, 4, 6, 8))

val list1 = List(5, 6, 7)
val list2 = List(0, 9, 8)
val list3 = list1 :: list2 :: Nil

list1.map(x => x+1)
list3.flatten

// Complete example using the 3 methods
list3.flatMap(x => x map(y => y+1)).filter(f => f > 7 && f < 10)

// Using flatMap and map
list1.flatMap(l1 => list2.map(l2 => (l2, l1)))
list1.flatMap(l1 => list2.map(l2 => l1 + l2))

// Using for expressions, represented the behavior of flatMap and map
for {
  l1 <- list1
  l2 <- list2
} yield(l1, l2)

// Testing functionality of map and flatMap
val l = List(1, 2, 3, 4, 5)

def f(x: Int) = if(x > 2) Some(x) else None
f(2)

l.map(x => f(x))
l.flatMap(x => List(f(x)))
l.flatMap(x => List(f(x)).flatMap(y => y).map(z => z * z))
l.flatMap(x => f(x).map(y => y * y))

l.map(x => x + 1).withFilter(y => y > 3)
l.foldLeft(0)((r, c) => (r + c))