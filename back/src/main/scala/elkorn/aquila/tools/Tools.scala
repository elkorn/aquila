package elkorn.aquila.tools

/**
 * For lack of a better idea for structuring this, let it be as such for now.
 */
object Tools {
  def assumeOpt[T](value: Option[T])
      (predicate: T => Boolean): Unit =
    assumeOpt(value, predicate, None)

  def assumeOpt[T](
    value: Option[T],
    message: String)
      (predicate: T => Boolean)
  : Unit =
    assumeOpt(value, predicate, Some(message))

  private def assumeOpt[T](
    value: Option[T],
    predicate: T => Boolean,
    message: Option[String] = None) =
    if (message.isDefined) assume(predicate(value.get), message.get)
    else assume(predicate(value.get))
}
