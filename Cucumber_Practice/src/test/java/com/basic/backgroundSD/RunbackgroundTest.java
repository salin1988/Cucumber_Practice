package com.basic.backgroundSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		//publish=true,
		monochrome=true,
		//dryRun=true,
		features= {"src/test/resources/com/basic/backgroundFF/"},
		glue={"com/basic/backgroundSD"},
								
		plugin={"pretty",
				"html:target/cucumber-htmlreport1.html",
				"json:target/cucumber-report1.json",	
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/Extent_report1.html"
		}
		
		)
public class RunbackgroundTest {

}
