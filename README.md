# Reproduce Gatling problem

Minimal project to reproduce the problem described at https://github.com/gatling/gatling/issues/3360#issuecomment-334490210

## Steps to reproduce the problem:

Run
```bash
sbt gatling-it:testOnly com.mycompany.myproject.PerftestB
```

Examine the logs and note that bote PerftestA and PerftestB are being run. (The tests will fail unless you have some server running at port 9000 on localhost. Having the tests succeed is not essential for reproducing the problem.)
