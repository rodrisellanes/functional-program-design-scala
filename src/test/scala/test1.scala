import com.sun.net.httpserver.Authenticator.{Failure, Success}
import week2.Pouring

import scala.util.control.NonFatal

/**
  * Created by rdsel on 21/9/2016.
  */
object test1 extends App {

  val problem = new Pouring(Vector(4, 9))

//  println(problem.moves)
  //

  println(problem.pathSets.mkString( "\n"))

  println(problem.solution(6) + "\n")


}
