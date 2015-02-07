package elkorn.aquila.core.loaders

import scalaj.http.{Http, HttpResponse}

class HttpDownloader  {
  def load(address: java.net.URL): HttpResponse[String] =
    Http(address.toString).asString
}
