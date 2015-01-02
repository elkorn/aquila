package elkorn.aquila

import akka.actor.ActorSystem
import com.example.PingActor


object ApplicationMain extends App {
  val system = ActorSystem("MyActorSystem")
  val pingActor = system.actorOf(PingActor.props, "pingActor")
  pingActor ! PingActor.Initialize
  // This example app will ping pong 3 times and thereafter terminate the ActorSystem -
  // see counter logic in PingActor
  system.awaitTermination()
}

