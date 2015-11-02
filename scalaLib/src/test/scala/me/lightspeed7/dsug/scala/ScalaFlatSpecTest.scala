package me.lightspeed7.dsug.scala

import org.scalatest.FlatSpec

class ScalaFlatSpecTest extends FlatSpec {

  // style 1
  behavior of "An empty Set"

  it should "have size 0" in {
    assert(Set.empty.size === 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }

  // style 2
  "An empty Set" should "have size 0 (2nd)" in {
    assert(Set.empty.size === 0)
  }

}