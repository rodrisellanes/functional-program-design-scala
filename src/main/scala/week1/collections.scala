package week1

/**
  * Created by rdsel on 15/9/2016.
  */
object collections extends App {

  val example =
    for {
      x <- 2 to 10
      y <- 1 to x
      if (x % y == 0)
    } yield (x, y)

  println(example)

  case class Book(title: String, author: List[String])

  val books = List(
    Book(title = "The Big Bang", author = List("Brian Green", "Tom Canson")),
    Book(title = "The Last Path", author = List("Martin Nugs", "Johan Terrys")))

  val searchBook = {
  for (b <- books; a <- b.author if a.startsWith("Tom"))
    yield b.title
  }
  println("Book found: " + searchBook)

  val searchAuthor ={
    for( b <- books; a <- b.title)
      yield b.author
  }
  // Keep in mind "distinct" method remove duplicate elements of the sequence
  println("Author found: " + searchAuthor.flatten.distinct)


  // Exercise
  for( b <- books; a <- b.author if a startsWith "Martin")
    yield b.title

  println(books.flatMap(book => book.author withFilter(a => a startsWith "Martin") map(y => y)))

//  println(books.flatMap(book => book.author))
}
