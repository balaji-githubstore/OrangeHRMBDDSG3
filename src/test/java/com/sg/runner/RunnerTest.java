package com.sg.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/feature/Login.feature"}
		,glue = {"com.sg.steps"}
		,monochrome = true
		,publish = false
		,plugin = {"html:target/cucumber-report.html"}
		//,dryRun = true
		)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
