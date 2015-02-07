package elkorn.aquila.test.data

object Uri {

  private object Constants {
    val protocol = "http"
    val host = "test-host"
    val path = "/test-path"
    val query = "test-query"
    val fragment = "test-fragment"
  }

  def create(
    protocol: String = Constants.protocol,
    host: String = Constants.host,
    path: String = Constants.path,
    query: String = Constants.query,
    fragment: String = Constants.fragment
  ) =
    new java.net.URI(protocol, host, path, query, fragment)
}
