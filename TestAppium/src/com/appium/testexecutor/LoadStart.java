package com.appium.testexecutor;

import org.junit.Test;

import com.appium.actionabletestscenarios.ActionableTest;

public class LoadStart {

	// Executor class where @Test will be declared so as to execute
	
	@Test
	public void testActionable() {
		ActionableTest.loginlogout();
	}
}
