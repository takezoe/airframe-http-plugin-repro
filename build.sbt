lazy val api =
  project
    .in(file("api"))
    .settings(
      name := "api",
      libraryDependencies ++= Seq(
        "org.wvlet.airframe" %% "airframe-http" % "20.6.2"
      )
    )
    .enablePlugins(AirframeHttpPlugin)

lazy val client =
  project
    .in(file("client"))
    .settings(
      name := "client",
      // sbt-airframe generates HTTP client for Scala
      airframeHttpClients := Seq("com.github.takezoe.api:sync"),
      // Enable debug logging of sbt-airframe
      airframeHttpGeneratorOption := "-l debug"
    )
    .enablePlugins(AirframeHttpPlugin)
    .dependsOn(api)
