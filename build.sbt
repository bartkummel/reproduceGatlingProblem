name := """reproduce-gatling-bug"""

scalaVersion := "2.11.11"

val gatlingV = "2.2.4"

libraryDependencies ++= {
  Seq(
    "io.gatling.highcharts"    % "gatling-charts-highcharts"  % gatlingV       % "it",
    "io.gatling"               % "gatling-test-framework"     % gatlingV       % "it"
  )
}

lazy val reproduceGalingBug = project.in(file("."))
  .enablePlugins(GatlingPlugin)
  .configs(IntegrationTest)

fork in run := false

fork in Test := true

