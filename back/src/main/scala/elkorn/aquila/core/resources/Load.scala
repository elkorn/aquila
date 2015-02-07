package elkorn.aquila.core.resources

trait Load[TAddress, TResult, TResolver] {
  val address: TAddress
  def resolve(downloadResolver: TResolver): TResult
}
