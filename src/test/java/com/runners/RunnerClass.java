package com.runners;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import com.cucumber.listener.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
				features = { "src/test/resources/FeatureFiles" }, 
				glue = { "com.upskill.stepDef", "com.utilities" }, 
				tags = "@regression", 
				plugin = {
				        "pretty", // provides additional information to the reports 
				        "html:target/cucumber-html-report.html",
				        "json:target/cucumber-report.json",
				        //"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports.html" 
				        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				        "timeline:target/cucumber"
				    	},
				monochrome = true	// provides more readability from the console output
				) 


public class RunnerClass extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
//	@AfterClass
//	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File("config/config.xml"));
//	}

} 