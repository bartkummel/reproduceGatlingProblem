package com.mycompany.myproject

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class PerftestB extends Simulation {
  val testUrl = http.baseURL("http://localhost:9000")
  val scenarioB = scenario("ScenarioB")
    .repeat(1, "n") {
      exec(
        http("Call B ${n}")
          .get("/api/v1")
          .check(status.is(200))
        )
    }

  setUp(scenarioB.inject(atOnceUsers(1))).protocols(testUrl)
}
