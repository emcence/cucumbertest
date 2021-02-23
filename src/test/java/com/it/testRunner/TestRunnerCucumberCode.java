package com.it.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/AP_Stages.feature",
                glue = {"com.it.code", "com.it.pop"},
                plugin = {"pretty", "html:target/cucumber-reports.html"})
public class TestRunnerCucumberCode {
}
