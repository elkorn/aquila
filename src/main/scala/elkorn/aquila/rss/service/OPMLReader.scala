package elkorn.aquila.rss.service

import java.net.URL

import elkorn.aquila.rss.model.Feed

import scala.io.{BufferedSource, Source}
import scala.xml.{Node, XML}

/**
 * Created by elkorn on 12/4/14.
 */
object ResourceOPMLReader {
  def apply() = new ResourceOPMLReader
}

object OPMLReader {

}

abstract class OPMLReader {
  def getSource(path: String): BufferedSource


  def tryUrlAttr(node: Node, s: String): Option[URL] = {
    val result = node \ s"@$s"
    if (result.isEmpty) None
    else Some(new URL(result.text))
  }

  def parseOutline(node: Node): Option[Feed] =
    if (node \ "@xmlUrl" isEmpty) None
    else Some(Feed(node \ "@text" text, (node \ "@count").text.toInt, new URL(node \ "@xmlUrl" text), tryUrlAttr(node, "htmlUrl")))

  def parse(sourcePath: String): Seq[Feed] = {
    val document = XML.load(getSource(sourcePath).bufferedReader())
    (document \\ "outline") flatMap (parseOutline(_))
  }
}

class ResourceOPMLReader extends OPMLReader {
  override def getSource(resourcePath: String) = Source.fromURL(getClass.getResource(resourcePath))
}
