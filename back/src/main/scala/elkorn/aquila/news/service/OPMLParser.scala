package elkorn.aquila.news.service

//import scala.xml.{Node, XML}

//class OPMLParser(documentProvider: DocumentProvider) {
//  def tryUrlAttr(node: Node, s: String): Option[URL] = {
//    val result = node \ s"@$s"
//    if (result.isEmpty) None
//    else Some(new URL(result.text))
//  }
//
//  def getSource(path: String): Reader = scala.io.Source.fromFile(path).bufferedReader()
//
//  def parseOutline(node: Node): Option[Feed] =
//    if (node \ "@xmlUrl" isEmpty) None
//    else Some(Feed(node \ "@text" text, (node \ "@count").text.toInt, new URL(node \ "@xmlUrl" text), tryUrlAttr(node, "htmlUrl")))
//
//  def parse(sourcePath: String): Seq[Feed] = {
//    val document = XML.load(getSource(sourcePath))
//    (document \\ "outline") flatMap (parseOutline(_))
//  }
//}
