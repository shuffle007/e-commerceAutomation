package com.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import com.utilities.SetupDrivers;

public class AfterActions {
	
	@After
	public void afterActions(Scenario Scenario) throws Exception{
		
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
	}
}