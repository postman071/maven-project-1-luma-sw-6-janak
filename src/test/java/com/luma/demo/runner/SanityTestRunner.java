package com.luma.demo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        tags = "@sanity",
        glue = "com/luma/demo",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
        }
)

public class SanityTestRunner {
}
