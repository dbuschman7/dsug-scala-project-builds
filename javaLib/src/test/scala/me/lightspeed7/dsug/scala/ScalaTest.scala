package me.lightspeed7.dsug.scala

import scala.collection.JavaConversions
import scala.collection.JavaConverters
import org.junit.Test
import org.junit.runner.RunWith
import org.scalatest.Matchers._
import org.scalatest.Suite
import org.scalatest.junit.AssertionsForJUnit
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ScalaTest extends Suite with AssertionsForJUnit {

  import scala.collection.JavaConversions._
  import scala.collection.JavaConverters._

  // http://www.scalatest.org/user_guide/matchers_quick_reference

  // selecting a style -- 
  // http://www.scalatest.org/user_guide/selecting_a_style

  val l = 1L
  val d = 1.0
  val seq = Seq(1, 2, 3, 4)
  val set = Set(1, 3, 2)
  val jList: java.util.List[String] = List("a", "b", "c").asJava

  @Test
  def testExamples: Unit = {

    l should be(1)
    l should not be (2)

    d should be(1.0 +- 0.001)

    seq should have size 4
    seq should equal(Seq(1, 2, 3, 4))

    set should equal(Set(1, 2, 3))
  }

  @Test
  def testWithAssertions {
    assert(true)
    assert(1 == 1)
  }

  // Junit 3 style, no annotation here, BEWARE !! 
  def testExample {
    File.sayHello("DaVe.") should be("Hello DaVe.")
  }

}