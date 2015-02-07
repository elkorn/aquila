package elkorn.aquila.rss.model

/**
 * Created by elkorn on 12/4/14.
 */
trait ArticleGroup {
  val name: String
  val articles: Iterable[Article]
}

case class Feed(name: String, articles: Iterable[Article]) extends ArticleGroup

