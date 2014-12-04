package elkorn.aquila.rss.service.model

import java.net.URL

/**
 * Created by elkorn on 12/4/14.
 */
case class Feed(name: String, count: Int, xmlUrl: URL, htmlUrl: Option[URL])
