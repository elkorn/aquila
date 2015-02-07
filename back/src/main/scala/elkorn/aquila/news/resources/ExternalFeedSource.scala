package elkorn.aquila.news.resources

/**
 * A feed source from outside of the application (e.g. a newly added feed, for which data has yet to be downloaded).
 */
trait ExternalFeedSource extends FeedSource[java.net.URL] {}
