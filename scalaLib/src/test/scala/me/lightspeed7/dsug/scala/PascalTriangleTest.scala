package me.lightspeed7.dsug.scala.build

import scala.collection.JavaConverters
import me.lightspeed7.dsug.scala.PascalJava
import org.junit.runner.RunWith
import org.scalatest.Finders
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import me.lightspeed7.dsug.scala.OCaptainMyCaptian
import me.lightspeed7.dsug.scala.PascalScala

class PascalTriangleTest extends FunSuite with PascalScala with OCaptainMyCaptian {

  import scala.collection.JavaConverters._

  val rows = 10

  test("Java Iterative") {
    val javaResults = PascalJava.pascalJava(rows);
    val results = javaResults.asScala.map(_.asScala.map(_.toLong).toList).toList

    validateTree(results)
    prettyPrint(results).map(println)
  }

  test("Scala Recursive") {

    val results = (1 to rows).map(r => recursive(r))
    validateTree(results)
    prettyPrint(results).map(println)
  }

  test("O Captain! My Captain!") {

    val results = generate(rows)
    validateTree(results)
    prettyPrint(results).map(println)

  }

  // 
  // validate tree 
  // ////////////////////////
  def validateTree(tree: Seq[Seq[Long]]) {
    tree.map { row =>
      val rowToMatch = row.size match {
        case 1  => Seq(1L)
        case 2  => Seq(1L, 1L)
        case 3  => Seq(1L, 2L, 1L)
        case 4  => Seq(1L, 3L, 3L, 1L)
        case 5  => Seq(1L, 4L, 6L, 4L, 1L)
        case 6  => Seq(1L, 5L, 10L, 10L, 5L, 1L)
        case 7  => Seq(1L, 6L, 15l, 20L, 15L, 6L, 1L)
        case 8  => Seq(1L, 7L, 21L, 35L, 35L, 21L, 7L, 1L)
        case 9  => Seq(1L, 8L, 28L, 56L, 70L, 56L, 28L, 8L, 1L)
        case 10 => Seq(1L, 9L, 36L, 84L, 126L, 126L, 84L, 36L, 1L)
      }
    }
  }
}