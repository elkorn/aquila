package com.example

//class PingPongActorSpec(_system: ActorSystem) extends TestKit(_system) with Spec/* extends ActorSpec(_system)*/ {
//
//  def this() = this(ActorSystem("MySpec"))
//
//  override def afterAll {
//    TestKit.shutdownActorSystem(system)
//  }
//
//  "A Ping actor" must {
//    "send back a ping on a pong" in {
//      val pingActor = system.actorOf(PingActor.props)
//      pingActor ! PongActor.PongMessage("pong")
//      expectMsg(PingActor.PingMessage("ping"))
//    }
//  }
//
//  "A Pong actor" must {
//    "send back a pong on a ping" in {
//      val pongActor = system.actorOf(PongActor.props)
//      pongActor ! PingActor.PingMessage("ping")
//      expectMsg(PongActor.PongMessage("pong"))
//    }
//  }
//
//}
