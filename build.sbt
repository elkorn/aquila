name := """aquila"""

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.6",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.2",
  "org.mockito" % "mockito-all" % "1.9.0" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.6" % "test",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test"
)
  