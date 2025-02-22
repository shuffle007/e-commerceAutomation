package com.utilities;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeActions {
	
	@Before																//Before action will run before executing any scenario 
	public void beforeActions(Scenario scen){							//Get cucumber scenario parameter for feature file name
		System.out.println("--->>>> Initializing Driver....");			
		SetupDrivers.setupDriver();										//Calling setup driver method to execute before scenario
		System.out.println("Test Scenario Name : " + scen.getName());
	}

}