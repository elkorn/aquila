package elkorn.aquila.news.service

//import java.net.URL
//
//import akka.actor.{ActorRef, Props}
//import akka.testkit.TestActorRef
//import elkorn.aquila.rss.actor.ResourceOPMLReader
//import elkorn.aquila.rss.model.Feed
//import elkorn.aquila.service.test.utilities.ActorSpec

//class OPMLReaderSpec extends ActorSpec {
//  var reader: ActorRef
//
//
//  override def beforeEach(): Unit = {
//    reader = createReader
//  }
//
//  def createReader: ActorRef = new TestActorRef(new OPMLReader() {
//  })
//
//  "OMPL reader" should {
//    "Parse OPML input" in {
//      val expectedSource = Seq(
//        Feed("Scripting News", 580, new URL("http://www.scripting.com/rss.xml"), None),
//        Feed("Wired News", 546, new URL("http://www.wired.com/news_drop/netcenter/netcenter.rdf"), None),
//        Feed("Boing Boing Blog", 519, new URL("http://boingboing.net/rss.xml"), None))
//      reader.parse("/test.opml") shouldEqual expectedSource
//    }
//  }
//}
