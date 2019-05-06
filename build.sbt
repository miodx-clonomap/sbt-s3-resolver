sbtPlugin := true

name := "sbt-s3-resolver"
organization := "com.miodx.sbt.plugins"
version      := "0.15.0"
description  := "SBT plugin which provides Amazon S3 bucket resolvers"

//javaVersion := "1.7"
scalaVersion := "2.10.7"

//bucketSuffix := "era7.com"

libraryDependencies += "com.miodx.sbt.plugins" %% "ivy-s3-resolver" % "0.9.0"

//wartremoverErrors in (Compile, compile) --= Seq(Wart.Any, Wart.NonUnitStatements)
