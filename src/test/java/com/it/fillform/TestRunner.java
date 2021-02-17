package com.it.fillform;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/HP_Links.feature",
                glue = {"com.it.code", "com.it.domasna"},
                plugin = {"pretty", "html:target/cucumber-reports"})
public class TestRunner {
}
