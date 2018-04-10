
lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.12.5",
  organization := "org.leo",
  test in assembly := {},
  logLevel := Level.Warn,
  logLevel in assembly := Level.Error
)

lazy val ddl2thf = (project in file(".")).
  settings(commonSettings:_*).
  settings(
    name := "DDL2THF",
    description := "A semantical embedding tool for Carmo/Jones DDL.",
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.0" % "test"),
    mainClass in (Compile, run) := Some("leo.modules.embedding.DDL2THFLauncher"),
    mainClass in assembly := Some("leo.modules.embedding.DDL2THFLauncher"),
    mainClass in (Compile, packageBin) := Some("leo.modules.embedding.DDL2THFLauncher"),
    assemblyJarName in assembly := "ddl2thf.jar",
    exportJars := true,
  )
