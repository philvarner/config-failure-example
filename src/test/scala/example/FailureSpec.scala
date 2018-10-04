package example

import geotrellis.vector.conf.JtsConfig
import org.scalatest._

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

class FailureSpec extends FlatSpec {

  // fails with the global ExecutionContext implicit
  import scala.concurrent.ExecutionContext.Implicits.global

  it should "blow up in config" in {
    Await.result(Future(JtsConfig.precisionModel), 1.minute)
  }
}
