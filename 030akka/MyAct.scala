import scala.actors.Actor
import scala.actors.Actor._

//scala.actors.Actorクラスを継承
class MyAct extends Actor {
  def act = {
    println("Hello MyAct")
  }
}
