enablePlugins(ScalaJSPlugin)

name := "BasicScalaJS"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0"
)
