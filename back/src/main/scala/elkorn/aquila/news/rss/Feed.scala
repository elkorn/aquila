package elkorn.aquila.news.rss

// This should represent only one instance of a downloaded feed.
// A source for RSS feeds will be different.
trait Feed extends FeedSource {
  val items: Seq[Item]
}