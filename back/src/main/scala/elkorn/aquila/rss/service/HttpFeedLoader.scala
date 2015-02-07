package elkorn.aquila.rss.service

import elkorn.aquila.rss.resources.{FeedSource, FeedDownload}

/**
 * Created by elkorn on 2/6/15.
 */
trait FeedLoader[TSource, TResult] {
  def LoadFeed(source: TSource): TResult
}

class HttpFeedLoader extends FeedLoader[FeedSource, FeedDownload] {
  override def LoadFeed(source: FeedSource): FeedDownload = new FeedDownload(source.uri)
}
