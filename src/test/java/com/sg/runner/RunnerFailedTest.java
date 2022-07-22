package com.sg.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"@target/rerun.txt"}
		,glue = {"com.sg.steps","com.sg.hooks"}
		,monochrome = true
		//,publish = true
		,plugin = {"rerun:target/rerun.txt","html:target/cucumber-report.html"}
		//,dryRun = true
		,tags = "@login"
		)

public class RunnerFailedTest extends AbstractTestNGCucumberTests {

}
