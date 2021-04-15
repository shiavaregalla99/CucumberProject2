package com.xyz.hrms.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/loginDataDriven.feature"
,monochrome=true,
//dryRun=true,
glue="com.xyz.hrms.Steps"
,tags= {"@Smoke"}
)
public class TestRunner {

}
