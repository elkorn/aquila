package elkorn.aquila.test.data

object HttpResponse {

  object Constants {
    val headers: Map[String, String] = Map("Content-Type" -> "text/xml;charset=utf-8", "Content-Length" -> "6")
    val body = "string"
    val code: Int = 200
    val data: String = "HTTP/1.1 200 OK\nContent-Type: text/xml;charset=utf-8\nContent-Length: length\n\nstring"
  }

  def create(
    body: String = Constants.body,
    code: Int = Constants.code,
    headers: Map[String, String] = Constants.headers
  ) =
    scalaj.http.HttpResponse(body, code, headers)
}
