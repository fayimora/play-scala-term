name := """play-scala-term"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.webjars" %% "webjars-play" % "2.5.0-4",
  "org.webjars.npm" % "materialize-css" % "0.97.8",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

