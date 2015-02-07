package elkorn.aquila.news.model

trait ArticleGroup {
  val name: String
  val articles: Iterable[Article]
}

case class Feed(name: String, articles: Iterable[Article]) extends ArticleGroup

