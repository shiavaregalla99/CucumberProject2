package com.xyz.hrms.Steps;

import com.xyz.hrms.Base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void beforeScenario() {
		BaseClass.setUp();
	}
	@After
	public void afterScenario() {
		BaseClass.tearDown();
	}

}
