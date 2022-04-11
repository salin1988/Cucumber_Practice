package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=true,
		features= {"src/test/resources/com/basic/FirstFeatureFileFF/"},
		glue={"com/basic/FirstFeatureFile"},
								
		plugin={"pretty",
				"html:target/cucumber-htmlreport2.html",
				"json:target/cucumber-report2.json",		
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/Extent_report2.html"
		}
		
		)
public class RunMyFirstFeatureTest {

}
