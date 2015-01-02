package elkorn.aquila.service.test.utilities

import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, BeforeAndAfterEach, Matchers, WordSpecLike}

/**
 * Aggregates basic functionalities used in all specs.
 */
trait Spec extends WordSpecLike with Matchers with BeforeAndAfterAll with BeforeAndAfterEach with MockitoSugar {

}
