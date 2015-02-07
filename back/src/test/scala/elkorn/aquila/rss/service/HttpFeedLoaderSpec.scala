package elkorn.aquila.rss.service

import elkorn.aquila.rss.resources.{FeedDownload, FeedSource}
import elkorn.aquila.test.utilities.Spec

/**
 * Created by elkorn on 2/6/15.
 */
class HttpFeedLoaderSpec extends Spec {
  "HttpFeedLoader" should {
    "load feeds from an HTTP source" in {
      val loader = new HttpFeedLoader
      val uri = new java.net.URI("http","test-host","/test-path","test-query","test-fragment")
      val feedSource = FeedSource(uri)
      loader.LoadFeed(feedSource) should be(FeedDownload(uri))
    }
  }
}
