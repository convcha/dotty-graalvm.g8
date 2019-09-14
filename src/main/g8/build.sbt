val dottyVersion = "0.18.1-RC1"

enablePlugins(GraalVMNativeImagePlugin)
graalVMNativeImageOptions ++= Seq(
      "--initialize-at-build-time",
    )

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-graalvm-simple",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
