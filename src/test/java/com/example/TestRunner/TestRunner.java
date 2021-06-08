package com.example.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/Features/Product.feature"},
        glue = {"com.example.StepDef"},
        tags = "@test"
)

public class TestRunner extends AbstractTestNGCucumberTests {


}