package elkorn.aquila.news.service

import java.net.URL

import elkorn.aquila.news.resources.{ExternalFeedSource, FeedDownload, FeedSource}
import elkorn.aquila.test.utilities.Spec

class HttpFeedLoaderSpec extends Spec {
  "HttpFeedLoader" should {
    "load feeds from an HTTP source" in {
      val loader = new HttpFeedLoader
      val url = elkorn.aquila.test.data.Url.create()
      val feedSource = new ExternalFeedSource {
        override val address: URL = url
      }

      loader.LoadFeed(feedSource) should be(FeedDownload(url))
    }
  }
}
