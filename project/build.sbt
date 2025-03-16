scalacOptions := Seq(
  "-deprecation"
)

resolvers +=
  "Sonatype OSS Snapshots".at("https://s01.oss.sonatype.org/content/repositories/snapshots")

// For MimeLoader plugin. Dogfooding and hoping it doesn't clash with
// our other sbt plugins.
libraryDependencies ++= List(
  "com.eed3si9n" %% "treehugger" % "0.4.4",
  "io.circe" %% "circe-generic" % "0.14.8",
  "org.http4s" %% "http4s-ember-client" % "0.23.30",
  "org.http4s" %% "http4s-circe" % "0.23.30",
  "pink.cozydev" %% "protosearch-laika" % "0.0-fd3e8b2-SNAPSHOT",
)
