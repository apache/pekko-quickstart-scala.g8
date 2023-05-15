// This build is for this Giter8 template.
// To test the template run `g8` or `g8Test` from the sbt session.
// See https://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.
lazy val root = (project in file("."))
  .settings(
    name := "pekko-scala-seed",
    Test / test := {
      val _ = (Test / g8Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-XX:MaxMetaspaceSize=256m", "-Xss2m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)
  )

import org.apache.pekko.PekkoParadoxPlugin.autoImport._

def themeSettings = Seq(
  // allow access to snapshots for pekko-sbt-paradox
  resolvers += Resolver.ApacheMavenSnapshotsRepo,
  pekkoParadoxGithub := Some("https://github.com/apache/incubator-pekko-quickstart-scala.g8"))

// Documentation for this project:
//    sbt "docs/paradox"
//    open docs/target/paradox/site/main/index.html
lazy val docs = (project in file("docs"))
  .enablePlugins(ParadoxPlugin, PekkoParadoxPlugin)
  .disablePlugins(Giter8Plugin)
  .settings(themeSettings)
