package com.neonsense.selenium_project;

import org.junit.Test;

public class BaseClassTestCases {
		
	@Test
	public void testVisitWebsite() throws InterruptedException {
		BaseClass testOne = new BaseClass();
		testOne.spendAndSave();
	}
}
