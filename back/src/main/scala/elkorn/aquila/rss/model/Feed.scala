package elkorn.aquila.rss.model

import java.net.URL

/**
 * Created by elkorn on 12/4/14.
 */
case class Feed(name: String, count: Int, xmlUrl: URL, htmlUrl: Option[URL])
