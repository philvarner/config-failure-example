val logging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
val scalatest = "org.scalatest" %% "scalatest" % "3.0.5"
val scalacheck = "org.scalacheck" %% "scalacheck" % "1.14.0"

val apacheMath = "org.apache.commons" % "commons-math3" % "3.6.1"

val chronoscala = "jp.ne.opt" %% "chronoscala" % "0.1.6"

val awsSdkS3 = "com.amazonaws" % "aws-java-sdk-s3" % "1.11.319"

val catsCore = "org.typelevel" %% "cats-core" % "1.1.0"
val catsEffect = "org.typelevel" %% "cats-effect" % "0.10.1"

val fs2Core = "co.fs2" %% "fs2-core" % "0.10.4"
val fs2Io = "co.fs2" %% "fs2-io" % "0.10.4"

val avro = "org.apache.avro" % "avro" % "1.8.2"

val slickPG = "com.github.tminglei" %% "slick-pg" % "0.15.0"

val parserCombinators = "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0"

val jsonSchemaValidator = "com.networknt" % "json-schema-validator" % "0.1.19"

val scaffeine = "com.github.blemale" %% "scaffeine" % "2.5.0"

lazy val root = (project in file("."))
  .withId("test")
  .settings(
    name := "Test",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % "test",
      "com.vividsolutions" % "jts-core" % "1.14.0",
      "com.github.pureconfig" %% "pureconfig" % "0.9.1"
    ),
    inThisBuild(
      List(
        organization := "com.example",
        scalaVersion := "2.12.6",
        scalacOptions ++= Seq("-target:jvm-1.8", "-unchecked", "-deprecation")
      ))
  )
