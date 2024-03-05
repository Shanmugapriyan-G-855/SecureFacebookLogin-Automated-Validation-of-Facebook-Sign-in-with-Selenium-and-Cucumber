package org.stepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.sample", monochrome = true, dryRun = false, plugin = {"json:target/cucumber.json", "html:target/cucumber-html-report"})

public class RunnerClass {

}
