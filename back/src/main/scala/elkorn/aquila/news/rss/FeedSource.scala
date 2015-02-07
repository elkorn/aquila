package elkorn.aquila.news.rss

import org.joda.time.{DateTime, Days, Hours}

trait FeedSource {
  val title: String
  val description: String
  val link: java.net.URL
  val docs: Option[String]
  val category: Option[Category.Category]
  val copyright: Option[String]
  val language: Option[String]
  val lastBuildDate: Option[DateTime]
  val managingEditor: Option[String]
  val pubDate: Option[DateTime]
  // TODO: Email type?
  val webMaster: Option[String]
  val generator: Option[String]
  val image: Option[Image]
  val skipDays: Option[Seq[Days]]
  val skipHours: Option[Seq[Hours]]
  val ttl: Option[Int]
}

import elkorn.aquila.tools.Tools

case class Image(
  description: Option[String],
  height: Option[Int] = Some(31),
  link: java.net.URL,
  title: String,
  url: java.net.URL,
  width: Option[Int] = Some(88)
) {
  Tools.assumeOpt(height, "RSS image height must not exceed 400.")(_ <= 400)
  Tools.assumeOpt(width, "RSS image width must not exceed 144.")(_ <= 144)
}

case class Item(
  author: Option[String],
  category: Option[Category.Category],
  comments: Option[java.net.URL],
  description: String,
  enclosure: Option[Enclosure],
  guid: Option[String],
  pubDate: Option[DateTime],
  source: Option[Source],
  title: String
)

case class Source(
  url: java.net.URL,
  value: String
)

case class Enclosure(
  length: Long,
  theType: String,
  url: java.net.URL
)

object Category {
  def apply(
    domain: Option[String],
    value: String
  ) = Category(domain, value split "/")

  private[rss] case class Category(
    domain: Option[String],
    values: Seq[String]
  )

}
