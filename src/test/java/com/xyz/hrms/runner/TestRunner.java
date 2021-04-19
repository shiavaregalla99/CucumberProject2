package com.xyz.hrms.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/loginDataDriven.feature"
,monochrome=true,
//dryRun=true,
glue="com.xyz.hrms.Steps"
,tags= {"@Smoke"},
plugin= {
		"pretty",//prints gherkin steps in console
		"html:target/cucumber-default-report",//create basic html report in specified location
		"json:target/cucumber.json"
		
}
)
public class TestRunner {

}
