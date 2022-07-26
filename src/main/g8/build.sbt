name := "$name$"
version := "$version$"
scalaVersion := "$scalaVersion$"

libraryDependencies += ("org.apache.spark" %% "spark-sql" % "$sparkVersion$" % "provided")
  .cross(CrossVersion.for3Use2_13)

libraryDependencies += ("org.scalactic" %% "scalactic" % "$scalatestVersion$")
  .cross(CrossVersion.for3Use2_13)
libraryDependencies += ("org.scalatest" %% "scalatest" % "$scalatestVersion$" % "test")
  .cross(CrossVersion.for3Use2_13)

// include the 'provided' Spark dependency on the classpath for `sbt run`
Compile / run := Defaults
  .runTask(
    Compile / fullClasspath,
    Compile / run / mainClass,
    Compile / run / runner
  )
  .evaluated
