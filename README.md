[![Testspace](http://www.testspace.com/public/img/testspace_logo.png)](http://www.testspace.com)
***

## Java/JUnit sample for demonstrating Testspace

Sample demonstrates techniques for using Testspace with Java code and the [JUnit](http://junit.org/).

***

[![Build Status](https://travis-ci.org/testspace-samples/java.junit.svg?branch=master)](https://travis-ci.org/testspace-samples/java.junit)
[![Space Health](https://samples.testspace.com/projects/88/spaces/294/badge)](https://samples.testspace.com/projects/88/spaces/294 "Test Cases")
[![Space Metric](https://samples.testspace.com/projects/88/spaces/294/metrics/236/badge)](https://samples.testspace.com/projects/88/spaces/294/metrics#metric-236 "Line/Statement Coverage")

***

Build examples:

<pre>
 mvn clean compile
 mvn cobertura:cobertura -Dcobertura.report.format=xml
</pre>

Publishing results example:

<pre>
 testspace publish target/surefire-reports/TEST*.xml target/site/cobertura/coverage.xml
</pre>

Checkout the [Space](https://samples.testspace.com/projects/java/spaces/junit).

***

To fork this example using Travis requires:
  - Account at www.testspace.com.
  - Travis Environment Variable: 
    - `TESTSPACE_URL` = `credentials:@my-org-name.testspace.com/my-project/my-space`
    - `credentials` set to `username:password` or your [access token](http://help.testspace.com/using-your-organization:user-settings).
    - `my-org-name.testspace.com/my-project/my-space` based on your subdomain, project, and space names. Refer [here](http://help.testspace.com/reference:runner-reference#login-credentials) for more details. 
