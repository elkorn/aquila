package elkorn.aquila.test.utilities

import akka.actor.ActorSystem
import akka.testkit.TestKit

import scala.concurrent.{Awaitable, Await}
import scala.concurrent.duration._

/**
 * Created by elkorn on 12/4/14.
 */
class ActorSpec(_system: ActorSystem) extends TestKit(_system) with Spec {
  def this() = this(ActorSystem("MySpec"))

  override def afterAll {
    TestKit.shutdownActorSystem(system)
  }

  def await[T](awaitable:Awaitable[T]) =
    Await.result(awaitable, 5 seconds)
}
