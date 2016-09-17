package week1
import java.util.Random

/**
  * Created by rdsel on 16/9/2016.
  */
object generationRandom extends App {

  val rand = new Random

  trait Generator[T] {
    def generate: T
  }

  // Generate integers random numbers
  val integers = new Generator[Int] {
    val rand = new java.util.Random
    def generate: Int = rand.nextInt()
  }
  println(integers.generate)


  // Generate boolean random numbers (0, 1)
  def booleans = new Generator[Boolean] {
    def generate = integers.generate > 0
  }
  println(booleans.generate)




}
