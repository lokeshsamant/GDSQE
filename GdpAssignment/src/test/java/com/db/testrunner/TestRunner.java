package com.db.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/com/db/features/",
    glue = "com.db.step_def",
    plugin = {
        "pretty",
        "html:test-output",
        "json:target/cucumber-report.json",
        "junit:target/junit_xml/cucumber.xml",
        "html:target/cucumber-reports/cucumber-html-report.html",
        "json:target/cucumber-reports/Cucumber.json"
    },
    monochrome = true,
    tags = "",
    strict = true,
    dryRun = false
)
public class TestRunner {
}