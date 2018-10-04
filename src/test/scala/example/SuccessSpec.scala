package example

import java.util.concurrent.Executors

import geotrellis.vector.conf.JtsConfig
import org.scalatest._

import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext, Future}

class SuccessSpec extends FlatSpec {

  // succeeds with a locally-defined one
  implicit val ec: ExecutionContext =
    ExecutionContext.fromExecutor(Executors.newFixedThreadPool(1))

  it should "successful config" in {
    Await.result(Future(JtsConfig.precisionModel), 1.minute)
  }
}
