package com.mycompany.myproject

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class PerftestA extends Simulation {
  val testUrl = http.baseURL("http://localhost:9000")
  val scenarioA = scenario("ScenarioA")
    .repeat(1, "n") {
      exec(
        http("Call A ${n}")
          .get("/api/v1")
          .check(status.is(200))
        )
    }

  setUp(scenarioA.inject(atOnceUsers(1))).protocols(testUrl)
}
