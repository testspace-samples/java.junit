[![Testspace](https://www.testspace.com/img/Testspace.png)](https://www.testspace.com)

***

## Java/JUnit sample for demonstrating Testspace

Sample demonstrates techniques for using Testspace with Java code and the [JUnit](http://junit.org/).
  * Using a Testspace Project that is `connected` with this GitHub Repo
  * Using 3 Online CI services for demonstration purposes only
  * Can review the Results at [testspace-samples:java.junit](https://samples.testspace.com/projects/testspace-samples:java.junit)  
  * Refer to our [Getting Started](https://help.testspace.com/getting-started) help articles for more information

***
Using Multiple Online CI Services:

[![Build Status](https://travis-ci.org/testspace-samples/java.junit.svg?branch=master)](https://travis-ci.org/testspace-samples/java.junit)
[![CircleCI](https://circleci.com/gh/testspace-samples/java.junit.svg?style=svg)](https://circleci.com/gh/testspace-samples/java.junit)
[![Run Status](https://api.shippable.com/projects/5722082e2a8192902e1e3e96/badge?branch=master)](https://app.shippable.com/projects/5722082e2a8192902e1e3e96)

***
Publishing **Test Content** using www.testspace.com.

[![Space Health](https://samples.testspace.com/spaces/816/badge?token=fcc8e5d8cc3c4be1e51436d66b221b28ca53cfed)](https://samples.testspace.com/spaces/816 "Test Cases")
[![Space Metric](https://samples.testspace.com/spaces/816/metrics/790/badge?token=fbb017e5c373db88c2c1abc34a7f399166c7f8dc)](https://samples.testspace.com/spaces/816/schema/Code%20Coverage "Code Coverage (lines)")
[![Space Metric](https://samples.testspace.com/spaces/816/metrics/792/badge?token=ef2d78a844e4c40517f6209d0db0c179db05473c)](https://samples.testspace.com/spaces/816/schema/Static%20Analysis "Static Analysis (issues)")

***

Download and configure the Testspace client 

<pre>
mkdir -p $HOME/bin
curl -s https://testspace-client.s3.amazonaws.com/testspace-linux.tgz | tar -zxvf- -C $HOME/bin
testspace config url samples.testspace.com
</pre>


Build examples:

<pre>
 mvn clean compile
 mvn pmd:pmd 
 mvn cobertura:cobertura -Dcobertura.report.format=xml
</pre>

Push Content using Testspace client 

<pre>
testspace target/pmd.xml [Tests]target/surefire-reports/TEST*.xml target/site/cobertura/coverage.xml
</pre> 