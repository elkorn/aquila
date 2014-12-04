package elkorn.aquila.service

import java.net.URL

import elkorn.aquila.rss.model.Feed
import elkorn.aquila.rss.service.{OPMLReader, ResourceOPMLReader}
import elkorn.aquila.service.test.utilities.Spec

/**
 * Created by elkorn on 12/4/14.
 */
class OPMLReaderSpec extends Spec {
  var reader: OPMLReader = ResourceOPMLReader()

  override def beforeEach(): Unit = {
    reader = ResourceOPMLReader()
  }


  "OMPL reader" should {
    "Parse OPML input" in {
      val expectedSource = Seq(
        Feed("Scripting News", 580, new URL("http://www.scripting.com/rss.xml"), None),
        Feed("Wired News", 546, new URL("http://www.wired.com/news_drop/netcenter/netcenter.rdf"), None),
        Feed("Boing Boing Blog", 519, new URL("http://boingboing.net/rss.xml"), None))
      val parsedOutput = reader.parse("/test.opml") shouldEqual expectedSource
    }
  }
}
