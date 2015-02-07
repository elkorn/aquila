package elkorn.aquila.news.model

import elkorn.aquila.core.loaders.HttpDownloader
import elkorn.aquila.core.resources.HttpDownload
import elkorn.aquila.test.data._
import elkorn.aquila.test.utilities.Spec
import org.mockito.Mockito.when

class HttpDownloadSpec extends Spec {
  "HttpDownload" should {
    "use an HTTP downloader to get the data from specified URI" in {
      val mocks = new Mocks
      val testUrl = Url.create()
      when(mocks.httpDownloader.load(testUrl)).thenReturn(HttpResponse.create())

      val download = new HttpDownload[String] {
        val address = testUrl

        override def resolve(downloadResolver: HttpDownloader): String =
          downloadResolver.load(address).toString
      }

      download.resolve(mocks.httpDownloader) should be(HttpResponse.create().toString)


    }
  }

  class Mocks {
    lazy val httpDownloader = mock[HttpDownloader]
  }

}
