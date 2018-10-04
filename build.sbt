lazy val root = (project in file("."))
  .withId("test")
  .settings(
    name := "Test",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % "test",
      "com.vividsolutions" % "jts-core" % "1.14.0",
      "com.github.pureconfig" %% "pureconfig" % "0.9.2"
    ),
    inThisBuild(
      List(
        organization := "com.example",
        scalaVersion := "2.12.6",
        scalacOptions ++= Seq("-target:jvm-1.8", "-unchecked", "-deprecation")
      ))
  )
