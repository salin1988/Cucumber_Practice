package com.basic.multiplescenarioSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		//publish=true,
		monochrome=true,
		//dryRun=true,
		features= {"src/test/resources/com/basic/multiplescenarioFF/"},
		glue={"com/basic/multiplescenarioSD"},
								
		plugin={"pretty",
				"html:target/cucumber-htmlreport.html",
				"json:target/cucumber-report.json",	
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/Extent_report3.html"
		}
		
		)
public class RunMymultipleScenarioTest {

}
