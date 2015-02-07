package elkorn.aquila.rss.resources

import elkorn.aquila.core.loaders.HttpDownloader
import elkorn.aquila.core.resources.HttpDownload
import elkorn.aquila.rss.model.Feed

/**
 * Created by elkorn on 2/6/15.
 */
case class FeedDownload(uri: java.net.URI) extends HttpDownload[Feed] {
  // Differential stuff may be used here, as in downloading only the feeds newer than X date etc.
  override def resolve(downloadResolver: HttpDownloader): Feed = ???
}