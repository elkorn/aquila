package elkorn.aquila.service.test.utilities

import akka.actor.ActorSystem
import akka.testkit.TestKit

/**
 * Created by elkorn on 12/4/14.
 */
class ActorSpec(_system: ActorSystem) extends TestKit(_system) with Spec {
  def this() = this(ActorSystem("MySpec"))

  override def afterAll {
    TestKit.shutdownActorSystem(system)
  }
}
