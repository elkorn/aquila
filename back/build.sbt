name := "untitled"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.2",
  "org.scalaj" %% "scalaj-http" % "1.0.1",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.9" % "test",
  "org.mockito" % "mockito-all" % "1.10.19" % "test",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test"
)
