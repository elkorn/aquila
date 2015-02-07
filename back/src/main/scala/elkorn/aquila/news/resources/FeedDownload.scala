package elkorn.aquila.news.resources

import elkorn.aquila.core.loaders.HttpDownloader
import elkorn.aquila.core.resources.HttpDownload
import elkorn.aquila.news.model.Feed

case class FeedDownload(address: java.net.URL) extends HttpDownload[Feed] {
  // Differential stuff may be used here, as in downloading only the feeds newer than X date etc.
  override def resolve(downloadResolver: HttpDownloader): Feed = ???
}