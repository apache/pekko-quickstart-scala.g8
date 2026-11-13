import sbt._
import sbt.Keys._

/** Keep import diagnostics local to projects where SemanticDB is enabled. */
object OrganizeImportsPlugin extends AutoPlugin {
  override def requires = scalafix.sbt.ScalafixPlugin
  override def trigger = allRequirements

  override def projectSettings: Seq[Def.Setting[_]] = Seq(
    scalacOptions ++= {
      if (semanticdbEnabled.value) Seq("-Wunused:imports") else Nil
    })
}
