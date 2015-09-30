import sbt._
//import Keys._
import sbt.Keys._
import java.io.PrintWriter
import java.io.File
import play.Play.autoImport._
import sys.process.stringSeqToProcess

object ApplicationBuild extends Build {

  lazy val commonSettings = Seq(
    organization := "me.lightspeed.dsug",
    version := "0.0.1",
    scalaVersion := "2.11.7")

  val dependencies = Seq("org.scala-lang" % "scala-library" % "2.11.7")

  val javaJar = Project("javaLib", file("javaLib"))
    .settings(commonSettings: _*)

  val scalaJar = Project("scalaLib", file("scalaLib"))
    .settings(commonSettings: _*)
    .settings(libraryDependencies ++= dependencies)
    .dependsOn(javaJar % "test->test;compile->compile")

  val playApp = Project("playApp", file("playApp"))
    .enablePlugins(play.PlayScala)
    .settings(commonSettings: _*)
    .settings(libraryDependencies ++= dependencies)
    .dependsOn(
      javaJar % "test->test;compile->compile",
      scalaJar % "test->test;compile->compile" //
      )

  val root = Project("build", file("."))
    .aggregate(javaJar, scalaJar, playApp)

  println("Done")
}
