package elkorn.aquila.core.resources

/**
 * Created by elkorn on 2/6/15.
 */
trait Load[TResult, TResolver] {
  def resolve(downloadResolver: TResolver): TResult
}
