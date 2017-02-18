[![Testspace](http://www.testspace.com/img/Testspace.png)](http://www.testspace.com)

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

[![Space Health](https://samples.testspace.com/spaces/816/badge)](https://samples.testspace.com/spaces/816 "Test Cases")
[![Space Metric](https://samples.testspace.com/spaces/816/metrics/789/badge)](https://samples.testspace.com/spaces/816/schema/Code%20Coverage "Code Coverage (branches)")
[![Space Metric](https://samples.testspace.com/spaces/816/metrics/791/badge)](https://samples.testspace.com/spaces/816/schema/Code%20Coverage "Code Coverage (methods)")
[![Space Metric](https://samples.testspace.com/spaces/816/metrics/792/badge)](https://samples.testspace.com/spaces/816/schema/Static%20Analysis "Static Analysis (issues)")


***

Build examples:

<pre>
 mvn clean compile
 mvn pmd:pmd 
 mvn cobertura:cobertura -Dcobertura.report.format=xml
</pre>

Push Content using **Testspace client**: 

<pre>
curl -s https://testspace-client.s3.amazonaws.com/testspace-linux.tgz | sudo tar -zxvf- -C /usr/local/bin
testspace @.testspace.txt $TESTSPACE_TOKEN/$GITHUB_ORG:$REPO_NAME/$BRANCH_NAME#$BUILD_NUMBER
</pre> 

Checkout the published [Test Content](https://samples.testspace.com/projects/testspace-samples:java.junit). Note that the `.testspace.txt` file contains the [set of files](http://help.testspace.com/how-to:publish-content#publishing-via-content-list-file) to publish. 

***

To replicate this sample: 
  - Setup account at www.testspace.com.
  - Create a Environment variable called `TESTSPACE_TOKEN`
     - `TESTSPACE_TOKEN` = `credentials@Your-Org-Name.testspace.com`
     - `credentials` set to `username:password` or your [access token](http://help.testspace.com/reference:client-reference#login-credentials)
     - To [use Testspace with a CI system](http://help.testspace.com/how-to:add-to-ci-workflow), store `TESTSPACE_TOKEN` as a secure environment variable
 
 
