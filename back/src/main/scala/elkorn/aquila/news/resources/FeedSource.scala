package elkorn.aquila.news.resources

trait FeedSource[TAddress] {
  // Concrete instances of this will probably be persistent.
  /**
   * Used for application addressing e.g. a URL or a database ID.
   */
  val address: TAddress
  // TODO: Should the feed source contain feed items?
//  val items: Iterable[TItem]
}