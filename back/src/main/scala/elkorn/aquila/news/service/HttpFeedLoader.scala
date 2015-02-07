package elkorn.aquila.news.service

import elkorn.aquila.news.resources.FeedDownload
import elkorn.aquila.news.resources.ExternalFeedSource

trait FeedLoader[TSource, TResult] {
  def LoadFeed(source: TSource): TResult
}

class HttpFeedLoader extends FeedLoader[ExternalFeedSource, FeedDownload] {
  override def LoadFeed(source: ExternalFeedSource): FeedDownload = new FeedDownload(source.address)
}
