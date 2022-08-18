name := "$name$"
version := "$version$"
scalaVersion := "$scalaVersion$"

libraryDependencies += ("org.apache.spark" %% "spark-sql" % "$sparkVersion$" % "provided") cross CrossVersion.for3Use2_13
libraryDependencies += ("org.scalacheck" %% "scalacheck" % "$scalacheckkVersion$"% "test") cross CrossVersion.for3Use2_13

// include the 'provided' Spark dependency on the classpath for `sbt run`
Compile / run := Defaults
  .runTask(
    Compile / fullClasspath,
    Compile / run / mainClass,
    Compile / run / runner
  )
  .evaluated
