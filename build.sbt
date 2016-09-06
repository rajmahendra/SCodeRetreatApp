// Name of the project
name := "SCodeRetreatApp"

organization := "scalafx.coderetreat"

// Project version
version := "1.0.0"

// Version of Scala used by the project
scalaVersion := "2.11.8"

// Add dependency on ScalaFX library
libraryDependencies ++= Seq(
  "org.scalafx" %% "scalafxml-core-sfx8" % "0.2.2",
  "org.scalafx" %% "scalafx" % "8.0.92-R10"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

// Fork a new JVM for 'run' and 'test:run', to avoid JavaFX double initialization problems
fork := true

shellPrompt := { state => System.getProperty("user.name") + ":" + Project.extract(state).currentRef.project + "> " }

