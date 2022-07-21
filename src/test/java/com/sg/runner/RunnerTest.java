package com.sg.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Feature"}
		,glue = {"com.sg.steps","com.sg.hooks"}
		,monochrome = true
		//,publish = true
		,plugin = {"html:target/cucumber-report.html"}
//		,dryRun = true
		,tags = "@addemployee"
		)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
