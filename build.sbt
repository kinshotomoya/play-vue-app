name := """play-vue-app"""
organization := "kinsho"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  guice,
  evolutions,
  javaJdbc,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.21"
)

