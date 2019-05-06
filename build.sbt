sbtPlugin := true

name         := "sbt-s3-resolver"
organization := "com.miodx.sbt.plugins"
version      := "0.19.0"
description  := "SBT plugin which provides Amazon S3 bucket resolvers"
//bucketSuffix := "era7.com"

//javaVersion  := "1.8"
scalaVersion := "2.12.8"
sbtVersion   := "1.2.8"

resolvers += Resolver.jcenterRepo
libraryDependencies += "com.miodx.sbt.plugins" %% "ivy-s3-resolver" % "0.13.0"

//bintrayReleaseOnPublish := !isSnapshot.value
//bintrayOrganization     := Some(organization.value)
//bintrayPackageLabels    := Seq("sbt-plugin", "s3", "resolver")

publishMavenStyle := false
//publishTo := (publishTo in bintray).value
