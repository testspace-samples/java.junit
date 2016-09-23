[![Testspace](http://www.testspace.com/public/img/testspace_logo.png)](http://www.testspace.com)
***

## Java/JUnit sample for demonstrating Testspace

Sample demonstrates techniques for using Testspace with Java code and the [JUnit](http://junit.org/).

***
Using Multiple Online CI Services:

[![Build Status](https://travis-ci.org/testspace-samples/java.junit.svg?branch=master)](https://travis-ci.org/testspace-samples/java.junit)
[![CircleCI](https://circleci.com/gh/testspace-samples/java.junit.svg?style=svg)](https://circleci.com/gh/testspace-samples/java.junit)
[![Run Status](https://api.shippable.com/projects/5722082e2a8192902e1e3e96/badge?branch=master)](https://app.shippable.com/projects/5722082e2a8192902e1e3e96)

***
Publishing **Test Content** using www.testspace.com.

[![Space Health](https://samples.testspace.com/projects/124/spaces/454/badge)](https://samples.testspace.com/projects/124/spaces/454 "Test Cases")
[![Space Metric](https://samples.testspace.com/projects/124/spaces/454/metrics/293/badge)](https://samples.testspace.com/spaces/454/schema/Code%20Coverage "Code Coverage (branches)")
[![Space Metric](https://samples.testspace.com/projects/124/spaces/454/metrics/295/badge)](https://samples.testspace.com/spaces/454/schema/Code%20Coverage "Code Coverage (methods)")
[![Space Metric](https://samples.testspace.com/projects/124/spaces/454/metrics/332/badge)](https://samples.testspace.com/spaces/454/schema/Static%20Analysis "Static Analysis (issues)")


***

Build examples:

<pre>
 mvn clean compile
 mvn pmd:pmd 
 mvn cobertura:cobertura -Dcobertura.report.format=xml
</pre>

Publishing results example:

<pre>
testspace target/pmd.xml [Tests]target/surefire-reports/TEST*.xml target/site/cobertura/coverage.xml $TESTSPACE_TOKEN/$BRANCH_NAME
</pre>

Checkout the [Space](https://samples.testspace.com/projects/java.junit).

***

To replicate this sample: 
  - Account at www.testspace.com.
  - CI Environment Variable called **TESTSPACE_TOKEN** required:
    -  `TESTSPACE_TOKEN` = `credentials@my-org-name.testspace.com/my-project`
    - `credentials` set to `username:password` or your [access token](http://help.testspace.com/reference:client-reference#login-credentials).
    - `my-org-name.testspace.com/my-project` based on your *organization* (subdomain) and *project* names.  


 